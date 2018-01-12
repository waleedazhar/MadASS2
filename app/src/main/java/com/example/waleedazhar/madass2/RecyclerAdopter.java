package com.example.waleedazhar.madass2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Waleed Azhar on 10/17/2017.
 */

public class RecyclerAdopter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private class RecyclerHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView txtname;

        public RecyclerHolder (View itemview)
        {
            super(itemview);
            txtname=(TextView)itemview.findViewById(R.id.textView);
            txtname.setText(Contacts.getName());
        }


        @Override
        public void onClick(View v) {

        }
    }
}
