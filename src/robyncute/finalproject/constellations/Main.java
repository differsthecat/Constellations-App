//Robyn Cute
//Java Programming
//Final project
//Constellations

package robyncute.finalproject.constellations;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.view.View.OnClickListener;

public class Main extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Assigns the layout xml file to be used.
		setContentView(R.layout.main);
		
		//Assigning Radio Buttons
		final RadioButton springRadio = (RadioButton) findViewById(R.id.springRad);
		final RadioButton summerRadio = (RadioButton) findViewById(R.id.summerRad);
		final RadioButton autumnRadio = (RadioButton) findViewById(R.id.autumnRad);
		final RadioButton winterRadio = (RadioButton) findViewById(R.id.winterRad);
		Button pickSeason = (Button) findViewById(R.id.seasonGoBtn);
		
		//Setting On Click Listener to interpret user input.
		pickSeason.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				//Recognizes which radio button is clicked and directs user to 
				//the correct page.
				
				//Directs user to Spring class.
				if (springRadio.isChecked()){
					startActivity(new Intent(Main.this, Spring.class));
				}
				//Directs user to Summer class.
				if (summerRadio.isChecked()){
					startActivity(new Intent(Main.this, Summer.class));
				}
				//Directs user to Autumn class.
				if (autumnRadio.isChecked()){
					startActivity(new Intent(Main.this, Autumn.class));
				}
				//Directs user to Winter class.
				if (winterRadio.isChecked()){
					startActivity(new Intent(Main.this, Winter.class));
				}
				}
			
				
		});
		}
	
	}
	
		
	
