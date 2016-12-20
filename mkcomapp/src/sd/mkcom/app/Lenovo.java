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

public class Lenovo extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lenovo);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("**\nLENOVO EDGE72 3492 3YQ THINKCENTRE DESKTOP**\n\nIntel Dual Core G645 (2.9GHz), 2GB DDR3 Ram, 500GB HDD, DVDRW, Lan, USB, 18.5''" 
				+"Screen, Wired Keyboard & Mouse, Dos, 1 Year Warranty From Lenovo all across India");
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	}
	
	public void Buy(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Desktop-Pc-Lenovo/Lenovo/LENOVO-EDGE72-3492-3YQ-THINKCENTRE-DESKTOP/pid-2767503.aspx";
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
