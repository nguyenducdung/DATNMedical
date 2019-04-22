package com.bkhust.dungnd.datnmedical.ui.diseas;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.LayoutItemBinding;
import com.bkhust.dungnd.datnmedical.model.Benh;
import com.bkhust.dungnd.datnmedical.ui.ItemClick;
import com.bkhust.dungnd.datnmedical.ui.medicine.MedicineAdapter;

import java.util.List;

public class DiseasAdapter extends RecyclerView.Adapter<DiseasAdapter.DiseaseViewHolder> {
    private List<Benh> benhs;
    private ItemClick itemClick;

    @NonNull
    @Override
    public DiseaseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        LayoutItemBinding binding = LayoutItemBinding.inflate(inflater, viewGroup, false);
        return new DiseaseViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull DiseaseViewHolder holder, int i) {
        holder.binding.ivItem.setImageResource(R.drawable.medical2);
        holder.binding.tvItem.setText("Bệnh");
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public void setItemClick(ItemClick click) {
        this.itemClick = click;
    }

    public class DiseaseViewHolder extends RecyclerView.ViewHolder {

        private LayoutItemBinding binding;

        public DiseaseViewHolder(@NonNull View itemView) {
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
