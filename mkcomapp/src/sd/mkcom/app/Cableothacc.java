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

public class Cableothacc extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cableothacc);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**TARGUS FILE TRANSFER CABLE** \n\nQUICKLY TRANSFER DATA FROM PC TO PC, MAC TO MAC, MAC TO PC, OR PC TO MAC AT A HIGH TRANSFER RATE, CAN REPLACE OTHER FORMS OF MEDIA SUCH AS CDs OR DVDs FOR DATA TRANSFERRING, JUST PLUG IN THE TARGUS FOR MAC FILE SHARE CABLE AND YOU'RE READY " +
				"TO DRAG-AND-DROP FILES, TRANSFER IS QUICK AND SEAMLESS, SHARING HAS NEVER BEEN THIS SIMPLER");
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
		
	}
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Cable/Targus/TARGUS-FILE-TRANSFER-CABLE/pid-2398253.aspx";
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
