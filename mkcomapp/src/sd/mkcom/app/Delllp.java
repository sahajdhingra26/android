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

public class Delllp extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.delllp);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**DELL INSPIRON 15R 3521 DUAL CORE LAPTOP** \n\n DUAL CORE, 2nd GENERATION, 2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, WIFI, BLUETOOTH, CAMERA, 15.6''"
				+" SCREEN, WINDOWS 8, FREE ANTIVIRUS, CARRY BAG, 1 YEAR ONSITE WARRANTY FROM DELL ALL ACROSS INDIA");
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLUE);
		b2.setTextColor(Color.WHITE);
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("\n**DELL INSPIRON 15R 3521 CORE I3 LAPTOP** \n\n CORE I3, 2nd GENERATION, 2GB DDR3 RM, 500GB HDD, DVDRW, LAN, WIFI, BLUETOOTH, CAMERA, 15.6''" 
				+"SCREEN, WINDOWS 8, FREE ANTIVIRUS, CARRY BAG, 1 YEAR ONSITE WARRANTY FROM DELL ALL ACROSS INDIA");
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	}
	
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Laptop-Dell/Dell/DELL-INSPIRON-15R-3521-DUAL-CORE-LAPTOP/pid-2725403.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Laptop-Dell/Dell/DELL-INSPIRON-15R-3521-CORE-I3-LAPTOP/pid-2725595.aspx";
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
