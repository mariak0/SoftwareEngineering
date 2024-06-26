package com.example.readease3.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.readease3.R;
import com.example.readease3.databinding.ProfileBinding;

public class profile extends Fragment {

    private ProfileBinding binding;

    private Button coupons;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.user_home, container, false);
        profile_ViewModel profile_ViewModel = new ViewModelProvider(this).get(profile_ViewModel.class);
        binding = ProfileBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        coupons = root.findViewById(R.id.button4);

        viewcouponsΑndpoints();

        final TextView textView = binding.textNotifications;
        profile_ViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;
    }

    private void viewcouponsΑndpoints() {
        coupons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to AdOptionsActivity
                Navigation.findNavController(v).navigate(R.id.action_profileFragment_to_personalbank);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}