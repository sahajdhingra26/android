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

public class Sonylp extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sonylp);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**SONY VAIO SVE1513ACN LAPTOP** \n\n CORE I3, 2nd GENERATION, 2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, WIFI, BLUETOOTH, CAMERA, 15.6''"
				+" SCREEN, WINDOWS 8, FREE ANTIVIRUS, CARRY BAG, 1 YEAR ONSITE WARRANTY FROM SONY ALL ACROSS INDIA");
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
		
	}
	
	
	public void Buy(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Laptop-Sony-Vaio/Sony-VAIO/SONY-VAIO-SVE1513ACN-LAPTOP/pid-2718385.aspx";
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
