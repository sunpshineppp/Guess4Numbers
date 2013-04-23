package com.sunpshine.guessnumber;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GameOver extends Activity implements OnClickListener{

	Button buAgain;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game_over);
		
		buAgain = (Button) findViewById(R.id.buAgain);
		buAgain.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId()){
		
		case R.id.buAgain:
			
			Intent again = new Intent(GameOver.this, PlayGame.class);			
			startActivity(again);
		
		}
		
	}

	
	
	
}
