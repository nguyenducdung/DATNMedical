package com.bkhust.dungnd.datnmedical.ui.food;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder foodViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
