package com.bkhust.dungnd.datnmedical.ui.chinese;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class ChineseMedicineAdapter extends RecyclerView.Adapter<ChineseMedicineAdapter.ChineseMedicineViewHolder> {
    @NonNull
    @Override
    public ChineseMedicineViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ChineseMedicineViewHolder chineseMedicineViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ChineseMedicineViewHolder extends RecyclerView.ViewHolder {

        public ChineseMedicineViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
