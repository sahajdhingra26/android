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

public class Usbhub extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.usbhub);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**HI-SPEED USB HUB** \n\n A DEVICE THAT INCREASES THE NUMBER OF USB PORTS IN A PC. HOWEVER, SINCE THE HUB PLUGS INTO ONE OF THE USB PORTS ON THE COMPUTER, THE TOTAL NUMBER OF ADDITIONAL PORTS IS MINUS ONE.");
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLUE);
		b2.setTextColor(Color.WHITE);
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("\n**TARGUS AMPOR 4-PORT HUB** \n\n TURN 1 USB PORT INTO 4 WITH ONE OPEN PORT, CONNECT UPTO 4 ELECTRONIC DEVICES TO YOUR LAPTOP AT ONCE, INCLUDING MOUSE, FLASH DRIVE, MP3 PLAYER AND MUCH MORE, HIGH-SPEED TRANSFER RATES UPTO 480 MBPS, ATTATCHED CABLE NEVER GETS LOST, COMPACT AND LIGHTWEIGHT, PC/MAC/NETBOOK/ULTRABOOK COMPATIBLE");
		
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);	
		
	}
	
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-USB-Hub/Hi-Speed/HI-SPEED-USB-HUB/pid-2398221.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-USB-Hub/Targus/TARGUS-AMPOR-4-PORT-HUB/pid-2398259.aspx";
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
