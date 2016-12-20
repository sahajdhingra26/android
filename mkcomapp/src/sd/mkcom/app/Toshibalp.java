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

public class Toshibalp extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.toshibalp);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**TOSHIBA SATELLITE C850-P0011 LAPTOP** \n\n DUAL CORE, 2nd GENERATION, 2GB DDR3 RAM, 320GB HDD, DVDRW, LAN, WIFI, BLUETOOTH, CAMERA, 15.6" 
				+"SCREEN, DOS WITH CARRY BAG, 1 YEAR ONSITE WARRANTY FROM TOSHIBA ALL ACROSS INDIA");
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLUE);
		b2.setTextColor(Color.WHITE);
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("\n**TOSHIBA C850-P5011 LAPTOP** \n\n DUAL CORE, 2nd GENRATION, 2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, WIFI, BLUETOOTH, CAMERA, 15.6" 
				+"SCREEN, DOS WITH CARRY BAG, 1 YEAR ONSITE WARRANTY FROM TOSHIBA ALL ACROSS INDIA");
		
		
		Button b3=(Button)findViewById(R.id.button3);
		b3.setBackgroundColor(Color.BLUE);
		b3.setTextColor(Color.WHITE);
		TextView t3=(TextView)findViewById(R.id.textView3);
		t3.setText("\n**TOSHIBA C840-I4011 LAPTOP** \n\n CORE I3, 2nd GENERATION, 2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, WIFI, BLUETOOTH, CAMERA, 14.1" 
				+"SCREEN, DOS WITH CARRY BAG, 1 YEAR ONSITE WARRANTY FROM TOSHIBA ALL ACROSS INDIA");
		
		Button b4=(Button)findViewById(R.id.button4);
		b4.setBackgroundColor(Color.BLUE);
		b4.setTextColor(Color.WHITE);
		TextView t4=(TextView)findViewById(R.id.textView4);
		t4.setText("\n**TOSHIBA SATELLITE C850-I5011 LAPTOP** \n\n CORE I3, 2nd GENERATION, 2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, WIFI, BLUETOOTH, CAMERA, 15.6" 
				+"SCREEN, DOS WITH CARRY BAG, 1 YEAR ONSITE WARRANTY FROM TOSHIBA ALL ACROSS INDIA");
		
		Button b5=(Button)findViewById(R.id.button5);
		b5.setBackgroundColor(Color.BLUE);
		b5.setTextColor(Color.WHITE);
		TextView t5=(TextView)findViewById(R.id.textView5);
		t5.setText("\n**TOSHIBA C840-I4210 LAPTOP** \n\n CORE I3, 2nd GENERATION, 2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, WIFI, BLUETOOTH, CAMERA, 14.1" 
				+"SCREEN, WINDOW 7 HOME BASIC, FREE ANTIVIRUS, CARRY BAG, 1 YEAR ONSITE WARRANTY FROM TOSHIBA ALL ACROSS INDIA");
		
		
		Button b6=(Button)findViewById(R.id.button6);
		b6.setBackgroundColor(Color.BLUE);
		b6.setTextColor(Color.WHITE);
		TextView t6=(TextView)findViewById(R.id.textView6);
		t6.setText("\n**TOSHIBA SATELLITE C850-I5213 LAPTOP** \n\n CORE I3, 2nd GENERATION,2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, WIFI, BLUETOOTH, CAMERA, 15.6" 
				+"SCREEN, WINDOW 7 HOME BASIC, FREE ANTIVIRUS, CARRY BAG, 1 YEAR ONSITE WARRANTY FROM TOSHIBA ALL ACROSS INDIA");
		
		Button b7=(Button)findViewById(R.id.button7);
		b7.setBackgroundColor(Color.BLUE);
		b7.setTextColor(Color.WHITE);
		TextView t7=(TextView)findViewById(R.id.textView7);
		t7.setText("\n**TOSHIBA SATELLITE C850-I5212 LAPTOP** \n\n CORE I3, 2nd GENERATION, 4GB DDR3 RAM, 500GB HDD, DVDRW, LAN, WIFI, BLUETOOTH, CAMERA, 15.6" 
				+"SCREEN, WINDOW 7 HOME BASIC, FREE ANTIVIRUS, 1GB GRAPHIC CARD, CARRY BAG, 1 YEAR ONSITE WARRANTY FROM TOSHIBA ALL ACROSS INDIA");
		
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
	}
	
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Laptop-Toshiba/Toshiba/TOSHIBA-SATELLITE-C850-P0011-LAPTOP/pid-2700897.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Laptop-Toshiba/Toshiba/TOSHIBA-C850-P5011-LAPTOP/pid-2720693.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy3(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Laptop-Toshiba/Toshiba/TOSHIBA-C840-I4011-LAPTOP/pid-2720831.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy4(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Laptop-Toshiba/Toshiba/TOSHIBA-SATELLITE-C850-I5011-LAPTOP/pid-2725719.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy5(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Laptop-Toshiba/Toshiba/TOSHIBA-C840-I4210-LAPTOP/pid-2721385.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy6(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Laptop-Toshiba/Toshiba/TOSHIBA-SATELLITE-C850-I5213-LAPTOP/pid-2725757.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy7(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Laptop-Toshiba/Toshiba/TOSHIBA-SATELLITE-C850-I5212-LAPTOP/pid-2726381.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
/*public void Buy1(View view) {
		String url = "";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url = "";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy3(View view) {
		String url = "";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy4(View view) {
		String url = "";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy5(View view) {
		String url = "";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy6(View view) {
		String url = "";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy7(View view) {
		String url = "";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
*/
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
