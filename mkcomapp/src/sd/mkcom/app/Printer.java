package sd.mkcom.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;



public class Printer extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.printer);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		}
	
	public void Cannonprnt(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Cannonprnt");
			startActivity(i_win);
	    	}
	
	
	
	
	public void Epson(View view) {
		 Toast.makeText(getApplicationContext(), 
                "Sorry! No Product Available Right Now.", Toast.LENGTH_LONG).show();
	    	}
	public void Hp(View view) {
		 Toast.makeText(getApplicationContext(), 
                "Sorry! No Product Available Right Now.", Toast.LENGTH_LONG).show();
	    	}
	public void Samsung(View view) {
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

