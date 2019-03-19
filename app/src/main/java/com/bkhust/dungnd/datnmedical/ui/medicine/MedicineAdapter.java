package com.bkhust.dungnd.datnmedical.ui.medicine;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class MedicineAdapter extends RecyclerView.Adapter<MedicineAdapter.MedicineViewHolder> {
    @NonNull
    @Override
    public MedicineViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MedicineViewHolder medicineViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MedicineViewHolder extends RecyclerView.ViewHolder {

        public MedicineViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
