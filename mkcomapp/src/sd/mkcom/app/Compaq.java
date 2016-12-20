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

public class Compaq extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.compaq);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("**\nCompaq CQ1210IX (QE970AA) Desktop PC**\n\nAMD DUAL CORE E450 (1.65 GHz), 2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, USB, 18.5''" +
				" SCREEN, WIRED KEYBOARD & MOUSE, DOS, 1 YEAR ONSITE WARRANTY ALL ACROSS INDIA");
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		}
	
	public void Buy(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Desktop-Pc-Compaq/Compaq/Compaq-CQ1210IX-(QE970AA)-Desktop-PC-/pid-2757988.aspx";
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
