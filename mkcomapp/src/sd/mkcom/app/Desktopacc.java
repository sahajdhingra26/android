package sd.mkcom.app;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class Desktopacc extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.desktopacc);
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
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
	}
	 public void Ram(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Ram");
			startActivity(i_win);
	    	}
	 
	 public void Harddisk(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Harddisk");
			startActivity(i_win);
	    	}
	 
	 
	 public void Keyboardlogitech(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Keyboardlogitech");
			startActivity(i_win);
	    	}
	 
	 public void Mouselogitech(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Mouselogitech");
			startActivity(i_win);
	    	}
	 
	 public void Ups(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Ups");
			startActivity(i_win);
	    	}
	 
	 public void Graphiccard(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Graphiccard");
			startActivity(i_win);
	    	}
	 
	 
	 public void Mousetargus(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Mousetargus");
			startActivity(i_win);
	    	}
	 
	 public void Mouseamkette(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Mouseamkette");
			startActivity(i_win);
	    	}
	 
	 public void Mousemicrosoft(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Mousemicrosoft");
			startActivity(i_win);
	    	}
	 
	 public void Keyboardmousems(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Keyboardmousems");
			startActivity(i_win);
	    	}
	 
	 
	 public void Not(View view) {
		 Toast.makeText(getApplicationContext(), 
                 "Sorry! No Product Available Right Now.", Toast.LENGTH_LONG).show();
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
