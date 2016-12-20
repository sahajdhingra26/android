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

public class Usbbattery extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.usbbattery);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**TARGUS USB BATTERY RE-CHARGER IPOD** \n\n POWER AND RECHARGE IPOD, OR OTHER USB CHARGED DEVICES, LED FLASH LIGHT WITH ON/OFF SWITCH, 3.5 HOURS MAXIMUM CHARGING TIME CUTOFF, DEFECTIVE OR NON-RECHARGEABLE BATTERY DETECTION, OPERATED BY 4 AAA (ALKALINE OR RECHARGEABLE) BATTERIES TEMPERATURE SENSOR, OVER-CURRENT " +
				"AND SHORT CIRCUIT PROTECTION, COMPATIBLE WITH NEW IPOD NANO, IPHONE.");
		
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
	}
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-USB-Battery/Targus/TARGUS-USB-BATTERY-RE-CHARGER-IPOD/pid-2398245.aspx";
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
