package com.bkhust.dungnd.datnmedical.ui.medicine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentMedicineBinding;
import com.bkhust.dungnd.datnmedical.databinding.FragmentMedicineGroupBinding;
import com.bkhust.dungnd.datnmedical.ui.ItemClick;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;
import com.bkhust.dungnd.datnmedical.utils.DummyData;

public class MedicineGroupFragment extends BaseFragment<FragmentMedicineGroupBinding, MedicineGroupViewModel> {
    private MedicineGroupAdapter medicineGroupAdapter;

    @Override
    protected Class<MedicineGroupViewModel> getModelClass() {
        return MedicineGroupViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_medicine_group;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        if (getActivity() != null) {
            getActivity().setTitle(R.string.fragment_medicine);
            showButtonBack();
        }
        setupRecycleView();
        showToolbar();
    }

    private void setupRecycleView() {
        medicineGroupAdapter = new MedicineGroupAdapter();
        binding.rvMedicine.setAdapter(medicineGroupAdapter);
        binding.rvMedicine.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
//        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(Objects.requireNonNull(getContext()), DividerItemDecoration.VERTICAL);
//        dividerItemDecoration.setDrawable(Objects.requireNonNull(ContextCompat.getDrawable(getContext(), R.drawable.devider)));
//        binding.rvMedicine.addItemDecoration(dividerItemDecoration);
        medicineGroupAdapter.setItemClick(new ItemClick() {
            @Override
            public void onItemClick(int position) {
                navController.navigate(R.id.action_medicineFragment_to_medicineDetailFragment);
            }
        });

        medicineGroupAdapter.setDatas(DummyData.thuocList());
    }

}
