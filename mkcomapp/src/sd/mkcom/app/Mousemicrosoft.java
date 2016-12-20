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

public class Mousemicrosoft extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mousemicrosoft);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**MICROSOFT USB COMPACT MOUSE** \n\n MICROSOFT 3 BUTTON OPTICAL USB 2.0 MOUSE");
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLUE);
		b2.setTextColor(Color.WHITE);
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("\n**MICROSOFT USB OPTICAL MOUSE** \n\n MICROSOFT 3 BUTTON OPTICAL USB 2.0 MOUSE");
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		}
	
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Desktop-Accessories-Mouse-Microsoft/Microsoft/MICROSOFT-USB-COMPACT-MOUSE/pid-2398099.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Desktop-Accessories-Mouse-Microsoft/Microsoft/MICROSOFT-USB-OPTICAL-MOUSE/pid-2398097.aspx";
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
