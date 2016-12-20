package sd.mkcom.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Desktop extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.desktop);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	}
	public void Acer(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Acer");
			startActivity(i_win);
	    	}
	
	public void Hp(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Hp");
			startActivity(i_win);
	    	}
	
	
	public void Compaq(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Compaq");
			startActivity(i_win);
	    	}
	
	
	public void Lenovo(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Lenovo");
			startActivity(i_win);
	    	}
	
	
	public void Hcl(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Hcl");
			startActivity(i_win);
	    	}
	
	
	public void Dell(View view) {
		 Intent i_win = new Intent("sd.mkcom.app.Dell");
			startActivity(i_win);
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
