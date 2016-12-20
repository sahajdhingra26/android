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

public class Cannonprnt extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cannonprnt);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**CANON MP287 INKJET PHOTO ALL-IN-ONE PRINTER** \n\nCANON PIXMA MP287 INKJET PHOTO ALL-IN-ONE PRINTER, WORKS ON WINDOWS 7, WINDOWS 7 SP1, WINDOWS VISTA, VISTA SP1/SP2, WINDOWS XP SP2/SP3, " +
				"PRINT SPEED BLACK: 8.4, PRINT SPEED COLOUR: 4.8, USB PORT, 1 YEAR WARRANTY FROM CANON ALL ACROSS INDIA");
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLUE);
		b2.setTextColor(Color.WHITE);
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("\n**CANON E510 INKJET INKEFFICIENT PRINTER** \n\n CANON PIXMA INKJET E510 ALL IN ONE PRINTER, WORK ON WINDOWS 7, WINDOWS 7 SP1 32/64-BIT, WINDOWS VISTA SP1, VISTA SP2 32/64-BIT, WINDOWS XP SP3 32-BIT, MAC OS X v10.5.8, 10.6, 10.7, 2 PICO LITRE TECHNOLOGYENHANCED " +
				"FULL HD MOVIE PRINT, MONO: 8.6 IPM, COLOUR: 5.0 IPM, 1 YEAR WARRANTY FROM CANON ALL ACROSS INDIA");
		
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);		
		
		
	}
	

	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Computers-Printers-Canon/Canon/CANON-MP287-INKJET-PHOTO-ALL-IN-ONE-PRINTER/pid-2398029.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url ="http://www.mkcomputer.co.in/Products/Computers-Printers-Canon/Canon/CANON-E510-INKJET-INKEFFICIENT-PRINTER/pid-2398025.aspx";
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
