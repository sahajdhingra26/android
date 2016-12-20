package sd.game.cmd;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import carz.pkg.game.R;



	public class score_view extends Activity {
		int n;
		String p_name;
        int score;
        
       
		@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	       setContentView(R.layout.score);
	       score=0;
	       Intent intent = getIntent();
	        score = intent.getIntExtra("Sahaj", n);
	        //Log.d(TAG, "value of score is"+score);
	      //  score = call_bundle();
	        if(score!=0)
	        {
	        	call_dialog();
				
	        }else{        
	        	call_data();
	        }
	    }
	    
	    private void call_data(){
	    	TextView trc1 = (TextView)findViewById(R.id.trc1);
	        TextView trc2 = (TextView)findViewById(R.id.trc2);
			database info = new database(this);
			info.open();
			ArrayList<Score> s= info.getScore();
			
			TableLayout tbl = (TableLayout)findViewById(R.id.tlScoreBoard);

			for(Score st:s){
				TableRow newRow = new TableRow(this);			
				TextView t = new TextView(this);
				t.setGravity(Gravity.CENTER);
				t.setLayoutParams(trc1.getLayoutParams());
				t.setText(st.getName());
				newRow.addView(t);
				TextView t1 = new TextView(this);
				t1.setGravity(Gravity.CENTER);
				t1.setLayoutParams(trc2.getLayoutParams());
				t1.setText(st.getScore());
				
				newRow.addView(t1);
				tbl.addView(newRow);
			}
			info.close();
	    }
	    
	    public void call_dialog(){
	    	AlertDialog.Builder dialog = new AlertDialog.Builder(this);
			dialog.setTitle("Carmegeddon");
			dialog.setMessage("Enter Your Name");
			final EditText et_p_name = new EditText(this);
			dialog.setView(et_p_name);
			
			dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {

				public void onClick(DialogInterface arg0, int whichbutton) {
				// TODO Auto-generated method stub
					p_name = et_p_name.getText().toString();
					database entry = new database(score_view.this);
					entry.open();
					entry.createEntry(p_name, String.valueOf(score));
					entry.close();
					
					call_data();
				}
			});
			dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

				public void onClick(DialogInterface arg0, int whichbutton) {
					// TODO Auto-generated method stub
					//This button click will leave the entire application
					finish();
				}
			});
			dialog.show();
	    }
	    
	    private int call_bundle(){
	    	Bundle get = new Bundle();
			get = getIntent().getExtras();
			String sans = get.getString("score");
			return Integer.parseInt(sans);
	    }
	}

