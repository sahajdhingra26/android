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

public class Laptopbag extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.laptopbag);
		Button b1=(Button)findViewById(R.id.button1);
		b1.setBackgroundColor(Color.BLUE);
		b1.setTextColor(Color.WHITE);
		TextView t1=(TextView)findViewById(R.id.textView1);
		t1.setText("\n**TARGUS 13'' DRIFTER SLIPCASE FOR MACBOOK** \n\nSCRATCH-RESISTANT LINING AND WATER RESISTANT BOTTOM, 2-BUCKLE SECURE CLOSURE SYSTEM, DELUXE WORKSTATION, SOFT-LINED ACCESSORY POCKETS, LARGE ZIPPERED POCKET, DOCUMENTS " +
				"AND FILES STORAGE, ERGONOMIC PADDED ADJUSTABLE SHOULDER STRAP & INTEGRATED CARRYING HANDLE");
		
		Button b2=(Button)findViewById(R.id.button2);
		b2.setBackgroundColor(Color.BLUE);
		b2.setTextColor(Color.WHITE);
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText("\n**TARGUS 15'' DRIFTER SLIPCASE FOR MACBOOK** \n\n SCRATCH-RESISTANT LINING AND WATER RESISTANT BOTTOM, 2-BUCKLE SECURE CLOSURE SYSTEM, DELUXE WORKSTATION, SOFT-LINED ACCESSORY POCKETS, LARGE ZIPPERED POCKET, DOCUMENTS " +
				"AND FILES STORAGE, ERGONOMIC PADDED ADJUSTABLE SHOULDER STRAP & INTEGRATED CARRYING HANDLE");
		
		
		Button b3=(Button)findViewById(R.id.button3);
		b3.setBackgroundColor(Color.BLUE);
		b3.setTextColor(Color.WHITE);
		TextView t3=(TextView)findViewById(R.id.textView3);
		t3.setText("\n**TARGUS 15.4'' SPORTS BACKPACK** \n\n REMOVABLE PADDED SLIPCASE FITS NOTEBOOKS WITH UP TO 15.4'' SCREENS, 600D POLYESTER, " +
				"ZIP DOWN COMPARTMENT PROVIDES EASY ACCESS TO MULTIPLE ACCESSORY POCKETS FOR IMPROVED ORGANIZATION, " +
				"FRONT BUCKLE DESIGN ALLOWS FOR STORAGE OF A JACKET OR SWEATER.");
		
		Button b4=(Button)findViewById(R.id.button4);
		b4.setBackgroundColor(Color.BLUE);
		b4.setTextColor(Color.WHITE);
		TextView t4=(TextView)findViewById(R.id.textView4);
		t4.setText("\n**TARGUS 16'' ASCEND BACKPACK** \n\n PADDED LAPTOP COMPARTMENT, ZIPPERED VERTICAL FRONT POCKET, SIDE JERSEY MESH POCKETS FOR WATER BOTTLE, DOCUMENT DIVIDER, ADVANCED WORKSTATION, " +
				"COMFORTABLE PADDED BACK PANEL, ERGONOMIC PADDED SHOULDER STRAPS, SOFT-TOUCH HANDLE");
		
		Button b5=(Button)findViewById(R.id.button5);
		b5.setBackgroundColor(Color.BLUE);
		b5.setTextColor(Color.WHITE);
		TextView t5=(TextView)findViewById(R.id.textView5);
		t5.setText("\n**TARGUS 14''ELITE TOPLOADER** \n\n DESIGNED TO PROTECT UP TO 14'' W LAPTOPS, DURABLE NYLON AND WATER-RESISTANT MATERIAL, DURABLE FEET, TWO EASY " +
				"ACCESS FRONT POCKETS WITH VELCRO, PADDED LAPTOP COMPARTMENT WITH QUILTED AND AIR MESH LINING BACK SLIP ZIPPERED POCKET, CARRYING HANDLE WITH SNAP BUTTON, CONTOURED ADJUSTABLE STRAPS, STYLISH AND LIGHTWEIGHT DESIGN");
		
		
		Button b6=(Button)findViewById(R.id.button6);
		b6.setBackgroundColor(Color.BLUE);
		b6.setTextColor(Color.WHITE);
		TextView t6=(TextView)findViewById(R.id.textView6);
		t6.setText("\n**TARGUS 13'' DRIFTER MINI MESSENGER FOR MACBOOK** \n\n SCRATCH-RESISTANT LINING AND WATER RESISTANT BOTTOM, 2-BUCKLE SECURE CLOSURE SYSTEM, DELUXE WORKSTATION, SOFT-LINED ACCESSORY POCKETS, LARGE ZIPPERED POCKET, DOCUMENTS AND FILES STORAGE, " +
				"ERGONOMIC PADDED ADJUSTABLE SHOULDER STRAP & INTEGRATED CARRYING HANDLE");
		
		Button b7=(Button)findViewById(R.id.button7);
		b7.setBackgroundColor(Color.BLUE);
		b7.setTextColor(Color.WHITE);
		TextView t7=(TextView)findViewById(R.id.textView7);
		t7.setText("\n**TARGUS 16'' ELITE TOPLOADER** \n\n DESIGNED TO PROTECT UP TO 14'' W LAPTOPS, DURABLE NYLON AND WATER-RESISTANT" +
				" MATERIAL, DURABLE FEET, TWO EASY ACCESS FRONT POCKETS WITH VELCRO, PADDED LAPTOP COMPARTMENT WITH QUILTED AND AIR MESH LINING BACK SLIP ZIPPERED POCKET, CARRYING HANDLE WITH SNAP");
		
		Button b8=(Button)findViewById(R.id.button8);
		b8.setBackgroundColor(Color.BLUE);
		b8.setTextColor(Color.WHITE);
		TextView t8=(TextView)findViewById(R.id.textView8);
		t8.setText("\n**TARGUS 15.6'' PULSE BACKPACK** \n\n THE PULSE BACKPACK IS BOTH STYLISH, COMFORTABLE, AND FITS LAPTOP AND LAPTOP ACCESSORIES, SCHOOL BOOKS, LUNCH AND MUCH MORE, FOR BEST ORGANIZATION AND EASY ACCESS, THE BACKPACK FEATURES A SUBDIVIDED MAIN COMPARTMENT AS WELL AS " +
				"A SECONDARY COMPARTMNET, AND VARIOUS POCKETS.");
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
	}
	
	public void Buy1(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Laptop-Bags/Targus/TARGUS-13-DRIFTER-SLIPCASE-FOR-MACBOOK/pid-2398455.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy2(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Laptop-Bags/Targus/TARGUS-15-DRIFTER-SLIPCASE-FOR-MACBOOK/pid-2398457.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy3(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Laptop-Bags/Targus/TARGUS-154-SPORTS-BACKPACK/pid-2398473.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy4(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Laptop-Bags/Targus/TARGUS-16-ASCEND-BACKPACK/pid-2398469.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy5(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Laptop-Bags/Targus/TARGUS-14ELITE-TOPLOADER/pid-2398463.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy6(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Laptop-Bags/Targus/TARGUS-13-DRIFTER-MINI-MESSENGER-FOR-MACBOOK/pid-2398465.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void Buy7(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Laptop-Bags/Targus/TARGUS-16-ELITE-TOPLOADER/pid-2398467.aspx";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}

	public void Buy8(View view) {
		String url = "http://www.mkcomputer.co.in/Products/Accessories-Other-Accessories-Laptop-Bags/Targus/TARGUS-156-PULSE-BACKPACK/pid-2398471.aspx";
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
