package sd.mkcom.app;

import android.app.Activity;


import android.os.Bundle;

import android.view.WindowManager;

import android.widget.TextView;


public class MKC extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mkc);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("M K Computers");
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("M.K.Computer came into existence in 1991 as a Desktop Publishing unit mainly known as DTP and then solely shifted to Hardware Business with the objective of selling and buying of computer related products. Today, we're having more than 10,000 satisfied customers all across Delhi and NCR, with some good corporate sector also. We are authorised partner for Sony, Dell, HP, Toshiba, and also sells almost all brand. We not only sell New Hardware but also undertake Annual " +
				"Maintenance Contract (AMC) for old systems. We are having dedicated Engineers for our AMC business.");

		TextView t3=(TextView)findViewById(R.id.textView3);
		t3.setText("It will be our pleasure to receive any query from you because we value our customers. Kindly contact us at:" +
				"\nEmail - info@mkcomputer.co.in" +
				"\nPhone - 011-28877614, 011-27941803" +
				"\nMobile - 09899864383\nOr you can write to us at -" +
				"\nM K COMPUTER" +
				"\nSHOP NO 217, 2ND FLOOR, RING ROAD MALL" +
				"\nSECTOR-3, ROHINI, NEAR KALI MATA MANDIR" +
				"\nDELHI-110085");

		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
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