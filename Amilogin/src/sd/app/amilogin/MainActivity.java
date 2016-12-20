package sd.app.amilogin;

import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.message.BasicNameValuePair;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	 EditText enroll,pasword;   // To take birthyear as input from user
	 Button submit;    
	 int counter,App_count,connection_attempts,logging_attempts;
	 boolean isConnected;
	 ConnectivityManager cm;
	 WifiManager wifi;
	 ProgressDialog progressBar;
     private int progressBarStatus = 0;
	 private Handler progressBarHandler = new Handler();
	 
		
	    /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	     StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
	    .detectDiskReads().detectDiskWrites().detectNetwork() // StrictMode is most commonly used to catch accidental disk or network access on the application's main thread
	    .penaltyLog().build());
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        enroll = (EditText) findViewById(R.id.editText1);
	        pasword = (EditText) findViewById(R.id.editText2);
	        submit = (Button) findViewById(R.id.submitbutton);
	        loadSavedPreferences();
	        wifiCheck(getWindow().getDecorView());
	        submit.setOnClickListener(new View.OnClickListener(){        
	        public void onClick(View v) {
	        	 buttonclick();
	        	  }         
	        });
	        
	        
	        
	        
	    }
	    

	    
	    
	    
/**************************************Method Definitions*********************************************/	    
	    
	    public void buttonclick(){

	    	logging_attempts=0;
	    	/****************************************************************Try*******************/
	    	progressBar = new ProgressDialog(getWindow().getDecorView().findViewById(android.R.id.content).getContext());
			progressBar.setCancelable(true);
			progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);
			progressBar.setMessage("Logging in...");
			progressBar.setProgress(0);
			progressBar.setMax(100);
			progressBar.show();
			//reset progress bar status
			progressBarStatus = 0;
			
			
			
			new Thread(new Runnable() {
				public void run() {
					while (progressBarStatus < 100) {
						
						progressBarStatus = login();

						// your computer is too fast, sleep 1 second
						try {
							logging_attempts++;
							if(logging_attempts>1)
								throw new LoggingAttemptsException("Logging Attempts Exceeded!");
							Log.d("Sahaj", "Logging Attempts="+logging_attempts);
							Thread.sleep(1000);
							
						} 
						catch(LoggingAttemptsException e)
						{
							progressBar.dismiss(); 
							progressBarStatus=100;
						}
						catch (InterruptedException e) {
							e.printStackTrace();
						}

						// Update the progress bar
						progressBarHandler.post(new Runnable() {
							public void run() {
								if(progressBarStatus==60)
							     {
									Toast.makeText(getBaseContext(), "Authentication error", Toast.LENGTH_SHORT).show();
							  
							     }
								
								if(progressBarStatus==20)
							     {
									Toast.makeText(getBaseContext(), "Logged In Successfully", Toast.LENGTH_LONG).show();
							        finish();
							     }
		  
								if(progressBarStatus==30)
							     {
									Toast.makeText(getBaseContext(), "Network Error!", Toast.LENGTH_SHORT).show();
							       
							     }
								
								if(progressBarStatus==40)
							     {
							    	 Toast.makeText(getBaseContext(), "Already Logged in!", Toast.LENGTH_LONG).show();
							    	finish();
							  
							     }
								
								if(progressBarStatus==50)
							     {
									Toast.makeText(getBaseContext(), "Network Error!Please try again", Toast.LENGTH_SHORT).show();
							        
							     }
								progressBar.setProgress(progressBarStatus);
								
							}
						});
					}

		
					if (progressBarStatus >= 100) {

						// sleep 2 seconds, so that you can see the 100%
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						// close the progress bar dialog
						progressBar.dismiss();
					}
				}
			}).start();
			
		}
	    
	    
	    
	    public int login() {

	    	
	    	counter=1;
       	 	savePreferences("NAME", enroll.getText().toString(),"PASSWORD",pasword.getText().toString());
       	    ArrayList<NameValuePair> postParameters = new ArrayList<NameValuePair>();
            postParameters.add(new BasicNameValuePair("user",
            enroll.getText().toString()));
            postParameters.add(new BasicNameValuePair("password",
   	        pasword.getText().toString()));
            String response = null;
         
         // call executeHttpPost method passing necessary parameters 
            try {
            	response = CustomHttpClient.executeHttpPost(
            	"http://10.0.2.87/cgi-bin/login/", // your ip address if using localhost server
            	postParameters);
            	String result = response.toString();  
            	Log.d("sahaj12", "response12" );
            	Log.d("Sahaj","Status code="+CustomHttpClient.getStatusCode());
    
    /************************************JSOUP BEGINS*************************************/
            		try{
            			Document doc = Jsoup.parse(response);
            			Element loginform = doc.getElementById("logins");
            			Elements inputElements=loginform.getElementsByTag("div");
            				for(Element inputElement:inputElements){    
            					String id=inputElement.attr("id");
            					Log.d("sahaj1", "lol counter= "+ counter);
            					if(id.equals("errorbox")){   
            						counter=0;
            						String key = inputElement.attr("style");
            						Log.d("sahaj1", "lol key= "+ key);
   		
            							if(key.isEmpty()){
            								Log.d("sahaj1", "lol "+ "Failed");
            								return 60;
   			                            }
                                 }
                            } 
                    }
 /***************************************JSOUP ENDS*************************************/
            		catch(Exception e){
            			Log.e("log_tag","Error in http connection!!" + e.toString());
            			
            		}
    
              if(counter%2!=0){
            	  return 20;
              }
            }	
            
            catch (HttpHostConnectException e){
            	Log.e("log_tag","Error in http connection!!" + e.toString()); 
            	return 30;
            }
            catch (ClientProtocolException e) {
            	Log.e("log_tag","Already Logged in!!" + e.toString()); 
            	return 40;
            }
            catch (Exception e) {
            	Log.e("log_tag","Error!" + e.toString()); 
            	return 50;
            }
	        
	        return 100;

		}
	    

	    	    
	    private void loadSavedPreferences() {
			SharedPreferences sp = PreferenceManager
					.getDefaultSharedPreferences(this);
			String name = sp.getString("NAME", "");
			String pass = sp.getString("PASSWORD", "");
			App_count=sp.getInt("App_count", 0);
			enroll.setText(name);
			pasword.setText(pass);
			Log.d("Sahaj","App count ="+App_count);
			if(App_count%8==0)
			Toast.makeText(getBaseContext(), "Like it? Rate us on Google and Fb", Toast.LENGTH_LONG).show();
			
		}
	    
	    
	    private void savePreferences(String key1, String value1,String key2, String value2) {
			SharedPreferences sp = PreferenceManager
					.getDefaultSharedPreferences(this);
			Editor edit = sp.edit();
			edit.putInt("App_count",++App_count);
			edit.putString(key1, value1);
			edit.putString(key2, value2);
			edit.commit();
		}
	    
	    
	    public void wifiCheck(View v){
	    	connection_attempts=0;
            progressBar = new ProgressDialog(getWindow().getDecorView().findViewById(android.R.id.content).getContext());
			progressBar.setCancelable(true);
			progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			progressBar.setMessage("Checking Wifi...");
			progressBar.setProgress(0);
			progressBar.setMax(100);
			progressBar.show();
			progressBarStatus = 0;
			new Thread(new Runnable() {
				public void run() {
					while (progressBarStatus < 100) {
						
						progressBarStatus = doSomeTasks();

						
						try {
							Thread.sleep(1000);
							try{
								connection_attempts++;
								NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
								isConnected = activeNetwork != null &&
				    		                      activeNetwork.isConnectedOrConnecting();
								Log.e("Sahaj", "No of Connection Attempts = "+connection_attempts);
				    	    	if(connection_attempts>13){
				    	    		throw new NotConnectedException("Connection attempt failure");
				    	    	}
							}
							catch(NotConnectedException e){
								Log.e("Sahaj", "Progress bar Error"+e);
								progressBar.dismiss(); 
								progressBarStatus=100;
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						progressBarHandler.post(new Runnable() {
							public void run() {
								if(progressBarStatus==37){
									progressBar.setMessage("Checking Wifi..");
									}
									else if(progressBarStatus==89)
									{   if(connection_attempts>12)
										Toast.makeText(getBaseContext(), "Couldn't Connect to Network!Please Check your Network Settings and try again! ", Toast.LENGTH_LONG).show();
							        
										progressBar.setMessage("Connecting to Network...");
										
									}
								progressBar.setProgress(progressBarStatus);
								
							}
						});
					}

			
					if (progressBarStatus >= 100) {

						// sleep 2 seconds, so that you can see the 100%
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						// close the progress bar dialog
						progressBar.dismiss();
					}
				}
			}).start();

   	    }
	    
	    public int doSomeTasks() {

			cm=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
	    	wifi = (WifiManager)getSystemService(Context.WIFI_SERVICE);
	    		if (!wifi.isWifiEnabled()){
	           	wifi.setWifiEnabled(true);
	        	return 37;
	        }
	        	
	        if(!isConnected){   
	        	return 89;
	        }
	        
	        return 100;

		}

	    
	    public void Fblikeus(View view) {
			
			Intent i = new Intent(Intent.ACTION_VIEW);
			try{
				
			
			i.setData(Uri.parse("fb://page/542293852516113"));
			}
			catch(Exception e)
			{
				i.setData(Uri.parse("www.facebook.com/542293852516113"));
			}
			
			startActivity(i);
		    	}
	    
           public void Googlerateus(View view) {
			
			Intent i = new Intent(Intent.ACTION_VIEW);
			try{
				
			
			i.setData(Uri.parse("market://details?id=sd.app.amilogin&hl=en"));
			}
			catch(Exception e)
			{
				i.setData(Uri.parse("https://play.google.com/store/apps/details?id=sd.app.amilogin&hl=en"));
			}
			
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
			 savePreferences("NAME", enroll.getText().toString(),"PASSWORD",pasword.getText().toString());
			super.onStop();
		}

		

}





