package com.ashandilya.kakichai.ui.refreshment;

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

import com.ashandilya.kakichai.R;

public class RefreshmentFragment extends Fragment {

    private RefreshmentViewModel refreshmentViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        refreshmentViewModel =
                ViewModelProviders.of(this).get(RefreshmentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_refreshment, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        refreshmentViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
