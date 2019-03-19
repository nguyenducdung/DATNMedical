package com.bkhust.dungnd.datnmedical.ui.diseas.detail;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class DiseasDetailAdapter extends RecyclerView.Adapter<DiseasDetailAdapter.DiseasDetailViewHolder> {
    @NonNull
    @Override
    public DiseasDetailViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DiseasDetailViewHolder diseasDetailViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class DiseasDetailViewHolder extends RecyclerView.ViewHolder {

        public DiseasDetailViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
