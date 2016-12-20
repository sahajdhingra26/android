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

public class Carcharger extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.carcharger);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**TARGUS DC CAR CHARGER FOR IPAD/TABLET** \n\n SMALL LIGHTWEIGHT CAR CHARGER FOR YOUR IPAD, IPHONE AND IPOD, INCLUDES IPAD USB SYNC CABLE, OUTPUT 2.1A/5V");
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLUE);
		b2.setTextColor(Color.WHITE);
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("\n**TARGUS DUAL USB CAR CHARGER FOR TABLETS & SMART PHONES** \n\n SIMULTANEOUSLY POWER AND CHARGER YOUR IPAD AND MOBILE PHONES, " +
				"OR TWO MOBILE PHONE SIN THE CAR SIMPLY CONNECT TO CHARGER USING USB CABLES SUPPLIED WITH YOUR DEVICES, COMPACT CAR CHARGER EASILY GOES ANYWHERE, CHARGE OTHER USB CHARGED DEVICES WITH APPROPRIATE CABLE, OUTPUT 3.1 A/5V");
		
		
		Button b3=(Button)findViewById(R.id.button3);
		b3.setBackgroundColor(Color.BLUE);
		b3.setTextColor(Color.WHITE);
		TextView t3=(TextView)findViewById(R.id.textView3);
		t3.setText("\n**TARGUS CAR CHARGER FOR LAPTOP & USB TABLET** \n\nBEST SECURITY, OVER VOLTAGE, OVER CURRENT AND SHORT CIRCUIT PROTECTION, " +
				"COMPATIBLE WITH ALL MAJOR LAPTOP BRANDS, SLIM AND LIGHTWEIGHT, 2.1A/5V USB OUTPUT, CHARGE YOUR USB-POWERED DEVICE AT THE SAME SPEED AS YOUR ORIGINAL ADAPTER, INCLUDES 7 CONNECTOR TIPS ");
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	}
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Car-Charger/Targus/TARGUS-DC-CAR-CHARGER-FOR-IPADTABLET/pid-2398237.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Car-Charger/Targus/TARGUS-DUAL-USB-CAR-CHARGER-FOR-TABLETS--SMART-PHONES/pid-2398461.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy3(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Car-Charger/Targus/TARGUS-CAR-CHARGER-FOR-LAPTOP--USB-TABLET/pid-2398459.aspx";
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
