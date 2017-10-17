package iamutkarshtiwari.github.io.habtrac.activity.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by utkarshtiwari on 17/10/17.
 */


import iamutkarshtiwari.github.io.habtrac.R;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    public TextView habitName, habitDate, habitFrequency;

    public ItemViewHolder(View itemView) {
        super(itemView);

        habitName = (TextView) itemView.findViewById(R.id.name);
        habitDate = (TextView) itemView.findViewById(R.id.date);
        habitFrequency = (TextView) itemView.findViewById(R.id.frequency);
    }
}