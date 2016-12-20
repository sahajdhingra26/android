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

public class Ram extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ram);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**RAM 2GB DDR3** \n\n SUPPORTS PENTIUM-DUAL " +
				"CORE 2ND GENERATION AND LATER CPU CARRIES 3 YEAR WARRANTY FROM COMPANY");
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLUE);
		b2.setTextColor(Color.WHITE);
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("\n**RAM 512MB** \n\n SUPPORTS PENTIUM-4 AND" +
				" OLDER CPU CARRIES 3 YEAR WARRANTY FROM COMPANY");
		
		
		Button b3=(Button)findViewById(R.id.button3);
		b3.setBackgroundColor(Color.BLUE);
		b3.setTextColor(Color.WHITE);
		TextView t3=(TextView)findViewById(R.id.textView3);
		t3.setText("\n**RAM 1GB DDR2** \n\n SUPPORTS PENTIUM-DUAL CORE AND NEW CPU CARRIES 3 YEAR WARRANTY FROM COMPANY");
		
		Button b4=(Button)findViewById(R.id.button4);
		b4.setBackgroundColor(Color.BLUE);
		b4.setTextColor(Color.WHITE);
		TextView t4=(TextView)findViewById(R.id.textView4);
		t4.setText("\n**RAM 1GB DDR** \n\nSUPPORTS PENTIUM-4 AND OLDER CPU CARRIES 3 YEAR WARRANTY FROM COMPANY");
		
		Button b5=(Button)findViewById(R.id.button5);
		b5.setBackgroundColor(Color.BLUE);
		b5.setTextColor(Color.WHITE);
		TextView t5=(TextView)findViewById(R.id.textView5);
		t5.setText("\n**RAM 4GB DDR3** \n\n SUPPORTS PENTIUM-DUAL CORE 2ND GENERATION AND LATER CPU CARRIES 3 YEAR WARRANTY FROM COMPANY");
		
		
		Button b6=(Button)findViewById(R.id.button6);
		b6.setBackgroundColor(Color.BLUE);
		b6.setTextColor(Color.WHITE);
		TextView t6=(TextView)findViewById(R.id.textView6);
		t6.setText("\n**RAM 2GB DDR2** \n\n SUPPORTS PENTIUM-DUAL CORE AND NEW CPU CARRIES 3 YEAR WARRANTY FROM COMPANY");
		
		Button b7=(Button)findViewById(R.id.button7);
		b7.setBackgroundColor(Color.BLUE);
		b7.setTextColor(Color.WHITE);
		TextView t7=(TextView)findViewById(R.id.textView7);
		t7.setText("\n**RAM 8GB DDR3** \n\n SUPPORTS ONLY SOME PARTICULAR MOTHER BOARD CARRIES 3 YEAR WARRANTY FROM COMPANY");
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
		
	}
	
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Desktop-Accessories-Ram/Transcend/RAM-2GB-DDR3/pid-2398051.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Desktop-Accessories-Ram/Kingston/RAM-512MB/pid-2398037.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy3(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Desktop-Accessories-Ram/Transcend/RAM-1GB-DDR2/pid-2398045.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy4(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Desktop-Accessories-Ram/Transcend/RAM-1GB-DDR/pid-2398041.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy5(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Desktop-Accessories-Ram/Transcend/RAM-4GB-DDR3/pid-2398055.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy6(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Desktop-Accessories-Ram/Transcend/RAM-2GB-DDR2/pid-2398047.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy7(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Desktop-Accessories-Ram/Transcend/RAM-8GB-DDR3/pid-2398059.aspx";
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
