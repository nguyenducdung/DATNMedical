package com.bkhust.dungnd.datnmedical.ui.news;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.LayoutItemBinding;
import com.bkhust.dungnd.datnmedical.model.TinTuc;
import com.bkhust.dungnd.datnmedical.ui.ItemClick;
import com.bkhust.dungnd.datnmedical.ui.medicine.MedicineAdapter;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    private ItemClick itemClick;
    private List<TinTuc> tinTucs;

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        LayoutItemBinding binding = LayoutItemBinding.inflate(inflater, viewGroup, false);
        return new NewsViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int i) {
        holder.binding.ivItem.setImageResource(R.drawable.medical4);
        holder.binding.tvItem.setText("Tin tức");
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public void setItemClick(ItemClick click) {
        this.itemClick = click;
    }

    public void setDatas(List<TinTuc> tinTucs) {
        this.tinTucs = tinTucs;
        notifyDataSetChanged();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {

        private LayoutItemBinding binding;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClick.onItemClick(getAdapterPosition());
                }
            });
        }
    }
}
