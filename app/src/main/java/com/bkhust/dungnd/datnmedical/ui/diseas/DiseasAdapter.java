package com.bkhust.dungnd.datnmedical.ui.diseas;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class DiseasAdapter extends RecyclerView.Adapter<DiseasAdapter.DiseaseViewHolder> {
    @NonNull
    @Override
    public DiseaseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DiseaseViewHolder diseaseViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class DiseaseViewHolder extends RecyclerView.ViewHolder {

        public DiseaseViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
