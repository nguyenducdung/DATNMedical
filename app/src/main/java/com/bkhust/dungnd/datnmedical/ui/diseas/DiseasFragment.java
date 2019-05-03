package com.bkhust.dungnd.datnmedical.ui.diseas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentDiseasBinding;
import com.bkhust.dungnd.datnmedical.ui.ItemClick;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;
import com.bkhust.dungnd.datnmedical.utils.DummyData;
import com.google.firebase.database.DatabaseReference;

import java.util.Objects;

public class DiseasFragment extends BaseFragment<FragmentDiseasBinding, DiseasViewModel> {
    private DatabaseReference reference;
    private DiseasAdapter diseasAdapter;

    @Override
    protected Class<DiseasViewModel> getModelClass() {
        return DiseasViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_diseas;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        if (getActivity() != null) {
            getActivity().setTitle(R.string.fragment_disease);
            showButtonBack();
        }
        showToolbar();
//        reference = database.getReference("benh");
//        reference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                for (DataSnapshot data : dataSnapshot.getChildren()) {
//                    String key = data.getKey();
//                    String value = data.getValue().toString();
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Log.w("FIREBASE", "loadPost:onCancelled", databaseError.toException());
//            }
//        });
        setupRecycleView();
    }

    private void setupRecycleView() {
        diseasAdapter = new DiseasAdapter();
        binding.rvDiseas.setAdapter(diseasAdapter);
        binding.rvDiseas.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
//        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(Objects.requireNonNull(getContext()), DividerItemDecoration.VERTICAL);
//        dividerItemDecoration.setDrawable(Objects.requireNonNull(ContextCompat.getDrawable(getContext(), R.drawable.devider)));
//        binding.rvDiseas.addItemDecoration(dividerItemDecoration);
        diseasAdapter.setItemClick(new ItemClick() {
            @Override
            public void onItemClick(int position) {
                navController.navigate(R.id.action_diseasFragment_to_diseasDetailFragment);
            }
        });

        diseasAdapter.setData(DummyData.benhList());
    }
}
