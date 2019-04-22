package com.bkhust.dungnd.datnmedical.ui.food;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.LayoutItemBinding;
import com.bkhust.dungnd.datnmedical.model.MonAn;
import com.bkhust.dungnd.datnmedical.ui.ItemClick;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    private List<MonAn> monAns;
    private ItemClick itemClick;
    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        LayoutItemBinding binding = LayoutItemBinding.inflate(inflater, viewGroup, false);
        return new FoodViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int i) {
        holder.binding.ivItem.setImageResource(R.drawable.medical3);
        holder.binding.tvItem.setText(R.string.fragment_food);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public void setItemClick(ItemClick listener) {
        this.itemClick = listener;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {

        private LayoutItemBinding binding;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClick.onItemClick(FoodViewHolder.this.getAdapterPosition());
                }
            });
        }
    }
}
