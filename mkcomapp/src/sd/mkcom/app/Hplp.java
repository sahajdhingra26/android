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

public class Hplp extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hplp);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**HP 2000-2106TU LAPTOP** \n\n CELERON DUAL CORE, 2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, WIFI, BLUETOOTH, CAMERA, 15.6''" 
				+"SCREEN, DOS WITH CARRY BAG, 1 YEAR ONSITE WARRANTY FROM HP ALL ACROSS INDIA");
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLUE);
		b2.setTextColor(Color.WHITE);
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("\n**HP 2000-2312TU LAPTOP** \n\n DUAL CORE, 2nd GENERATION, 2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, WIFI, BLUETOOTH, CAMERA, 15.6''" 
				+"SCREEN, WINDOWS 8, FREE ANTIVIRUS, CARRY BAG, 1 YEAR ONSITE WARRANTY FROM HP ALL ACROSS INDIA");
		
		
		Button b3=(Button)findViewById(R.id.button3);
		b3.setBackgroundColor(Color.BLUE);
		b3.setTextColor(Color.WHITE);
		TextView t3=(TextView)findViewById(R.id.textView3);
		t3.setText("\n**HP 2000-2314TU LAPTOP** \n\n CORE I3, 2nd GENERATION, 2GB DDR3 RAM, 500 GB HDD, DVDRW, LAN, WIFI, BLUETOOTH, CAMERA, 15.6''" 
				+"SCREEN, WINDOWS 8, FREE ANTIVIRUS, CARRY BAG, 1 YEAR WARRANTY FROM HP ALL ACROSS INDIA");
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
	}

	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Laptop-Hp/NA/HP-2000-2106TU-LAPTOP/pid-2714187.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Laptop-Hp/Hp/HP-2000-2312TU-LAPTOP/pid-2714849.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy3(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Laptop-Hp/NA/HP-2000-2314TU-LAPTOP/pid-2712799.aspx";
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
