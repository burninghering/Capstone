package com.example.healthkeeper_new.ui.inbody;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.healthkeeper_new.R;

public class InbodyFragment extends Fragment {

    private InbodyViewModel inbodyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        inbodyViewModel =
                ViewModelProviders.of(this).get(InbodyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_inbody, container, false);
        final TextView textView = root.findViewById(R.id.text_inbody);
        inbodyViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
