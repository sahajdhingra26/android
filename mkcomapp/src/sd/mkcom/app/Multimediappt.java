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

public class Multimediappt extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.multemediappt);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**TARGUS MULTIMEDIA PRESENTATION REMOTE WITH LASER POINTER** \n\n CURSOR CONTROL ALLOWS REMOTE ACCESS TO ALL PROGRAMS, PATENTED KEYLOCKTM TECHNOLOGY LOCKS NON-ESSENTIAL BUTTONS, BACKLIT BUTTONS FOR LOW-LIGHT ENVIRONMENT, LASER POINTER SHOWS WHAT'S IMPORTANT, WORKS UPTO 15M AWAY MINI USB RECEIVER, USB RECEIVER CONVENIENTLY STORES INSIDE, " +
				"2.4GHZ WIRELESS TECHNOLOGY, 1XAAA ENERGIZER BATTERY.");
		
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
	}
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Multimedia-Presentation-Remote/Targus/TARGUS-MULTIMEDIA-PRESENTATION-REMOTE-WITH-LASER-POINTER/pid-2398249.aspx";
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
