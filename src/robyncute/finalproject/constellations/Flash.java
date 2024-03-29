package robyncute.finalproject.constellations;

import java.util.Timer;
import java.util.TimerTask;

import robyncute.finalproject.constellations.Main;
import robyncute.finalproject.constellations.Flash;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class Flash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_flash);
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				finish();
				startActivity(new Intent(Flash.this, Main.class));
			}
		} ;
		Timer opening = new Timer();
		opening.schedule(task, 4000);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.flash, menu);
		return true;
	}

}
