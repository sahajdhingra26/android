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

public class Quickheal extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quickheal);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**QUICK HEAL INTERNET SECURITY SINGLE USER FOR 1 YEAR** \n\n Quick Heal 2013 brings the much awaited web browser sandbox feature.");
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLUE);
		b2.setTextColor(Color.WHITE);
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("\n**QUICK HEAL INTERNET SECURITY THREE USER FOR 3 YEAR** \n\n Quick Heal 2013 brings the much awaited web browser sandbox feature.");
		
		
		Button b3=(Button)findViewById(R.id.button3);
		b3.setBackgroundColor(Color.BLUE);
		b3.setTextColor(Color.WHITE);
		TextView t3=(TextView)findViewById(R.id.textView3);
		t3.setText("\n**QUICK HEAL INTERNET SECURITY THREE USER FOR 1 YEAR** \n\n Quick Heal 2013 brings the much awaited web browser sandbox feature.");
		
		Button b4=(Button)findViewById(R.id.button4);
		b4.setBackgroundColor(Color.BLUE);
		b4.setTextColor(Color.WHITE);
		TextView t4=(TextView)findViewById(R.id.textView4);
		t4.setText("\n**QUICK HEAL INTERNET SECURITY SINGLE USER FOR 3 YEAR** \n\n Quick Heal 2013 brings the much awaited web browser sandbox feature.");
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	}
	
	
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Software-Antivirus-Quick-Heal-Internet-Security/Quick-Heal/QUICK-HEAL-INTERNET-SECURITY-SINGLE-USER-FOR-1-YEAR/pid-2398475.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Software-Antivirus-Quick-Heal-Internet-Security/Quick-Heal/QUICK-HEAL-INTERNET-SECURITY-3-USER-FOR-3-YEAR/pid-2398331.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy3(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Software-Antivirus-Quick-Heal-Internet-Security/Quick-Heal/QUICK-HEAL-INTERNET-SCURITY-3-USER-FOR-1-YEAR/pid-2398327.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy4(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Software-Antivirus-Quick-Heal-Internet-Security/Quick-Heal/QUICK-HEAL-INTERNET-SECURITY-SINGLE-USER-FOR-3-YEAR/pid-2398509.aspx";
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
