package sd.mkcom.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class Pannel extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pannel);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	}
	
	
	public void HPpanel(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.HPpanel");
			startActivity(i_win);
	    	}
	
	
	public void Lenovo(View view) {
		 Toast.makeText(getApplicationContext(), 
                "Sorry! No Product Available Right Now.", Toast.LENGTH_LONG).show();
	    	}
	
	
	public void Dell(View view) {
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
