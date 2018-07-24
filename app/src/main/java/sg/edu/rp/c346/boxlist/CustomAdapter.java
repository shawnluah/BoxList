package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17010564 on 24/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<colouritem> colourList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<colouritem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        colourList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI elements and bind them to their respective Java variable.
        TextView tvBlue = rowView.findViewById(R.id.textViewBlue);
        TextView tvOrange = rowView.findViewById(R.id.textViewOrange);
        TextView tvBrown = rowView.findViewById(R.id.textViewBrown);
        ImageView ivColour = rowView.findViewById(R.id.imageViewColour);

        // Obtain the property values from the Data Class object
        // and set them to the corresponding UI elements.
        colouritem currentItem = colourList.get(position);

        if (currentItem.isBlue()) {

            ivColour.setImageResource(R.drawable.blue_box);
        }
        else if (currentItem.isOrange()) {
            ivColour.setImageResource(R.drawable.orange_box);
        } else {
            ivColour.setImageResource(R.drawable.brown_box);
        }

        // Return the View corresponding to the data at the specified position.
        return rowView;
    }
}
