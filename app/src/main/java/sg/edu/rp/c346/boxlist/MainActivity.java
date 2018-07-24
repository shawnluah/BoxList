package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColour;
    ArrayList<colouritem> alColourList;
    CustomAdapter caColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColour = findViewById(R.id.ListViewColour);
        alColourList = new ArrayList<>();

        colouritem item1 = new colouritem(false, true, false);
        colouritem item2 = new colouritem(true, false, false);
        colouritem item3 = new colouritem(false, false, true);

        alColourList.add(item1);
        alColourList.add(item2);
        alColourList.add(item3);

        caColour = new CustomAdapter(this, R.layout.colour_item, alColourList);

        lvColour.setAdapter(caColour);

    }
}
