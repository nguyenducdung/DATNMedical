package com.bkhust.dungnd.datnmedical.ui.diseas;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentDiseasBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DiseasFragment extends BaseFragment<FragmentDiseasBinding, DiseasViewModel> {
    private FirebaseDatabase database;

    @Override
    protected Class<DiseasViewModel> getModelClass() {
        return DiseasViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_diseas;
    }

    @Override
    public void onStart() {
        super.onStart();
        FirebaseApp.initializeApp(getActivity().getApplicationContext());
        database = FirebaseDatabase.getInstance();
        reference = database.getReference("benh");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot data : dataSnapshot.getChildren()) {
                    String key = data.getKey();
                    String value = data.getValue().toString();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w("FIREBASE", "loadPost:onCancelled", databaseError.toException());
            }
        });
    }
}
