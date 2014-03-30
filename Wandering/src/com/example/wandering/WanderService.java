package com.example.wandering;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class WanderService extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	   
	public void onCreate(){
		Toast.makeText(this, "My Service Created", Toast.LENGTH_LONG).show();
		
	}
	
	public void onStart(Intent intent, int startid) {
		Toast.makeText(this, "My Service Started", Toast.LENGTH_LONG).show();

	}
	
	public void onDestroy() {
		Toast.makeText(this, "My Service Stopped", Toast.LENGTH_LONG).show();
	}
	
	
	
	
	
	
	
	
	
}
