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

public class Powerstrip extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.powerstrip);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**HUNTKEY PZD401-2 POWER STRIP** \n\n AN ELECTRICAL DEVICE CONSISTING OF A CORD WITH AA PLUG ON ONE END AND SEVERAL SOCKETS ON THE OTHER");
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLUE);
		b2.setTextColor(Color.WHITE);
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("\n**HUNTKEY PZA402-2 POWER STRIP** \n\n AN ELECTRICAL DEVICE CONSISTING OF A CORD WITH AA PLUG ON ONE END AND SEVERAL SOCKETS ON THE OTHER");
		
		
		Button b3=(Button)findViewById(R.id.button3);
		b3.setBackgroundColor(Color.BLUE);
		b3.setTextColor(Color.WHITE);
		TextView t3=(TextView)findViewById(R.id.textView3);
		t3.setText("\n**HUNTKEY PZB404-2 POWER STRIP** \n\nAN ELECTRICAL DEVICE CONSISTING OF A CORD WITH AA PLUG ON ONE END AND SEVERAL SOCKETS ON THE OTHER WITH USB CHARGING ");
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	}
	
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Power-Strip/Huntkey/HUNTKEY-PZD401-2-POWER-STRIP/pid-2398209.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Power-Strip/Huntkey/HUNTKEY-PZA402-2-POWER-STRIP/pid-2398211.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy3(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Power-Strip/Huntkey/HUNTKEY-PZB404-2-POWER-STRIP/pid-2398215.aspx";
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
