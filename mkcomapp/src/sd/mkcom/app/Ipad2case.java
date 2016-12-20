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

public class Ipad2case extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ipad2case);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**TARGUS CLICK-IN CASE FOR IPAD2 PINK** \n\n HARD SHELL COVER CLICKS SECURELY TO THE BACK OF YOUR IPAD TO PROVIDE PROTECTION FOR THE BACK AND SIDES AND ALLOWS ACCESS TO ALL IPAD PORTS AND FUNCTIONALITY, MAGNETIC CLOSURE ON FRONT COVER TURNS YOUR IPAD ON AND OFF, DURABLE FRONT COVER FOLDS " +
				"BACK TO FORM A STAND FOR EASY VIEWING/TYPING WHILE THE SOFT INNER LINING PROTECTS YOUR IPAD SCREEN");
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLUE);
		b2.setTextColor(Color.WHITE);
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("\n**TARGUS CLICK-IN CASE FOR IPAD2 BLUE** \n\n HARD SHELL COVER CLICKS SECURELY TO THE BACK OF YOUR IPAD TO PROVIDE PROTECTION FOR THE BACK AND SIDES AND ALLOWS ACCESS TO ALL IPAD PORTS AND FUNCTIONALITY, MAGNETIC CLOSURE ON FRONT COVER TURNS YOUR IPAD ON AND OFF, DURABLE FRONT COVER FOLDS" +
				" BACK TO FORM A STAND FOR EASY VIEWING/TYPING WHILE THE SOFT INNER LINING PROTECTS YOUR IPAD SCREEN");
		
		
		Button b3=(Button)findViewById(R.id.button3);
		b3.setBackgroundColor(Color.BLUE);
		b3.setTextColor(Color.WHITE);
		TextView t3=(TextView)findViewById(R.id.textView3);
		t3.setText("\n**TARGUS SLIM CASE-BONE WHITE** \n\n SLIM, STYLISH AND FUNCTIONAL, HANDS-FREE VIEWING ANGLE, HIGH QUALITY EASY-TO-CLEAN EXTERIOR SHELL, SECURELY HOLDS AND PROTECTS YOUR IPAD, SOFT LINING PROTECTS AGAINST SCRATCHES, CASE TRANSFORMS INTO STAND FOR HANDS-FREE VIEWING WITH STUDY " +
				"TYPING ANGLE, ERGONOMIC TYPING ANGLE CONVENIENT STYLUS STORAGE, PORT HOLE TO REVEAL APPLE BRAND");
		
		Button b4=(Button)findViewById(R.id.button4);
		b4.setBackgroundColor(Color.BLUE);
		b4.setTextColor(Color.WHITE);
		TextView t4=(TextView)findViewById(R.id.textView4);
		t4.setText("\n**TARGUS SLIM CASE-CHARCOAL GREY** \n\n SLIM, STYLISH AND FUNCTIONAL, HANDS-FREE VIEWING ANGLE, HIGH QUALITY EASY-TO-CLEAN EXTERIOR SHELL, SECURELY HOLDS AND PROTECTS YOUR IPAD, SOFT LINING PROTECTS AGAINST SCRATCHES, CASE TRANSFORMS INTO STAND FOR HANDS-FREE VIEWING WITH STUDY " +
				"TYPING ANGLE, ERGONOMIC TYPING ANGLE CONVENIENT STYLUS STORAGE, PORT HOLE TO REVEAL APPLE BRAND");
		
		Button b5=(Button)findViewById(R.id.button5);
		b5.setBackgroundColor(Color.BLUE);
		b5.setTextColor(Color.WHITE);
		TextView t5=(TextView)findViewById(R.id.textView5);
		t5.setText("\n**TARGUS 360 ROTATING IPAD2 CASE** \n\n IPAD ROTATES TO PORTRAIT AND LANDSCAPE VIEWING POSITIONS, HANDS-FREE VIEWING FROM 4 DIFFERENT ANGLES, HAND STRAP FOR SECURE HOLDING/CARRYING, EASY ACCESS " +
				"TO BUTTONS AND PORTS, THIN AND SLIM DESIGN, HARD-SHELL EXTERIOR & SOFT MICRO FIBER INTERIOR");
		
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
		
		
	}
	
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Ipad2-Case/Targus/TARGUS-CLICK-IN-CASE-FOR-IPAD2-PINK/pid-2398271.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Ipad2-Case/Targus/TARGUS-CLICK-IN-CASE-FOR-IPAD2-BLUE/pid-2398275.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy3(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Ipad2-Case/Targus/TARGUS-SLIM-CASE-BONE-WHITE/pid-2398279.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy4(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Ipad2-Case/Targus/TARGUS-SLIM-CASE-CHARCOAL-GREY/pid-2398281.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy5(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Ipad2-Case/Targus/TARGUS-360-ROTATING-IPAD2-CASE/pid-2398263.aspx";
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
