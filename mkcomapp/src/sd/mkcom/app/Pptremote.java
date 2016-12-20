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

public class Pptremote extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pptremote);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**TARGUS PRESENTATION REMOTE WITH LASER POINTER** \n\n PATENTED KEYLOCK TM TECHNOLOGY LOCKS NON-ESSENTIAL BUTTONS, BACKLIT BUTTONS FOR USE IN LOW-LIGHT ENVIRONMENTS, LASER POINTER SHOWS WHAT'S IMPORTANT, USB RECEIVER CONVENIENTLY STORES INSIDES, 2.4GHZ WIRELESS TECHNOLOGY, MINI " +
				"USB RECEIVER, NETWORK RADIUS 15M, 1 X AAA ENERGIZER BATTERY, PC/MAC/NETBOOK/ULTRABOOK COMPATIBLE");
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
		
	}
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Presentaion-Remote/Targus/TARGUS-PRESENTATION-REMOTE-WITH-LASER-POINTER/pid-2398255.aspx";
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
