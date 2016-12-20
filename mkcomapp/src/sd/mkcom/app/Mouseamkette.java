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

public class Mouseamkette extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mouseamkette);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**AMKETTE USB MOUSE** \n\n MICROSOFT 3 BUTTON OPTICAL USB 2.0 MOUSE");
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLUE);
		b2.setTextColor(Color.WHITE);
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("\n**AMKETTE ERGO WIRELESS MOUSE** \n\n Enjoy upto 10 mtrs. of wireless freedom, 4 levels of power management provides long hours of functioning, Ambedextrous mouse with elegant " +
				"finish & rubberized grip for a better grasp, A design that is made for comforting the workaholics.");
		
		
		Button b3=(Button)findViewById(R.id.button3);
		b3.setBackgroundColor(Color.BLUE);
		b3.setTextColor(Color.WHITE);
		TextView t3=(TextView)findViewById(R.id.textView3);
		t3.setText("\n**AMKETTE ELEMENT WIRELESS MOUSE** \n\n Compact designed with rubberised grip this 1000 DPI mouse is a perfect match for your laptop, It boastsna scratch resistant elegant Piano finish with an appealing brushed metalic curvature, small size receiver that snugly fits " +
				"in the mouse for convenient portability, enhanced power saving technology for long lasting battery.");
		
		Button b4=(Button)findViewById(R.id.button4);
		b4.setBackgroundColor(Color.BLUE);
		b4.setTextColor(Color.WHITE);
		TextView t4=(TextView)findViewById(R.id.textView4);
		t4.setText("\n**AMKETTE AIR WIRELESS MOUSE** \n\n Dynamic tracking technology adds precision to your work with its swichable resolution, ergonomic and slim design with velvet touch gives comfortable navigation, small size receiver that snugly fits " +
				"in the mouse for convenient portability, enhanced power saving technology for long lasting battery.");
		
		Button b5=(Button)findViewById(R.id.button5);
		b5.setBackgroundColor(Color.BLUE);
		b5.setTextColor(Color.WHITE);
		TextView t5=(TextView)findViewById(R.id.textView5);
		t5.setText("\n**AMKETTE PEARL BLUETOOTH MOUSE** \n\n Bluetooth technology ensures that you no longer require a USB dongle occupying a precious port in your laptop, netbook or tablet. Just sync it with your device once and it is instantly paired forever. It is an ideal companion for- Laptops, netbooks, " +
				"Tablets and other bluetooth enabled smart devices for fast & precise movement across the screen.");
		
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
		
		
	}
	
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Desktop-Accessories-Mouse-Amkette/Amkette/AMKETTE-USB-MOUSE/pid-2398107.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Desktop-Accessories-Mouse-Amkette/Amkette/AMKETTE-ERGO-WIRELESS-MOUSE/pid-2584409.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy3(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Desktop-Accessories-Mouse-Amkette/Amkette/AMKETTE-ELEMENT-WIRELESS-MOUSE/pid-2584287.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy4(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Desktop-Accessories-Mouse-Amkette/Amkette/AMKETTE-AIR-WIRELESS-MOUSE/pid-2584213.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy5(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Desktop-Accessories-Mouse-Amkette/Amkette/AMKETTE-PEARL-BLUETOOTH-MOUSE/pid-2584415.aspx";
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
