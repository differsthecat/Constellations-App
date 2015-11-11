//Robyn Cute
//Java Programming
//Final Project
//Constellation App


//This code is executed if the Autumn radio button was highlighted
//and the "Find Constellations" button was clicked. 

package robyncute.finalproject.constellations;


import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//Initiates a List Activity when going to the spring section.
public class Autumn extends ListActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Defines items in the list using an array.
		String[] autumnConstellations={"Pisces Constellation"
		, "Andromeda Constellation", "Phoenix Constellation", "Pegasus Constellation"};
		//Creates a simple list to be displayed onscreen.
		setListAdapter(new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1, autumnConstellations));
		
	}
	//Locates the position of the radio button and executes the correct action
	//depending on its location.
	protected void onListItemClick(ListView l, View v, int position, long id) {
		switch(position){
		//Action when Pisces Constellation selected
		case 0:
			startActivity(new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.go-astronomy.com/constellations.php?Name=Pisces")));	
			break;
		//Action when Andromeda Constellation is selected
		case 1:
			startActivity(new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.go-astronomy.com/constellations.php?Name=Andromeda")));	
			break;
		//Action when Phoenix Constellation is selected
		case 2:
			startActivity(new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.go-astronomy.com/constellations.php?Name=Phoenix")));	
			break;
		//Action when Pegasus Constellation is selected
		case 3:
			startActivity(new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.go-astronomy.com/constellations.php?Name=Pegasus")));	
			break;
			
		
			
		}
	}
}