package sd.mkcom.app;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Otheracc extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.otheracc);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setTextColor(Color.WHITE);
		Button b2=(Button)findViewById(R.id.button2);
		b2.setTextColor(Color.WHITE);
		Button b3=(Button)findViewById(R.id.button3);
		b3.setTextColor(Color.WHITE);
		Button b4=(Button)findViewById(R.id.button4);
		b4.setTextColor(Color.WHITE);
		Button b5=(Button)findViewById(R.id.button5);
		b5.setTextColor(Color.WHITE);
		Button b6=(Button)findViewById(R.id.button6);
		b6.setTextColor(Color.WHITE);
		Button b7=(Button)findViewById(R.id.button7);
		b7.setTextColor(Color.WHITE);
		Button b8=(Button)findViewById(R.id.button8);
		b8.setTextColor(Color.WHITE);
		Button b9=(Button)findViewById(R.id.button9);
		b9.setTextColor(Color.WHITE);
		Button b10=(Button)findViewById(R.id.button10);
		b10.setTextColor(Color.WHITE);
		Button b11=(Button)findViewById(R.id.button11);
		b11.setTextColor(Color.WHITE);
		Button b12=(Button)findViewById(R.id.button12);
		b12.setTextColor(Color.WHITE);
		Button b13=(Button)findViewById(R.id.button13);
		b13.setTextColor(Color.WHITE);
		Button b14=(Button)findViewById(R.id.button14);
		b14.setTextColor(Color.WHITE);
		Button b15=(Button)findViewById(R.id.button15);
		b15.setTextColor(Color.WHITE);
		Button b16=(Button)findViewById(R.id.button16);
		b16.setTextColor(Color.WHITE);
		Button b17=(Button)findViewById(R.id.button17);
		b17.setTextColor(Color.WHITE);
		Button b18=(Button)findViewById(R.id.button18);
		b18.setTextColor(Color.WHITE);
		
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	}

	public void Pendrive(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Pendrive");
			startActivity(i_win);
	    	}
	public void Speaker(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Speaker");
			startActivity(i_win);
	    	}
	public void Hdcasing(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Hdcasing");
			startActivity(i_win);
	    	}
	
	public void Externalhd(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Externalhd");
			startActivity(i_win);
	    	}
	
	public void Headphone(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Headphone");
			startActivity(i_win);
	    	}
	
	public void Powerstrip(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Powerstrip");
			startActivity(i_win);
	    	}
	
	public void Usbhub(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Usbhub");
			startActivity(i_win);
	    	}
	
	public void Laptopbag(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Laptopbag");
			startActivity(i_win);
	    	}
	public void Usbkeypad(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Usbkeypad");
			startActivity(i_win);
	    	}
	public void Powerbar(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Powerbar");
			startActivity(i_win);
	    	}
	
	public void Adapter(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Adapter");
			startActivity(i_win);
	    	}
	
	public void Carcharger(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Carcharger");
			startActivity(i_win);
	    	}
	
	public void Multimediappt(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Multimediappt");
			startActivity(i_win);
	    	}
	
	public void Usbbattery(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Usbbattery");
			startActivity(i_win);
	    	}
	
	public void Cableothacc(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Cableothacc");
			startActivity(i_win);
	    	}
	
	public void Pptremote(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Pptremote");
			startActivity(i_win);
	    	}
	
	public void Ipadbackcvr(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Ipadbackcvr");
			startActivity(i_win);
	    	}
	
	public void Ipad2case(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Ipad2case");
			startActivity(i_win);
	    	}
	
	
	
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
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
		super.onStop();
	}
	
	
}
