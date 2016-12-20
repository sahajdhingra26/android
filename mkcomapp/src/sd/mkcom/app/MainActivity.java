package sd.mkcom.app;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends Activity {
    Mycount mc;
    long t;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mc=new Mycount(3000,1000);
        mc.start();
       
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	
	}
	
	
	class Mycount extends CountDownTimer
	{

		public Mycount(long millisInFuture, long countDownInterval) {
			super(millisInFuture, countDownInterval);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onFinish() {
			Intent i_win = new Intent("sd.mkcom.app.homepage");
			startActivity(i_win);
			
			finish();
			
			
			
			}

		@Override
		public void onTick(long millisUntillFinished) {
			// TODO Auto-generated method stub
			
			t=(millisUntillFinished/1000)-1;
			}
		}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		mc.cancel();
		super.onPause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
	
		super.onResume();
		
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		mc.cancel();
		super.onStop();
	}

	

}
