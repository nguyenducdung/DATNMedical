package com.bkhust.dungnd.datnmedical.ui.news;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder newsViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
