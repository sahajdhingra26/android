package sd.mkcom.app;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class Antivirus extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.antivirus);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setTextColor(Color.WHITE);
		Button b2=(Button)findViewById(R.id.button2);
		b2.setTextColor(Color.WHITE);
		Button b3=(Button)findViewById(R.id.button3);
		b3.setTextColor(Color.WHITE);
		Button b4=(Button)findViewById(R.id.button4);
		b4.setTextColor(Color.WHITE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);}
	
	public void Norton(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Norton");
			startActivity(i_win);
	    	}
	public void Quickheal(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Quickheal");
			startActivity(i_win);
	    	}
	public void Msoffice(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Msoffice");
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
