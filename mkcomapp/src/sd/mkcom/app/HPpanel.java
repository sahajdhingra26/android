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

public class HPpanel extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hppanel);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**HP BRAZO 18-1101IX** \n\n " +
				"AMD DUAL CORE E1-1200, 1.8GHz, 2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, WIFI, CAMERA, UBUNTU, ANTIVIRUS " +
				"FREE FOR LIFE TIME, WIRED KEYBOARD & MOUSE, 18.5''" +"TFT, 3 YEARS ONSITE WARRANTY FROM HP ALL ACROSS INDIA");
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLUE);
		b2.setTextColor(Color.WHITE);
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("\n**HP BRAZO 18-1106IN** \n\n APU DUAL CORE, E1-1200 APU, 2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, WIFI, CAMERA, 18.5''" 
				+"TFT, WIRED KEYBOARD & MOUSE, WINDOWS 8, FREE ANTIVIRUS, 3 YEARS ONSITE WARRANTY FROM HP ALL ACROSS INDIA");
		
		
		Button b3=(Button)findViewById(R.id.button3);
		b3.setBackgroundColor(Color.BLUE);
		b3.setTextColor(Color.WHITE);
		TextView t3=(TextView)findViewById(R.id.textView3);
		t3.setText("\n**HP OMNI AIO 120-1232IL** \n\n INTEL CELERON DUAL CORE G550, 2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, WIFI, CAMERA, 20''" 
				+" SCREEN, DOS, WIRELESS KEYBOARD & MOUSE, 3 YEARS ONSITE WARRANTY FROM HP ALL ACROSS INDIA");
		
		Button b4=(Button)findViewById(R.id.button4);
		b4.setBackgroundColor(Color.BLUE);
		b4.setTextColor(Color.WHITE);
		TextView t4=(TextView)findViewById(R.id.textView4);
		t4.setText("\n**HP OMNI AIO 120-1234IL** \n\n PENTIUM DUAL CORE G645, 2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, WIFI, CAMERA, 20''" 
				+"SCREEN, WIRELESS KEYBOARD & MOUSE, DOS, 1 YEAR ONSITE WARRANTY FROM HP ALL ACROSS INDIA");
		
		Button b5=(Button)findViewById(R.id.button5);
		b5.setBackgroundColor(Color.BLUE);
		b5.setTextColor(Color.WHITE);
		TextView t5=(TextView)findViewById(R.id.textView5);
		t5.setText("\n**HP OMNI AIO 100-6110IX** \n\n Dual Core 3.2Ghz, 2GB DDR3 Laptop RAM (Expandable to 8GB), 500 GB Hard Disk, DVD Writer, Card Reader, USB Keyboard & USB Mouse, 20.0''" 
				+"TFT with inbuilt Speaker & Linux, 3 Years Onsite Warranty from HP All across India");
		
		
		Button b6=(Button)findViewById(R.id.button6);
		b6.setBackgroundColor(Color.BLUE);
		b6.setTextColor(Color.WHITE);
		TextView t6=(TextView)findViewById(R.id.textView6);
		t6.setText("\n**HP OMNI AIO 105-5520IX** \n\n DUAL CORE G645, 2GB DDR3 RAM, 500GB HDD, DVDRW, LAN, WIFI, CAMERA, 20''" 
				+"SCREEN, DOS, WIRELESS KEYBOARD & MOUSE, 1 YEAR ONSITE WARRANTY FROM HP ALL ACROSS INDIA");
		Button b7=(Button)findViewById(R.id.button7);
		b7.setBackgroundColor(Color.BLUE);
		b7.setTextColor(Color.WHITE);
		TextView t7=(TextView)findViewById(R.id.textView7);
		t7.setText("\n**HP OMNI AIO 120-1020IN** \n\n Dual Core 2.6Ghz, 2GB DDR3 RAM (Expandable to 8GB), 1 TB Hard Disk, DVD Writer, Card Reader, USB Keyboard & USB Mouse, 20.0''" 
				+"TFT with inbuilt Speaker & Original Windows 7 Home Basic, 3 Years Onsite Warranty from HP All across India");
		
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
	}
	
	
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Panel-Pc--All-In-One-Desktop-Pc-Hp/HP-BRAZO/HP-BRAZO-18-1101IX/pid-2536595.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Panel-Pc--All-In-One-Desktop-Pc-Hp/Hp/HP-BRAZO-18-1106IN/pid-2727195.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy3(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Panel-Pc--All-In-One-Desktop-Pc-Hp/Hp/HP-OMNI-AIO-120-1232IL/pid-2734607.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy4(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Panel-Pc--All-In-One-Desktop-Pc-Hp/Hp/HP-OMNI-AIO-120-1234IL/pid-2743277.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy5(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Panel-Pc--All-In-One-Desktop-Pc-Hp/Hp/HP-OMNI-AIO-100-6110IX/pid-2397997.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy6(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Panel-Pc--All-In-One-Desktop-Pc-Hp/Hp/HP-OMNI-AIO-105-5520IX/pid-2743309.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy7(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Panel-Pc--All-In-One-Desktop-Pc-Hp/Hp/HP-OMNI-AIO-120-1020IN/pid-2398003.aspx";
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
