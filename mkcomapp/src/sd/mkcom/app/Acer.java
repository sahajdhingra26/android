package sd.mkcom.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;

public class Acer extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acer);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("**ACER DUAL CORE VERITON 3710 DESKTOP**\n\nINTEL PENTIUM DUAL CORE E6600 (3.06 GHz), 2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, USB, ACER 18.5'' " +
				"LCD TFT, WIRED KEYBOARD & MOUSE, DOS, 1 YEAR WARRANTY FROM ACER ALL ACROSS INDIA");
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	}
	
	
	public void Buy(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Desktop-Pc-Acer/Acer/ACER-DUAL-CORE-VERITON-3710-DESKTOP/pid-2757785.aspx";
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
