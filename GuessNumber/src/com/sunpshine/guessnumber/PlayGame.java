package com.sunpshine.guessnumber;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class PlayGame extends Activity implements OnClickListener,
		OnValueChangeListener {

	NumberPicker numberPicker1;
	NumberPicker numberPicker2;
	NumberPicker numberPicker3;
	NumberPicker numberPicker4;

	String nunber1;
	String nunber2;
	String nunber3;
	String nunber4;

	Button buGuess;

	TextView guessHistory;
	String guessHistoryList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.play_game);

		setupLayout();

	}

	private void setupLayout() {
		// TODO Auto-generated method stub

		numberPicker1 = (NumberPicker) findViewById(R.id.numberPicker1);
		numberPicker2 = (NumberPicker) findViewById(R.id.numberPicker2);
		numberPicker3 = (NumberPicker) findViewById(R.id.numberPicker3);
		numberPicker4 = (NumberPicker) findViewById(R.id.numberPicker4);

		numberPicker1.setMaxValue(9);
		numberPicker2.setMaxValue(9);
		numberPicker3.setMaxValue(9);
		numberPicker4.setMaxValue(9);

		numberPicker1.setMinValue(0);
		numberPicker2.setMinValue(0);
		numberPicker3.setMinValue(0);
		numberPicker4.setMinValue(0);
		
		numberPicker1.setValue(0);
		numberPicker2.setValue(0);
		numberPicker3.setValue(0);
		numberPicker4.setValue(0);
		
		nunber1 = "0";
		nunber2 = "0";
		nunber3 = "0";
		nunber4 = "0";

		numberPicker1.setOnValueChangedListener(this);
		numberPicker2.setOnValueChangedListener(this);
		numberPicker3.setOnValueChangedListener(this);
		numberPicker4.setOnValueChangedListener(this);

		buGuess = (Button) findViewById(R.id.buGuess);
		buGuess.setOnClickListener(this);

		guessHistory = (TextView) findViewById(R.id.guessHistory);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		switch (v.getId()) {

		case R.id.buGuess:

			
			if(nunber1 != nunber2 
			&& nunber1 != nunber3
			&& nunber1 != nunber4
			&& nunber2 != nunber3
			&& nunber2 != nunber4
			&& nunber3 != nunber4){
			
			guessHistoryList = '\n' + nunber1 + nunber2 + nunber3 + nunber4;

			guessHistory.setText("You had made your guessing... " + '\n'
					+ guessHistoryList);

			}else{
				
				Toast.makeText(v.getContext(), "4 numbers must be all different", Toast.LENGTH_LONG).show();
			}
			
			break;

		}

	}

	@Override
	public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
		// TODO Auto-generated method stub

		switch (picker.getId()) {

		case R.id.numberPicker1:

			nunber1 = Integer.toString(newVal);

			

			break;

		case R.id.numberPicker2:

			nunber2 = Integer.toString(newVal);

			

			break;

		case R.id.numberPicker3:

			nunber3 = Integer.toString(newVal);

			

			break;

		case R.id.numberPicker4:

			nunber4 = Integer.toString(newVal);

			

			break;

		}

	}

}
