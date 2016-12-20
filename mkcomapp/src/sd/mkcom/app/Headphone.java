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

public class Headphone extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.headphone);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**TARGUS MUSIC N CHAT EASY ST. HEADPHONE** \n\n INSTANT SKYPE CONNECTION, HIGH QUALITY DRIVER FOR IPOD AND PC MUSIC REPRODUCTION, ADJUSTABLE HEADBAND TO FIT MOST HEAD SIZES, MICROPHONE ADJUSTS TO" +
				" DESIRED DISTANCE TO CAPTURE YOUR SPEECH & FOLDS FLAT AND SLIDES EASILY INTO LUGGAGE OR LAPTOP CASE");
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLUE);
		b2.setTextColor(Color.WHITE);
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("\n**AMKETTE TRUEBEATS NIRVANA WIRED HEADPHONE** \n\n Extra adapters provide full compatibility with all mobileablets and phones, tablets and PC's. Precisely tuned large drivers deliver high fidelity, natural and soothing sound quality across a wide frequency range." +
				" Pick-up calls, drop calls, use with recording applications and play, pause or change tracks.");
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
		Button b3=(Button)findViewById(R.id.button3);
		b3.setBackgroundColor(Color.BLUE);
		b3.setTextColor(Color.WHITE);
		TextView t3=(TextView)findViewById(R.id.textView3);
		t3.setText("\n**AMKETTE WIRELESS BLUETOOTH HEADPHONE MIC** \n\n MAINLY USED FOR CHATTING ON INTERNET FOR SKYPE & LISTEN MUSIC");
		Button b4=(Button)findViewById(R.id.button4);
		b4.setBackgroundColor(Color.BLUE);
		b4.setTextColor(Color.WHITE);
		TextView t4=(TextView)findViewById(R.id.textView4);
		t4.setText("\n**AMKETTE TRUEBEATS AIR 2.4 WIRELESS HEADPHONE** \n\nIntelligent Wireless Technology delivers true audio experience with CD like sound quality and virtually no dropouts. Precisely tuned large drivers deliver high fidelity, natural and soothing sound quality across a wide frequency " +
				"range. Foldable and soft ear buds makes this easy to carry and comfortable to wear for a long period.");
		
	}
	
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Head-Phone-Mic/Targus/TARGUS-MUSIC-N-CHAT-EASY-ST-HEADPHONE/pid-2398229.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Head-Phone-Mic/Amkette/AMKETTE-TRUEBEATS-NIRVANA-WIRED-HEADPHONE/pid-2584651.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy3(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Head-Phone-Mic/Amkette/AMKETTE-WIRELESS-BLUETOOTH-HEADPHONE-MIC/pid-2398201.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy4(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Head-Phone-Mic/Amkette/AMKETTE-TRUEBEATS-AIR-24-WIRELESS-HEADPHONE/pid-2584453.aspx";
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
