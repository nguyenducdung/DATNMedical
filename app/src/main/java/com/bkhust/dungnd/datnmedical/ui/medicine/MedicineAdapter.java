package com.bkhust.dungnd.datnmedical.ui.medicine;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.LayoutItemBinding;
import com.bkhust.dungnd.datnmedical.model.Thuoc;
import com.bkhust.dungnd.datnmedical.ui.ItemClick;

import java.util.List;

public class MedicineAdapter extends RecyclerView.Adapter<MedicineAdapter.MedicineViewHolder> {
    private List<Thuoc> thuocs;
    private ItemClick itemClick;

    @NonNull
    @Override
    public MedicineViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        LayoutItemBinding binding = LayoutItemBinding.inflate(inflater, viewGroup, false);
        return new MedicineViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull MedicineViewHolder holder, int i) {
        holder.binding.ivItem.setImageResource(R.drawable.medical1);
        holder.binding.tvItem.setText(thuocs.get(i).getTenThuoc());
    }

    @Override
    public int getItemCount() {
        return thuocs.size();
    }

    public void setItemClick(ItemClick click) {
        this.itemClick = click;
    }

    public void setDatas(List<Thuoc> thuocs) {
        this.thuocs = thuocs;
        notifyDataSetChanged();
    }

    public class MedicineViewHolder extends RecyclerView.ViewHolder {

        private LayoutItemBinding binding;

        public MedicineViewHolder(@NonNull View itemView) {
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
