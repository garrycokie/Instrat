package com.smartfren.instrat.utilities;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.smartfren.instrat.R;
import com.smartfren.instrat.entities.SurveyEntity;

public class SurveyListAdapter extends RecyclerView.Adapter<SurveyListAdapter.ViewHolder> {
    private SurveyEntity[] itemsData;

    public SurveyListAdapter(SurveyEntity[] itemsData) {
        this.itemsData = itemsData;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public SurveyListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.survey_list_item_layout, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        viewHolder.txtOutletID.setText(itemsData[position].b12no134);
        viewHolder.txtStatus.setText(itemsData[position].status);
    }

    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtOutletID;
        public TextView txtStatus;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            txtOutletID = (TextView) itemLayoutView.findViewById(R.id.itemOutletID);
            txtStatus = (TextView) itemLayoutView.findViewById(R.id.itemStatus);
        }
    }


    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsData.length;
    }
}