package sd.mkcom.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class Laptop extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.laptop);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	}
	
	 public void Acerlp(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Acerlp");
			startActivity(i_win);
	    	}

	 public void Delllp(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Delllp");
			startActivity(i_win);
	    	}
	 
	 public void Hplp(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Hplp");
			startActivity(i_win);
	    	}
	 

	 public void Lenovolp(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Lenovolp");
			startActivity(i_win);
	    	}
	 
	 public void Sonylp(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Sonylp");
			startActivity(i_win);
	    	}
	 
	 public void Toshibalp(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Toshibalp");
			startActivity(i_win);
	    	}
	 
	
	 
	 
	 public void Compaqlp(View view) {
		 Toast.makeText(getApplicationContext(), 
                 "Sorry! No Product Available Right Now.", Toast.LENGTH_LONG).show();
	    	}
	 public void Fujitsu(View view) {
		 Toast.makeText(getApplicationContext(), 
                 "Sorry! No Product Available Right Now.", Toast.LENGTH_LONG).show();
	    	}
	 public void Ibm(View view) {
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
