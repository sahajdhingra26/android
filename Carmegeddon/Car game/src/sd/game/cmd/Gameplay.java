
package sd.game.cmd;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import carz.pkg.game.R;

public class Gameplay extends Activity implements SensorEventListener{
public static final String TAG= Gameplay.class.getSimpleName();




//Countdowntimer class object 
private Mycount countdown;
private Mycount_level levelup_count;
private Mycount_alert alert_timer;
private Mycount_guns guns_activated_timer;
// sensor-related
 private SensorManager mSensorManager;
 private Sensor mAccelerometer;
 
 // animated view
 private ShapeView mShapeView;

 // screen size
 private int mWidthScreen;
 private int mHeightScreen;
 
 // motion parameters
 private final float FACTOR_FRICTION = .5f; // imaginary friction on the screen
 private final float GRAVITY = 9.8f; // acceleration of gravity
 private double mAx; // acceleration along x axis
 private float mAy; // acceleration along y axis
 private final float mDeltaT = 0.5f; // imaginary time interval between each acceleration updates

 
Bitmap bck1,bck2,bck3,car2,car3,car5,car7,carf,carb,carr,carl,carw,bmp,gunsym,gun,tank,alert,missile,bmpburn;
int i=0,j=-2,k,bmp_ux,bmp_uy,bmp_dx,bmp_dy,p,q,dent_x,dent_y,flag=0,flag1=0,flag2=0,flag3=0,flag4=0,bmp_height,sprite_endf,sprite_endg,gun_anim,dent=0,denthit=0,explode_end;
char d,e;
float tempi=-100,tempj=-330,tempk=-450,templ=-650,tempm=-400,car2_ux,car2_uy,car2_dx,car2_dy;
float car3_ux,car3_uy,car3_dx,car3_dy,car5_ux,car5_uy,car5_dx,car5_dy,car7_ux,car7_uy,car7_dx,car7_dy,tank_ux,tank_uy,tank_dx,tank_dy,gunsym_dx,gunsym_dy,gunsym_ux,gunsym_uy;
 float test,test1;
int score;
int level,levelup_display=0,level_flag1,level_flag2;
float bmp_currentx;

int lane=2,lane_width,lane_div1,lane_div2,lane_div3,lane_div4;
int scratch=0;
float mAz;
long l,tempo=0;

int alert_x=500,alert_temp=0,alert_count=0,alert_flag,alert_timer_flag;
int missile_y,missile_ux,missile_dx,missile_uy,missile_dy;

int flag5,flag6,flag7;
int explode_count;
int guns_activated;

int accelero_disable=0;
int alert_end=0;
@Override
 public void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 Log.d(TAG, "oncreate called"); 
 
  bmp = BitmapFactory.decodeResource(getResources(), R.drawable.car);
  bmpburn = BitmapFactory.decodeResource(getResources(), R.drawable.bmpburn);
  bck1 = BitmapFactory.decodeResource(getResources(), R.drawable.road4);
  bck2 = BitmapFactory.decodeResource(getResources(), R.drawable.road4);
  bck3 = BitmapFactory.decodeResource(getResources(), R.drawable.road4);
  car2 = BitmapFactory.decodeResource(getResources(), R.drawable.car2);
  car3 = BitmapFactory.decodeResource(getResources(), R.drawable.car3);
  car5 = BitmapFactory.decodeResource(getResources(), R.drawable.car5);
  car7 = BitmapFactory.decodeResource(getResources(), R.drawable.car7);
  carf=BitmapFactory.decodeResource(getResources(), R.drawable.carfrontwrecked);
  carb=BitmapFactory.decodeResource(getResources(), R.drawable.carbackwrecked);
  carr=BitmapFactory.decodeResource(getResources(), R.drawable.carrightwrecked);
  carl=BitmapFactory.decodeResource(getResources(), R.drawable.carleftwrecked);
  carw=BitmapFactory.decodeResource(getResources(), R.drawable.cardestroyed);
  gunsym=BitmapFactory.decodeResource(getResources(), R.drawable.gunsymbol);
  gun=BitmapFactory.decodeResource(getResources(), R.drawable.gun);
  tank = BitmapFactory.decodeResource(getResources(), R.drawable.tank2);
  alert = BitmapFactory.decodeResource(getResources(), R.drawable.alert);
  missile=BitmapFactory.decodeResource(getResources(), R.drawable.missile);
  
  
  // set the screen always portait
 setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

 // initializing sensors
 mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
 mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

 // obtain screen width and height
 Display display = ((WindowManager)this.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
 mWidthScreen = display.getWidth();
 mHeightScreen = display.getHeight();
 k=-mHeightScreen;
 // initializing the view that renders the ball
 //Thread_bck thread =new Thread_bck(this);
 mShapeView = new ShapeView(this);
 mShapeView.setOvalCenter((int)(mWidthScreen * 0.6), (int)(mHeightScreen * 0.9));
missile_y=mHeightScreen;
 setContentView(mShapeView);
 getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
 
 }

@Override
 public void onAccuracyChanged(Sensor sensor, int accuracy) {
Log.d(TAG, " hello");
 }

@Override
 public void onSensorChanged(SensorEvent event) {
 // obtain the three accelerations from sensors

mAx = event.values[0];
mAy = event.values[1];
mAz = event.values[2];

if(accelero_disable==1)
{
	mAx = 0;
	mAy = 0;
	mAz = 0;
}
	
mAx = Math.signum(mAx) * Math.abs(mAx) * (1 - FACTOR_FRICTION * Math.abs(mAz) / GRAVITY);


l=event.timestamp/1000000000;

if(l>tempo)
{
	
	tempo=l;
}




 
 // taking into account the frictions
/**********************88try**************************************/





//mAx = mAx * (1 - FACTOR_FRICTION * Math.abs(mAz) / GRAVITY);







//mAy = Math.signum(mAy) * Math.abs(mAy) * (1 - FACTOR_FRICTION * Math.abs(mAz) / GRAVITY);
 }

 @Override
 protected void onResume() {
 super.onResume();
 // start sensor sensing
 mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_GAME);
 }

@Override
 protected void onPause() {
 super.onPause();
 // stop senser sensing
 mSensorManager.unregisterListener(this);
 }


@Override
protected void onStop()
{  super.onStop();
	countdown.cancel();
	Log.d(TAG, "Stop called");
    levelup_count.cancel();
    alert_timer.cancel();
    guns_activated_timer.cancel();
    
    /*Intent intent=new Intent(this,score_view.class);
    intent.putExtra("Sahaj", score);
    startActivity(intent);*/
	
    mShapeView.stop();
    
	
}

@Override
protected void onDestroy()
{  
	super.onDestroy();
	
}

 



// the view that renders the ball
 private class ShapeView extends SurfaceView implements SurfaceHolder.Callback{

private final int RADIUS = bmp.getWidth()/2;
 
//bouncing factor
private final float FACTOR_BOUNCEBACK = 0.0f;

 private int mXCenter;
 
 private RectF mRectF;
 private final Paint mPaint;
 public ShapeThread mThread;

 private float mVx;
 
 private Animation elaine,sprite_ob,gunanim,explode;

 
 
 
 public void stop()
 {
	 mThread.setRunning(false);
	 
	 finish();
 }
 
 
 
 //constructor
 public ShapeView(Context context) {
 super(context);


 
 

 
 
 
 elaine = new Animation(
			BitmapFactory.decodeResource(getResources(), R.drawable.spritee) 
			, 0, 0	// initial position
			, 180, 400	// width and height of sprite
			, 5, 5);	// FPS and number of frames in the animation


 sprite_ob = new Animation(
			BitmapFactory.decodeResource(getResources(), R.drawable.gameover) 
			, 0-mWidthScreen/2, 0	// initial position
			, 4176, 900	// width and height of sprite
			, 1, 4);	// FPS and number of frames in the animation
 
 
 gunanim = new Animation(
			BitmapFactory.decodeResource(getResources(), R.drawable.gunanimation) 
			, 100, 100	// initial position
			, 460, 23	// width and height of sprite
			, 1, 5);	// FPS and number of frames in the animation
 
 
 explode=new Animation(
			BitmapFactory.decodeResource(getResources(), R.drawable.explosion) 
			, 100, 100	// initial position
			, 1376, 159	// width and height of sprite
			, 4, 8);	// FPS and number of frames in the animation
 
 countdown =new Mycount(4000,1000);
 
 levelup_count=new Mycount_level(3000,1000);
 alert_timer=new Mycount_alert(4000,1000);
 guns_activated_timer=new Mycount_guns(10000,1000);
 
 
 
 
 
 getHolder().addCallback(this);
 mThread = new ShapeThread(getHolder(), this);
 setFocusable(true);

 mPaint = new Paint();
 mPaint.setColor(0xFFFFFFFF);
 mPaint.setAlpha(192);             //Helper to setColor(), that only assigns the color's alpha value, leaving its r,g,b values unchanged. 
                                   //Results are undefined if the alpha value is outside of the range [0..255]
 mPaint.setStyle(Paint.Style.FILL);
 //used for smoothing the edges of the shape
 mPaint.setAntiAlias(true);
// creating a rectangle
 mRectF = new RectF();
 }

// set the position of the ball
 public boolean setOvalCenter(int x, int y)
 {
 mXCenter = x;
  return true;
 }

 // calculate and update the ball's position
 public boolean updateOvalCenter()
 {
 
	 test=3;
	 Log.d(TAG, "mAx="+mAx+"mXcentre="+mXCenter);
	 
test1=test/10;


mVx -= mAx * mDeltaT; // speed mvx=acceralation max * time mdeltat

if(mVx==0)
{
	Log.d(TAG, "trolld "+mVx);
}
 //mVy += mAy * mDeltaT;


Log.d(TAG, "m=" +mVx);
mXCenter-=(10*mAx);
//mXCenter += (int)(mDeltaT * (mVx + .5 * mAx * mDeltaT));
 
 //mYCenter += (int)(mDeltaT * (mVy + 0.5 * mAy * mDeltaT));
   
 
 
 /*******************************************LANES********************************************/
 
 
 
 lane_width=mWidthScreen - (RADIUS+bck1.getWidth()/11)-RADIUS+bck1.getWidth()/8;
 
  lane_div2=(RADIUS+bck1.getWidth()/8)+lane_width/3;
 
  /*lane_div1=(RADIUS+bck1.getWidth()/8)+lane_width/4;

   lane_div3=(RADIUS+bck1.getWidth()/8)+(3*lane_width)/4;
 lane_div4=(RADIUS+bck1.getWidth()/8)+lane_width;
 
//LANE=3(INITIALLY)
 if(lane==3)
   {Log.d(TAG, "lane 3");
   if(mXCenter<lane_div2)
   {mXCenter = lane_div2;
   mVx = -mVx * FACTOR_BOUNCEBACK;
   lane=2;
   }
   }
 
 if(lane==2)
 {Log.d(TAG, "lane 2");
 if(mXCenter<lane_div1)
 {mXCenter = lane_div1;
 mVx = -mVx * FACTOR_BOUNCEBACK;
 lane=1;
 }
 }
  
 if(lane==4)
 {Log.d(TAG, "lane 4");
 if(mXCenter<lane_div4)
 {mXCenter = lane_div4;
 mVx = -mVx * FACTOR_BOUNCEBACK;
 lane=3;
 }
 } 
 
 */
  
  if(lane==2)
  {
	  if(mXCenter<lane_div2)
	  {mXCenter = lane_div2;
	  mVx = -mVx * FACTOR_BOUNCEBACK;
	  lane=1;
  }
  }
	  
	  if(lane==1)
	  {
		  if(mXCenter>lane_div2)
		  {mXCenter = lane_div2;
		  mVx = -mVx * FACTOR_BOUNCEBACK;
		  lane=2;
	  }
	  }
 
 if(mXCenter < RADIUS+bck1.getWidth()/8)
 {
	 mXCenter = RADIUS+bck1.getWidth()/8;
	 mVx = -mVx * FACTOR_BOUNCEBACK;
	 scratch=1;
 }
   
   
 /*if(mYCenter < RADIUS)  
 {  mYCenter = RADIUS;  mVy = -mVy * FACTOR_BOUNCEBACK;  
 } */ 
 
 /*
   if(lane==1)
  
 {Log.d(TAG, "lane 1");
 if(mXCenter>lane_div1)
 {mXCenter = lane_div1;
 mVx = -mVx * FACTOR_BOUNCEBACK;
 lane=2;
 }
 }
 
 if(lane==2)
 {Log.d(TAG, "lane 2");
 if(mXCenter>lane_div2)
 {mXCenter = lane_div2;
 mVx = -mVx * FACTOR_BOUNCEBACK;
 lane=3;
 }
 }
 
 if(lane==3)
 {Log.d(TAG, "lane 3");
 if(mXCenter>lane_div3)
 {mXCenter = lane_div3;
 mVx = -mVx * FACTOR_BOUNCEBACK;
 lane=4;
 }
 }
 
 */
 if(mXCenter > mWidthScreen - (RADIUS+bck1.getWidth()/11))
 {scratch=1;
 mXCenter = mWidthScreen - (RADIUS+bck1.getWidth()/11);
 mVx = -mVx * FACTOR_BOUNCEBACK;
 }
 
 
 
 
 
 
 
 
 
 
 if(flag2==1)
 {   
     flag2=flag2+1;	
      sprite_endf=elaine.update(System.currentTimeMillis());
	 
	  }
 
 if(flag1==1)
 {   
     flag2=flag2+1;	
      sprite_endg=sprite_ob.update(System.currentTimeMillis());
      
	 
	 
 }
	 
 if(flag4==1)
 {   
     flag4=flag4+1;	
      gun_anim=gunanim.update(System.currentTimeMillis());
      
	 
	 
 }
	 
	if(flag6==1)
	{
		flag6=flag6+1;
		explode_end=explode.update(System.currentTimeMillis());
		Log.d(TAG, "sahaj 2");
		
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 /*if(mYCenter > mHeightScreen - 2 * RADIUS)
 {
 mYCenter = mHeightScreen - 2 * RADIUS;
 mVy = -mVy * FACTOR_BOUNCEBACK;
 }*/

 return true;
 }

 // update the canvas
 protected void onDraw(Canvas canvas)
 {
	 bmp_height=(2*(bmp.getHeight())+(mHeightScreen/100));
	  
	
	 
	 if(flag==0)
	 {
		 p=mXCenter - RADIUS;
		 q=mHeightScreen-bmp_height;
	 }
	 if(flag==0||flag==1)
	 {
		 dent_x=mXCenter - RADIUS;
		 dent_y=mHeightScreen-bmp_height;
	
	 }
	 
 if(mRectF != null)
 {
 //mRectF.set(mXCenter - RADIUS, mYCenter - RADIUS, mXCenter + RADIUS, mYCenter + RADIUS);
 canvas.drawColor(0XFF000000);
 
 
 Paint p2=new Paint();
 
 

 Log.d(TAG,"HEIGHT OF SCREEN="+mHeightScreen);
 score=score+1;
 
 p2.setStyle(Style.FILL_AND_STROKE);
 p2.setColor(Color.BLACK);
 p2.setTextSize(mHeightScreen/27);
p2.setTypeface(Typeface.SERIF);
 canvas.drawColor(Color.BLACK);
 
 
 
 
 // TO CHANGE TO CHANGE TO CHANGE LEVELS ADD A 0 TO ALL
 
 
 if(score<500)
 {level=1;
 k=(int) k+(mHeightScreen/80);
 j=(int) j+(mHeightScreen/80);
 i=(int) i+(mHeightScreen/80);
 tempi=tempi+(mHeightScreen/400);
 tempj=tempj+(mHeightScreen/400);
 tempk=tempk+(mHeightScreen/600);
 templ=(float) (templ+(mHeightScreen/700));
 
 canvas.drawBitmap(bck1, 0, k, null);
 canvas.drawBitmap(bck2, 0, j, null);
 canvas.drawBitmap(bck3, 0, i, null);
  }
 
 
 /***************level 2****************************************************/
 if(score>500&&score <1000)
 {   level=2;
          if(level_flag1==0)
     {levelup_display=1;
     levelup_count.start();
     level_flag1=level_flag1+1;
     }
         
	
	 k=(int) k+(mHeightScreen/70);
	 j=(int) j+(mHeightScreen/70);
	 i=(int) i+(mHeightScreen/70);
	 tempi=tempi+(mHeightScreen/200);
	 tempj=tempj+(mHeightScreen/200);
	 tempk=tempk+(mHeightScreen/400);
	 templ=(float) (templ+(mHeightScreen/500));
	 canvas.drawBitmap(bck1, 0, k, null);
	 canvas.drawBitmap(bck2, 0, j, null);
	 canvas.drawBitmap(bck3, 0, i, null);
	 if(levelup_display==1)
     { Log.d(TAG, "in level up");
   	  canvas.drawText("Level up",mWidthScreen/3,mHeightScreen/3,p2);
     }
     else
     {
   	  Log.d(TAG, "in out level up");
     }
 }
 

 /***************level 3****************************************************/
 if(score>1000)
 {   level=3;
          if(level_flag2==0)
     {levelup_display=1;
     levelup_count.start();
     level_flag2=level_flag2+1;
     }
         
	
	 k=(int) k+(mHeightScreen/60);
	 j=(int) j+(mHeightScreen/60);
	 i=(int) i+(mHeightScreen/60);
	 tempi=tempi+(mHeightScreen/150);
	 tempj=tempj+(mHeightScreen/150);
	 tempk=tempk+(mHeightScreen/300);
	 templ=(float) (templ+(mHeightScreen/400));
	 tempm=tempm+(mHeightScreen/400);
	 canvas.drawBitmap(bck1, 0, k, null);
	 canvas.drawBitmap(bck2, 0, j, null);
	 canvas.drawBitmap(bck3, 0, i, null);
	 
	
	 
	 
	 
	 
	 //TO CHANGE TO CHANGE TO CHANGE TO CHANGE TO CHANGE TO CHANGE TO CHANGE CAR2 TO CAR7 done
	 
	 
	 canvas.drawBitmap(gunsym, (float) (bck1.getWidth()/5.5), car7_dy+2*car7_dy,null);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 if(levelup_display==1)
     {
   	  canvas.drawText("Level up!",mWidthScreen/3,mHeightScreen/3,p2);
     }
     else
     {
   	  
     }
 }
 
 
 
 

 
 

if(i>(mHeightScreen+10))
 {
	 i=0-(mHeightScreen);
	 
	
 }
 if(j>(mHeightScreen+10))
 {
	 j=0-(mHeightScreen);
	 
	
 }
 
 if(k>(mHeightScreen+10))
 {
	 k=0-(mHeightScreen);
	 
	
 }
 
 

 
 
 
 if(tempi>mHeightScreen+(mHeightScreen/5)&&level<3)
 {   
	 tempi=-100;
 }
 
 if(tempj>mHeightScreen+(mHeightScreen/8)&&level<3)
 {
	 tempj=-330;
 }
 
 
 if(tempk>mHeightScreen+(mHeightScreen/6))
 {
	 tempk=-450;
 }
 

 if(templ>mHeightScreen+(mHeightScreen/3))
 {
	 templ=-650;
 }

 
 
 
 canvas.drawBitmap(car2, (float) (bck1.getWidth()/1.5), tempi,null);
 canvas.drawBitmap(car3, bck1.getWidth()/2, tempj,null);
 canvas.drawBitmap(car5, bck1.getWidth()/3, tempk,null);
 canvas.drawBitmap(car7, (float) (bck1.getWidth()/5.5), templ,null);
 canvas.drawText("Score"+score,mHeightScreen/27,mHeightScreen/27,p2);
 
 if(accelero_disable==0)
 {canvas.drawBitmap(bmp, p, q, null);
 }
 
 if(accelero_disable==1)
	 canvas.drawBitmap(bmpburn, p, q, null);
 if(level>=3)
 canvas.drawBitmap(tank, (float) (bck1.getWidth()/1.5), tempm,null);
 
 
 
 
 
 //THE SPRITE AFTER THE DENT 
 
 
 if(sprite_endf==1)
	{
	Log.d(TAG, "dent"+dent);
	 if(d=='f')
		{if(accelero_disable==0)
		 canvas.drawBitmap(carf, dent_x, dent_y, null);
		if(accelero_disable==1)
			 canvas.drawBitmap(bmpburn, dent_x, dent_y, null);
		//dent=1;
		}
	else if(d=='b')
	{	if(accelero_disable==0)
		canvas.drawBitmap(carb, dent_x, dent_y, null);
	if(accelero_disable==1)
		 canvas.drawBitmap(bmpburn, dent_x, dent_y, null);
	//dent=1;
	}
	else if(d=='r')
	{	if(accelero_disable==0)
		canvas.drawBitmap(carr, dent_x, dent_y, null);
	if(accelero_disable==1)
		 canvas.drawBitmap(bmpburn, dent_x, dent_y, null);
	//dent=1;
	}
	else if(d=='l')
	{	if(accelero_disable==0)
		canvas.drawBitmap(carl, dent_x, dent_y, null);
	if(accelero_disable==1)
		 canvas.drawBitmap(bmpburn, dent_x, dent_y, null);
	//dent=1;
	}
	else if(d=='w')
	{	if(accelero_disable==0)
		canvas.drawBitmap(carw, dent_x, dent_y, null);
	if(accelero_disable==1)
		 canvas.drawBitmap(bmpburn, dent_x, dent_y, null);
	dent=2;
	}
	else 
	{
		dent=3;
		Log.d(TAG, "thread stopeed");
		
	}
	}
 
 if(sprite_endg==1)
	 {mThread.setRunning(false);
     finish();
     Context context=getContext();
		Intent intent=new Intent(context,score_view.class);
		intent.putExtra("Sahaj", score);
	    context.startActivity(intent);
    
	 }
 
 if(gun_anim==1)
 {
	 canvas.drawBitmap(gun, p+bmp.getWidth()/2, q+(bmp.getHeight()-bmp.getHeight()/6), null);
 }

 /************************************************************************ game khatam***********************************************************************************/
 
 if(explode_end==1)
 {  Log.d(TAG, "sahaj 3");
	 flag5=2;
	 if(e=='m')
	 {  Log.d(TAG, "game over");
         mThread.setRunning(false);
         finish();
         Context context=getContext();
 		Intent intent=new Intent(context,score_view.class);
 		intent.putExtra("Sahaj", score);
 	    context.startActivity(intent);
	 }
 
	 
	 
	 
	 else if(e=='o')
   {
	alert_flag=0;
	alert_count=0;
	alert_temp=0;
	alert_timer_flag=0;
	missile_y=mHeightScreen;
	explode_count=1;
	explode_end=0;
	explode.setff(0);
	explode.setCurrentFrame(0);
	Log.d(TAG, "say 666666");
	
	e='k';
	
	
   }
 }
 
//coordinates of the cars
 
 //main car ie bmp
 
 bmp_ux=mXCenter - RADIUS;
 bmp_uy=mHeightScreen-bmp_height;
 bmp_dx=(mXCenter - RADIUS)+bmp.getWidth();
 bmp_dy=(mHeightScreen-bmp_height)+bmp.getHeight();
 
 
 //car 2
 
 car2_ux=(float) (bck1.getWidth()/1.5);
 car2_uy=tempi;
 car2_dx=((float) (bck1.getWidth()/1.5))+car2.getWidth();
 car2_dy=tempi+car2.getHeight();
 
 //car3
 car3_ux=bck1.getWidth()/2;
 car3_uy=tempj;
 car3_dx=bck1.getWidth()/2+car3.getWidth();
 car3_dy=tempj+car3.getHeight();
 
//car5
 car5_ux=bck1.getWidth()/3;
 car5_uy=tempk;
 car5_dx=bck1.getWidth()/3+car5.getWidth();
 car5_dy=tempk+car5.getHeight();
 
//car7
 car7_ux=(float) (bck1.getWidth()/5.5);
 car7_uy=templ;
 car7_dx=(float) (bck1.getWidth()/5.5)+car7.getWidth();
 car7_dy=templ+car7.getHeight();
 
 //tank
 tank_ux=(float) (bck1.getWidth()/1.5);
 tank_uy=tempm;
 tank_dx=((float) (bck1.getWidth()/1.5))+tank.getWidth();
 tank_dy=tempm+tank.getHeight();
 
 //gunsym
 gunsym_ux=(float) (bck1.getWidth()/5.5);
 
 //missile
 missile_ux=alert_x;
 missile_dx=alert_x+missile.getWidth();
 missile_uy=missile_y;
 
  
 
 
 
 
 
 
 
 
 
 //TO CHANGE TO CHANGE TO CHANGE TO CHANGE TO CHANGE CAR 2 TO CAR 7 done
 gunsym_uy=car7_dy+2*car7_dy;
 gunsym_dx=(float) (bck1.getWidth()/5.5)+gunsym.getWidth();
 gunsym_dy=(car7_dy+2*car7_dy)+gunsym.getHeight();
 

 
 
 
 
 
 
 
 
 
 
 
 /***************************************************************try***********************************/
 
  
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 /****************************CAR PASSES OVER THE GUN SYMBOL*************************************/

 if(level==3){
 if(bmp_ux<=gunsym_dx&&bmp_dx>gunsym_ux&&bmp_uy<gunsym_dy&&bmp_dy>gunsym_uy)
 {
	 Log.d(TAG, "guns activated");
	 
	 flag3=1;
	 guns_activated=1;
	 if(guns_activated==1)
	 { Log.d(TAG,"ticktok1 "+guns_activated);
		 guns_activated_timer.start();
		 guns_activated=2;
		 
	 }
	 //gunanim.draw(canvas);
	 //gunanim.update(System.currentTimeMillis());
	 
 }
 }
 if(flag3==1)
 {   gunanim.setX(p-bmp.getWidth()/8);
 	 gunanim.setY(q+(bmp.getHeight()-bmp.getHeight()/6));	
	 //gunanim.setX(bmp_dx/2-bmp_dx/10);
     //gunanim.setY(bmp_dy-bmp_dy/25);
     flag4=1;
 }
 if(flag4==1)
 {
	 gunanim.draw(canvas);
 }
 
 if(tempm>mHeightScreen+5)
	{    
	  /****************************************try***********************************?*/
	 if(alert_timer_flag==0&&alert_end==0)
	 {
		 alert_timer.start();
		 
		 alert_timer_flag=alert_timer_flag+1;
		 
	 }
	
	 if(alert_count<6&&alert_end==0)
	 {if(alert_flag<1)
		 {
		 alert_x=mXCenter - RADIUS;
		 alert_flag=2;
		 }
	 if(alert_temp==0)
	 {    
		 alert_x+=mWidthScreen/96;
		 if(alert_x>mWidthScreen-alert.getWidth())
			 {
			 alert_temp=1;
			 
			 }
	 }
	 
	 if(alert_temp==1)
	 {
		 alert_x-=mWidthScreen/96;
		 if(alert_x<0)
			 {alert_temp=0;
		 
			 }
	 }
	 canvas.drawBitmap(alert, alert_x, mHeightScreen-mHeightScreen/6, null);
	 }
	 if(alert_count>=6&&alert_end==0)
	 {   missile_y-=mHeightScreen/160;
	   	
		 canvas.drawBitmap(missile, alert_x, missile_y, null);
		 missile_dy=missile_y;
		 Log.d(TAG, "blah"+alert_x);
		 
		 
		 
		 
		
		 /********************************Collision of missile with cars***********************/
		 
		 if(missile_dx>(car2_ux+car2.getWidth()/10)&&missile_ux<car2_dx-(car2.getWidth()/10)&&missile_dy<car2_dy&&(missile_dy+missile.getHeight())>car2_uy)

			 
		 {
			 
			 explode.setX((int) (car2_ux-car2_ux/7));
			 explode.setY((int) car2_uy);
			 flag5=1;
			 tempi=mHeightScreen+1000;
			 e='o';
			 
		 }

		 if(missile_dx>(car3_ux+car3.getWidth()/10)&&missile_ux<car3_dx-(car3.getWidth()/10)&&missile_dy<car3_dy&&(missile_dy+missile.getHeight())>car3_uy)

	 
		 {explode.setX((int) (car3_ux-car3_ux/7));
		 explode.setY((int) car3_uy);
		 flag5=1;
			 Log.d(TAG, "bhoot 3 hh ");
			 tempj=mHeightScreen+1000;
			 e='o';
		 }		 

		 if(missile_dx>(car5_ux+car5.getWidth()/10)&&missile_ux<car5_dx-(car5.getWidth()/10)&&missile_dy<car5_dy&&(missile_dy+missile.getHeight())>car5_uy)

	 
		 {explode.setX((int) (car5_ux-car5_ux/7));
		 explode.setY((int) car5_uy);
		 flag5=1;
			 Log.d(TAG, "bhoot 5 hh ");
			 tempk=mHeightScreen+1000;
			 e='o';
		 }	 
		 
		 
		 if(missile_dx>(car7_ux+car7.getWidth()/10)&&missile_ux<car7_dx-(car7.getWidth()/10)&&missile_dy<car7_dy&&(missile_dy+missile.getHeight())>car7_uy)

			 
		 {explode.setX((int) (car7_ux-car7_ux/7));
		 explode.setY((int) car7_uy);
		 flag5=1;
			 Log.d(TAG, "bhoot 7");
			 templ=mHeightScreen+1000;
			 e='o';
		 }

		 if(missile_dx>(bmp_ux+bmp.getWidth()/10)&&missile_ux<bmp_dx-(bmp.getWidth()/10)&&missile_dy<bmp_dy&&(missile_dy+missile.getHeight())>bmp_uy)

		 {
		 accelero_disable=1;
		 explode.setX(bmp_ux-bmp_ux/10);
		 explode.setY(bmp_uy);
		 
		 mXCenter=5000;
		 
		 
			
		 flag5=1;
		flag7=1;
		
		 e='m';
		 
		 }		 
		 
		 if(missile_dx>(bmp_ux+bmp.getWidth()/10)&&missile_ux<bmp_dx-(bmp.getWidth()/10)&&missile_dy<bmp_dy&&(missile_dy+missile.getHeight())>bmp_uy)

		 {
	     explode.setX(bmp_ux-bmp_ux/10);
		 explode.setY(bmp_uy);
		 
		 mXCenter=5000;
		 accelero_disable=1;
		 
			
		 flag5=1;
		flag7=1;
		
		 e='m';
		 
		 }		  
		 
		 
		 
		 
		 
		 
		 
	}
	if(flag7==1)
	{
		q=mHeightScreen+mHeightScreen;
	}
	 if(flag5==1)
	 {   if(explode_count==1)
		 {
		 
		  explode_end=0;
		  explode_count=0;
		  }
	     explode.draw(canvas);
	     Log.d(TAG, "hello");
		 
	     flag6=1;
		 missile_y=-100;
		 Log.d(TAG, "sahaj 1");
	 }
	 
	 if(missile_y<-10)
	 {
		 alert_flag=0;
			alert_count=0;
			alert_temp=0;
			alert_timer_flag=0;
			missile_y=mHeightScreen;
			

	 }
}
 
 
 
   
 

 
 
 
 
 

 
 
 
 
 
 
 
 
 
 
 
 
 /******************************First collision************************************************/
 
 if(dent==0)
 {
 
 /**************************************FRONT DENT**************************************/
 

 
 
 //CAR2
 if(bmp_dx>(car2_ux+car2.getWidth()/10)&&bmp_ux<car2_dx-(car2.getWidth()/10)&&bmp_uy<car2_dy&&bmp_uy>car2_dy-(car2.getHeight()/10))
	 
 {   flag=1;
     q=15000;
	 Log.d(TAG, "FRONT HIT BY CAR 2");
	 d='f';
 }
 
 //CAR3
 else if(bmp_dx>(car3_ux+car3.getWidth()/10)&&bmp_ux<car3_dx-(car3.getWidth()/10)&&bmp_uy<car3_dy&&bmp_uy>car3_dy-(car3.getHeight()/10))

 {   
	 flag=1;
     q=15000;
	 Log.d(TAG, "FRONT HIT BY CAR 3");
	 d='f';
 }
 
//CAR5
 else if(bmp_dx>(car5_ux+car5.getWidth()/10)&&bmp_ux<car5_dx-(car5.getWidth()/10)&&bmp_uy<car5_dy&&bmp_uy>car5_dy-(car5.getHeight()/10))

 {
	 flag=1;
     q=15000;
	 Log.d(TAG, "FRONT HIT BY CAR 5");
	 d='f';
 }

//CAR7
 else if(bmp_dx>(car7_ux+car7.getWidth()/10)&&bmp_ux<car7_dx-(car7.getWidth()/10)&&bmp_uy<car7_dy&&bmp_uy>car7_dy-(car7.getHeight()/10))

 
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, "FRONT HIT BY CAR 7");
	 d='f';
 }

//tank
if(bmp_dx>(tank_ux+tank.getWidth()/10)&&bmp_ux<tank_dx-(tank.getWidth()/10)&&bmp_uy<tank_dy&&bmp_uy>tank_dy-(tank.getHeight()/10))
	 
{   flag=1;
    q=15000;
	 Log.d(TAG, "FRONT HIT BY tank");
	 d='f';
}
 
 
 
 
 
 /*************************************BACK DENT*****************************************/
 
 //CAR2
 else if(bmp_dx>car2_ux+(car2.getWidth()/10)&&bmp_ux<car2_dx-(car2.getWidth()/10)&&bmp_dy>car2_uy&&bmp_dy<car2_uy+(car2.getHeight()/10))
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, " BACK HIT BY CAR 2");
	 d='b';
 }
	 
//CAR3
 else if(bmp_dx>car3_ux+(car3.getWidth()/10)&&bmp_ux<car3_dx-(car3.getWidth()/10)&&bmp_dy>car3_uy&&bmp_dy<car3_uy+(car3.getHeight()/10))
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, " BACK HIT BY CAR 3");
	 d='b';
 }
 
//CAR5
 else if(bmp_dx>car5_ux+(car5.getWidth()/10)&&bmp_ux<car5_dx-(car5.getWidth()/10)&&bmp_dy>car5_uy&&bmp_dy<car5_uy+(car5.getHeight()/10))
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, " BACK HIT BY CAR 5");
	 d='b';
 }
 
//CAR7
 else if(bmp_dx>car7_ux+(car7.getWidth()/10)&&bmp_ux<car7_dx-(car7.getWidth()/10)&&bmp_dy>car7_uy&&bmp_dy<car7_uy+(car7.getHeight()/10))
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, " BACK HIT BY CAR 7");
	 d='b';
 }
//tank
 else if(bmp_dx>tank_ux+(tank.getWidth()/10)&&bmp_ux<tank_dx-(tank.getWidth()/10)&&bmp_dy>tank_uy&&bmp_dy<tank_uy+(tank.getHeight()/10))
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, " BACK HIT BY CAR 2");
	 d='b';
 }
 
 /**************************************************RIGHT DENT**********************************************/
 
//CAR2
 else if(bmp_dx>car2_ux&&bmp_dx<car2_ux+(car2.getWidth()/10)&&bmp_uy<car2_dy-(car2.getHeight()/10)&&bmp_dy>car2_uy+(car2.getHeight()/10))
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, " RIGHT HIT BY CAR 2");
	 d='r';
 }

//CAR3
 else if(bmp_dx>car3_ux&&bmp_dx<car3_ux+(car3.getWidth()/10)&&bmp_uy<car3_dy-(car3.getHeight()/10)&&bmp_dy>car3_uy+(car3.getHeight()/10))
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, " RIGHT HIT BY CAR 3");
	 d='r';
 }

 
//CAR5
 else if(bmp_dx>car5_ux&&bmp_dx<car5_ux+(car5.getWidth()/10)&&bmp_uy<car5_dy-(car5.getHeight()/10)&&bmp_dy>car5_uy+(car5.getHeight()/10))
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, " RIGHT HIT BY CAR 5");
	 d='r';
 }

 
//CAR7
 else if(bmp_dx>car7_ux&&bmp_dx<car7_ux+(car7.getWidth()/10)&&bmp_uy<car7_dy-(car7.getHeight()/10)&&bmp_dy>car7_uy+(car7.getHeight()/10))
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, " RIGHT HIT BY CAR 7");
	 d='r';
 }
//tank
 else if(bmp_dx>tank_ux&&bmp_dx<tank_ux+(tank.getWidth()/10)&&bmp_uy<tank_dy-(tank.getHeight()/10)&&bmp_dy>tank_uy+(tank.getHeight()/10))
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, " RIGHT HIT BY CAR 2");
	 d='r';
 }
 /*******************************************LEFT DENT*****************************************************/

 //CAR2
 else if(bmp_ux<car2_dx&&bmp_ux>car2_dx-(car2.getWidth()/10)&&bmp_uy<car2_dy-(car2.getHeight()/10)&&bmp_dy>car2_uy+(car2.getHeight()/10))
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, " LEFT HIT BY CAR 2");
	 d='l';
 }
 
//CAR3
 else if(bmp_ux<car3_dx&&bmp_ux>car3_dx-(car3.getWidth()/10)&&bmp_uy<car3_dy-(car3.getHeight()/10)&&bmp_dy>car3_uy+(car3.getHeight()/10))
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, " LEFT HIT BY CAR 3");
	 d='l';
 }

//CAR5
 else if(bmp_ux<car5_dx&&bmp_ux>car5_dx-(car5.getWidth()/10)&&bmp_uy<car5_dy-(car5.getHeight()/10)&&bmp_dy>car5_uy+(car5.getHeight()/10))
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, " LEFT HIT BY CAR 5");
	 d='l';
 }

//CAR7
 else if(bmp_ux<car7_dx&&bmp_ux>car7_dx-(car7.getWidth()/10)&&bmp_uy<car7_dy-(car7.getHeight()/10)&&bmp_dy>car7_uy+(car7.getHeight()/10))
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, " LEFT HIT BY CAR 7");
	 d='l';
 }

//tank
 else if(bmp_ux<tank_dx&&bmp_ux>tank_dx-(tank.getWidth()/10)&&bmp_uy<tank_dy-(tank.getHeight()/10)&&bmp_dy>tank_uy+(tank.getHeight()/10))
 {
	 flag=1;
     q=15000;
	 Log.d(TAG, " LEFT HIT BY CAR 2");
	 d='l';
 }
 
 if(flag==1)
   { 
	 
	 	 denthit=denthit+1;
	 elaine.setX(bmp_ux-(bmp.getWidth()/2));
     elaine.setY(bmp_uy);
     flag2=1;
   }
 
 
if(flag2==1)
	{Log.d(TAG, "flag2="+flag2);
		elaine.draw(canvas);
		
	}
 
 if(denthit==1)
 {
	 countdown.start();
 }
 
 }// if dent==0 ka end
 

 

 
 
 
 
 
 
 
 
 /**************************************second collision****************************************/
 
 if(dent==1)
 {
 
 /**************************************FRONT DENT**************************************/
 

 
 
 //CAR2
 if(bmp_dx>(car2_ux+car2.getWidth()/10)&&bmp_ux<car2_dx-(car2.getWidth()/10)&&bmp_uy<car2_dy&&bmp_uy>car2_dy-(car2.getHeight()/10))
	 
 {   
     q=15000;
	 Log.d(TAG, "FRONT HIT BY CAR 2");
	 d='w';
 }
 
 //CAR3
 else if(bmp_dx>(car3_ux+car3.getWidth()/10)&&bmp_ux<car3_dx-(car3.getWidth()/10)&&bmp_uy<car3_dy&&bmp_uy>car3_dy-(car3.getHeight()/10))

 {   
	 
     q=15000;
	 Log.d(TAG, "FRONT HIT BY CAR 3");
	 d='w';
 }
 
//CAR5
 else if(bmp_dx>(car5_ux+car5.getWidth()/10)&&bmp_ux<car5_dx-(car5.getWidth()/10)&&bmp_uy<car5_dy&&bmp_uy>car5_dy-(car5.getHeight()/10))

 {
	 
     q=15000;
	 Log.d(TAG, "FRONT HIT BY CAR 5");
	 d='w';
 }

//CAR7
 else if(bmp_dx>(car7_ux+car7.getWidth()/10)&&bmp_ux<car7_dx-(car7.getWidth()/10)&&bmp_uy<car7_dy&&bmp_uy>car7_dy-(car7.getHeight()/10))

 
 {
	 
     q=15000;
	 Log.d(TAG, "FRONT HIT BY CAR 7");
	 d='w';
 }
 
//tank
 if(bmp_dx>(tank_ux+tank.getWidth()/10)&&bmp_ux<tank_dx-(tank.getWidth()/10)&&bmp_uy<tank_dy&&bmp_uy>tank_dy-(tank.getHeight()/10))
	 
 {   
     q=15000;
	 Log.d(TAG, "FRONT HIT BY CAR 2");
	 d='w';
 }
 
 
 
 
 /*************************************BACK DENT*****************************************/
 
 //CAR2
 else if(bmp_dx>car2_ux+(car2.getWidth()/10)&&bmp_ux<car2_dx-(car2.getWidth()/10)&&bmp_dy>car2_uy&&bmp_dy<car2_uy+(car2.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " BACK HIT BY CAR 2");
	 d='w';
 }
	 
//CAR3
 else if(bmp_dx>car3_ux+(car3.getWidth()/10)&&bmp_ux<car3_dx-(car3.getWidth()/10)&&bmp_dy>car3_uy&&bmp_dy<car3_uy+(car3.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " BACK HIT BY CAR 3");
	 d='w';
 }
 
//CAR5
 else if(bmp_dx>car5_ux+(car5.getWidth()/10)&&bmp_ux<car5_dx-(car5.getWidth()/10)&&bmp_dy>car5_uy&&bmp_dy<car5_uy+(car5.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " BACK HIT BY CAR 5");
	 d='w';
 }
 
//CAR7
 else if(bmp_dx>car7_ux+(car7.getWidth()/10)&&bmp_ux<car7_dx-(car7.getWidth()/10)&&bmp_dy>car7_uy&&bmp_dy<car7_uy+(car7.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " BACK HIT BY CAR 7");
	 d='w';
 }
 //tank
 else if(bmp_dx>tank_ux+(tank.getWidth()/10)&&bmp_ux<tank_dx-(tank.getWidth()/10)&&bmp_dy>tank_uy&&bmp_dy<tank_uy+(tank.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " BACK HIT BY CAR 2");
	 d='w';
 }
 
 /**************************************************RIGHT DENT**********************************************/
 
//CAR2
 else if(bmp_dx>car2_ux&&bmp_dx<car2_ux+(car2.getWidth()/10)&&bmp_uy<car2_dy-(car2.getHeight()/10)&&bmp_dy>car2_uy+(car2.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " RIGHT HIT BY CAR 2");
	 d='w';
 }

//CAR3
 else if(bmp_dx>car3_ux&&bmp_dx<car3_ux+(car3.getWidth()/10)&&bmp_uy<car3_dy-(car3.getHeight()/10)&&bmp_dy>car3_uy+(car3.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " RIGHT HIT BY CAR 3");
	 d='w';
 }

 
//CAR5
 else if(bmp_dx>car5_ux&&bmp_dx<car5_ux+(car5.getWidth()/10)&&bmp_uy<car5_dy-(car5.getHeight()/10)&&bmp_dy>car5_uy+(car5.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " RIGHT HIT BY CAR 5");
	 d='w';
 }

 
//CAR7
 else if(bmp_dx>car7_ux&&bmp_dx<car7_ux+(car7.getWidth()/10)&&bmp_uy<car7_dy-(car7.getHeight()/10)&&bmp_dy>car7_uy+(car7.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " RIGHT HIT BY CAR 7");
	 d='w';
 }
 
//tank
 else if(bmp_dx>tank_ux&&bmp_dx<tank_ux+(tank.getWidth()/10)&&bmp_uy<tank_dy-(tank.getHeight()/10)&&bmp_dy>tank_uy+(tank.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " RIGHT HIT BY CAR 2");
	 d='w';
 }


 /*******************************************LEFT DENT*****************************************************/

 //CAR2
 else if(bmp_ux<car2_dx&&bmp_ux>car2_dx-(car2.getWidth()/10)&&bmp_uy<car2_dy-(car2.getHeight()/10)&&bmp_dy>car2_uy+(car2.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " LEFT HIT BY CAR 2");
	 d='w';
 }
 
//CAR3
 else if(bmp_ux<car3_dx&&bmp_ux>car3_dx-(car3.getWidth()/10)&&bmp_uy<car3_dy-(car3.getHeight()/10)&&bmp_dy>car3_uy+(car3.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " LEFT HIT BY CAR 3");
	 d='w';
 }

//CAR5
 else if(bmp_ux<car5_dx&&bmp_ux>car5_dx-(car5.getWidth()/10)&&bmp_uy<car5_dy-(car5.getHeight()/10)&&bmp_dy>car5_uy+(car5.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " LEFT HIT BY CAR 5");
	 d='w';
 }

//CAR7
 else if(bmp_ux<car7_dx&&bmp_ux>car7_dx-(car7.getWidth()/10)&&bmp_uy<car7_dy-(car7.getHeight()/10)&&bmp_dy>car7_uy+(car7.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " LEFT HIT BY CAR 7");
	 d='w';
 }

 
//tank
 else if(bmp_ux<tank_dx&&bmp_ux>tank_dx-(tank.getWidth()/10)&&bmp_uy<tank_dy-(tank.getHeight()/10)&&bmp_dy>tank_uy+(tank.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " LEFT HIT BY CAR 2");
	 d='w';
 }
 
  
 
 
 }// if dent==1 ka end

 
 
 
/**************************************third collision==GAMEOVER****************************************/
 
 if(dent==2)
 {
 
 /**************************************FRONT DENT**************************************/
 

 
 
 //CAR2
 if(bmp_dx>(car2_ux+car2.getWidth()/10)&&bmp_ux<car2_dx-(car2.getWidth()/10)&&bmp_uy<car2_dy&&bmp_uy>car2_dy-(car2.getHeight()/10))
	 
 {   
     q=15000;
	 Log.d(TAG, "FRONT HIT BY CAR 2");
	 
	 flag1=1;
 }
 
 //CAR3
 else if(bmp_dx>(car3_ux+car3.getWidth()/10)&&bmp_ux<car3_dx-(car3.getWidth()/10)&&bmp_uy<car3_dy&&bmp_uy>car3_dy-(car3.getHeight()/10))

 {   
	 
     q=15000;
	 Log.d(TAG, "FRONT HIT BY CAR 3");
	 
	 flag1=1;
 }
 
//CAR5
 else if(bmp_dx>(car5_ux+car5.getWidth()/10)&&bmp_ux<car5_dx-(car5.getWidth()/10)&&bmp_uy<car5_dy&&bmp_uy>car5_dy-(car5.getHeight()/10))

 {
	 
     q=15000;
	 Log.d(TAG, "FRONT HIT BY CAR 5");
	 	 flag1=1;
 }

//CAR7
 else if(bmp_dx>(car7_ux+car7.getWidth()/10)&&bmp_ux<car7_dx-(car7.getWidth()/10)&&bmp_uy<car7_dy&&bmp_uy>car7_dy-(car7.getHeight()/10))

 
 {
	 
     q=15000;
	 Log.d(TAG, "FRONT HIT BY CAR 7");
	 	 flag1=1;
 }
 
//tank
 if(bmp_dx>(tank_ux+tank.getWidth()/10)&&bmp_ux<tank_dx-(tank.getWidth()/10)&&bmp_uy<tank_dy&&bmp_uy>tank_dy-(tank.getHeight()/10))
	 
 {   
     q=15000;
	 Log.d(TAG, "FRONT HIT BY CAR 2");
	 
	 flag1=1;
 }
 
 
 
 
 
 /*************************************BACK DENT*****************************************/
 
 //CAR2
 else if(bmp_dx>car2_ux+(car2.getWidth()/10)&&bmp_ux<car2_dx-(car2.getWidth()/10)&&bmp_dy>car2_uy&&bmp_dy<car2_uy+(car2.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " BACK HIT BY CAR 2");
	 
	 flag1=1;
 }
	 
//CAR3
 else if(bmp_dx>car3_ux+(car3.getWidth()/10)&&bmp_ux<car3_dx-(car3.getWidth()/10)&&bmp_dy>car3_uy&&bmp_dy<car3_uy+(car3.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " BACK HIT BY CAR 3");
	 
	 flag1=1;
 }
 
//CAR5
 else if(bmp_dx>car5_ux+(car5.getWidth()/10)&&bmp_ux<car5_dx-(car5.getWidth()/10)&&bmp_dy>car5_uy&&bmp_dy<car5_uy+(car5.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " BACK HIT BY CAR 5");
	 	 flag1=1;
 }
 
//CAR7
 else if(bmp_dx>car7_ux+(car7.getWidth()/10)&&bmp_ux<car7_dx-(car7.getWidth()/10)&&bmp_dy>car7_uy&&bmp_dy<car7_uy+(car7.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " BACK HIT BY CAR 7");
	 
	 flag1=1;
 }
//tank
 else if(bmp_dx>tank_ux+(tank.getWidth()/10)&&bmp_ux<tank_dx-(tank.getWidth()/10)&&bmp_dy>tank_uy&&bmp_dy<tank_uy+(tank.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " BACK HIT BY CAR 2");
	 
	 flag1=1;
 }
 
 /**************************************************RIGHT DENT**********************************************/
 
//CAR2
 else if(bmp_dx>car2_ux&&bmp_dx<car2_ux+(car2.getWidth()/10)&&bmp_uy<car2_dy-(car2.getHeight()/10)&&bmp_dy>car2_uy+(car2.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " RIGHT HIT BY CAR 2");
	 
	 flag1=1;
 }

//CAR3
 else if(bmp_dx>car3_ux&&bmp_dx<car3_ux+(car3.getWidth()/10)&&bmp_uy<car3_dy-(car3.getHeight()/10)&&bmp_dy>car3_uy+(car3.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " RIGHT HIT BY CAR 3");
	 
	 flag1=1;
 }

 
//CAR5
 else if(bmp_dx>car5_ux&&bmp_dx<car5_ux+(car5.getWidth()/10)&&bmp_uy<car5_dy-(car5.getHeight()/10)&&bmp_dy>car5_uy+(car5.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " RIGHT HIT BY CAR 5");
	 
	 flag1=1;
 }

 
//CAR7
 else if(bmp_dx>car7_ux&&bmp_dx<car7_ux+(car7.getWidth()/10)&&bmp_uy<car7_dy-(car7.getHeight()/10)&&bmp_dy>car7_uy+(car7.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " RIGHT HIT BY CAR 7");
	 
	 flag1=1;
 }

//tank
 else if(bmp_dx>tank_ux&&bmp_dx<tank_ux+(tank.getWidth()/10)&&bmp_uy<tank_dy-(tank.getHeight()/10)&&bmp_dy>tank_uy+(tank.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " RIGHT HIT BY CAR 2");
	 
	 flag1=1;
 }
 
 /*******************************************LEFT DENT*****************************************************/

 //CAR2
 else if(bmp_ux<car2_dx&&bmp_ux>car2_dx-(car2.getWidth()/10)&&bmp_uy<car2_dy-(car2.getHeight()/10)&&bmp_dy>car2_uy+(car2.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " LEFT HIT BY CAR 2");
	 
	 flag1=1;
 }
 
//CAR3
 else if(bmp_ux<car3_dx&&bmp_ux>car3_dx-(car3.getWidth()/10)&&bmp_uy<car3_dy-(car3.getHeight()/10)&&bmp_dy>car3_uy+(car3.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " LEFT HIT BY CAR 3");
	 
	 flag1=1;
 }

//CAR5
 else if(bmp_ux<car5_dx&&bmp_ux>car5_dx-(car5.getWidth()/10)&&bmp_uy<car5_dy-(car5.getHeight()/10)&&bmp_dy>car5_uy+(car5.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " LEFT HIT BY CAR 5");
	 
	 flag1=1;
 }

//CAR7
 else if(bmp_ux<car7_dx&&bmp_ux>car7_dx-(car7.getWidth()/10)&&bmp_uy<car7_dy-(car7.getHeight()/10)&&bmp_dy>car7_uy+(car7.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " LEFT HIT BY CAR 7");
	 
	 flag1=1;
	 
 }
//tank
 else if(bmp_ux<tank_dx&&bmp_ux>tank_dx-(tank.getWidth()/10)&&bmp_uy<tank_dy-(tank.getHeight()/10)&&bmp_dy>tank_uy+(tank.getHeight()/10))
 {
	 
     q=15000;
	 Log.d(TAG, " LEFT HIT BY CAR 2");
	 
	 flag1=1;
 }
 
if(flag1==1)
{
	sprite_ob.draw(canvas);
}
 
 
 
 }// if dent==0 ka end


 
 
 
 
 
 
 
 
 
 //canvas.drawOval(mRectF, mPaint);
 }
 }

@Override
 public void surfaceChanged(SurfaceHolder holder, int format, int width,
 int height) {
 }

@Override
 public void surfaceCreated(SurfaceHolder holder) {
 mThread.setRunning(true);
 mThread.start();
 }

@Override
 public void surfaceDestroyed(SurfaceHolder holder) {
 boolean retry = true;
 mThread.setRunning(false);
 while(retry)
 {
 try{
 mThread.join();
 retry = false;
 } catch (InterruptedException e){

 }
 }
 }
 }

 class ShapeThread extends Thread {
 private SurfaceHolder mSurfaceHolder;
 private ShapeView mShapeView;
 private boolean mRun = false;

 public ShapeThread(SurfaceHolder surfaceHolder, ShapeView shapeView) {
 mSurfaceHolder = surfaceHolder;
 mShapeView = shapeView;
 }

 public void setRunning(boolean run) {
 mRun = run;
 }

 public SurfaceHolder getSurfaceHolder() {
 return mSurfaceHolder;
 }

 @Override
 public void run() {
 Canvas c;
 while (mRun) {
 mShapeView.updateOvalCenter();
 c = null;
 try {
 c = mSurfaceHolder.lockCanvas(null);
 synchronized (mSurfaceHolder) {
 mShapeView.onDraw(c);
 }
 } 
 catch(Exception e)
 {
	 
 }
 finally {
 if (c != null) {
 mSurfaceHolder.unlockCanvasAndPost(c);
 
 }
 }
 }
 }
 }

 
 /**********************************Count down timer class for dent******************************/
 
 
 class Mycount extends CountDownTimer 
{
	public Mycount(long millisInFuture, long countDownInterval) {
		super(millisInFuture, countDownInterval);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onFinish() {
		Log.d(TAG, "time finish");
		dent=1;
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void onTick(long millisUntillFinished) {
		// TODO Auto-generated method stub
		Log.d(TAG, "time left :" + millisUntillFinished/1000);
		
		
	}

}
 
/*******************countdown timer class for level up******************************/
 class Mycount_level extends CountDownTimer 
 {
 	public Mycount_level(long millisInFuture, long countDownInterval) {
 		super(millisInFuture, countDownInterval);
 		// TODO Auto-generated constructor stub
 	}

 	@Override
 	public void onFinish() {
 	    levelup_display=0;
 		// TODO Auto-generated method stub
 		
 		
 	}

 	@Override
 	public void onTick(long millisUntillFinished) {
 		// TODO Auto-generated method stub
 		
 		
 		
 	}

 }

 /*******************countdown timer class for alert******************************/
 class Mycount_alert extends CountDownTimer 
 {
 	public Mycount_alert(long millisInFuture, long countDownInterval) {
 		super(millisInFuture, countDownInterval);
 		// TODO Auto-generated constructor stub
 	}

 	@Override
 	public void onFinish() {
 	    alert_count=6;
 		// TODO Auto-generated method stub
 		
 		
 	}

 	@Override
 	public void onTick(long millisUntillFinished) {
 		// TODO Auto-generated method stub
 		
 		
 		
 	}

 }
 
 /*******************countdown timer class for guns firing******************************/
 class Mycount_guns extends CountDownTimer 
 {
 	public Mycount_guns(long millisInFuture, long countDownInterval) {
 		super(millisInFuture, countDownInterval);
 		// TODO Auto-generated constructor stub
 	}

 	@Override
 	public void onFinish() {
 	    alert_end=1;
 	    Log.d(TAG,"ticktok finish");
 		// TODO Auto-generated method stub
 		
 		
 	}

 	@Override
 	public void onTick(long millisUntillFinished) {
 		// TODO Auto-generated method stub
 		Log.d(TAG,"ticktok");
 		
 		
 	}

 }
 
 
}

