package sd.mkcom.app;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class Laptopacc extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.laptopacc);
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
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	}
	
	public void Ramlp(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Ramlp");
			startActivity(i_win);
	    	}
	
	public void Harddisklp(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Harddisklp");
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
