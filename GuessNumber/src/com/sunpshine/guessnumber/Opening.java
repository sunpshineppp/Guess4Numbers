package com.sunpshine.guessnumber;



import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class Opening extends Activity {
	
	MediaPlayer openingSong;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.opening);
		
		openingSong = MediaPlayer.create(Opening.this, R.raw.time_after_time);
		
		Thread timer = new Thread(){			
			public void run(){
				try{
					sleep(5000);				
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent StartGame = new Intent("com.sunpshine.guessnumber.PlayGame");
					startActivity(StartGame);
				}
			}
			
		};
		
		timer.start();
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		openingSong.release();
		finish();
	}

	

}
