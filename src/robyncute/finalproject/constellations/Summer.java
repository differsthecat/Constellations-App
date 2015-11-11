//Robyn Cute
//Java Programming
//Final Project
//Constellation App

//This code is executed if the Summer radio button was highlighted
//and the "Find Constellations" button was clicked. 

package robyncute.finalproject.constellations;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//Initiates a List Activity when going to the spring class.
public class Summer extends ListActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Defines items in the list using an array.
		String[] summerConstellations={"Aquila Constellation"
		, "Scorpio Constellation", "Virgo Constellation", "Ophiuchus Constellation"};
		setListAdapter(new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1, summerConstellations));
		
	}
	//Locates the position of the radio button and executes the correct action
	//depending on its location.
	protected void onListItemClick(ListView l, View v, int position, long id) {
		switch(position){
		//Action when Aquila Constellation selected
		case 0:
			startActivity(new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.go-astronomy.com/constellations.php?Name=Aquila")));	
			break;
		//Action when Scorpio Constellation selected
		case 1:
			startActivity(new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.go-astronomy.com/constellations.php?Name=Scorpio")));	
			break;
	    //Action when Virgo Constellation selected
		case 2:
			startActivity(new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.go-astronomy.com/constellations.php?Name=Virgo")));	
			break;
		//Action when Ophiuchus Constellation selected
		case 3:
			startActivity(new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.go-astronomy.com/constellations.php?Name=Ophiuchus")));	
			break;
			
		
			
		}
	}
		
	}