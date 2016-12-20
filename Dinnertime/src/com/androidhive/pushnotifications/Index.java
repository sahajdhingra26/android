package com.androidhive.pushnotifications;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class Index extends Activity {
	
	WebView myWebView;
	
	@SuppressWarnings("deprecation")
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
   	 getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
   	                            WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.index);
		
		 myWebView = (WebView) findViewById(R.id.webview);
		 WebSettings webSettings = myWebView.getSettings();
		 webSettings.setJavaScriptEnabled(true); //Enables Javascript. Remove this line if your site doesn't require javascript
		 myWebView.getSettings().setPluginState(PluginState.ON); //Enables plugins like Adobe flash. Remove if not required
		 myWebView.loadUrl("https://crostitch.in/Test/androidapp/excludeveggies.php"); //Change this with your website's url
		 
		 myWebView.setWebViewClient(new myWebViewClient());
	}


 private class myWebViewClient extends WebViewClient {
		
    	
    	@Override
    	public boolean shouldOverrideUrlLoading(WebView view, String url) {
        
    		view.loadUrl(url);
        	return false;
    	}
    
			} 

 		@Override
 public boolean onKeyDown(int keyCode, KeyEvent event) {

			if (keyCode == KeyEvent.KEYCODE_BACK){
				if(myWebView.canGoBack()){
					myWebView.goBack();
					return true;
				}
			}
		
			return super.onKeyDown(keyCode, event);
		} 
	

}

