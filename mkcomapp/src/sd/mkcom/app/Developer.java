package sd.mkcom.app;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;


import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.view.WindowManager;

import android.widget.Button;
import android.widget.TextView;


public class Developer extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.developer);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setTextColor(Color.WHITE);
		t1.setText("developed by");
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setTextColor(Color.WHITE);
		t2.setText("Sahaj Dhingra");
		TextView t3=(TextView)findViewById(R.id.textView3);
		t3.setTextColor(Color.WHITE);
		t3.setText("graphics by");
		TextView t4=(TextView)findViewById(R.id.textView4);
		t4.setTextColor(Color.WHITE);
		t4.setText("Madhavi Nyati");
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLACK);
		b1.setTextColor(Color.WHITE);
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLACK);
		b2.setTextColor(Color.WHITE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	}
	
	public void Site(View view) {
		String url = "http://www.sahajdhingra.com/";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Blog(View view) {
		String url = "http://sahajdhingra.blogspot.in/";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
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