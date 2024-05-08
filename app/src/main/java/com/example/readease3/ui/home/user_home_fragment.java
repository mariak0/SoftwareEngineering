package com.example.readease3.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.lifecycle.ViewModelProvider;
import com.example.readease3.R;
import com.example.readease3.create_add;
import com.example.readease3.databinding.UserHomeBinding;


public class user_home_fragment extends Fragment {

    private UserHomeBinding binding;

    private Button buttonEbook;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.user_home, container, false);

        buttonEbook = rootView.findViewById(R.id.button3);

        buttonEbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to EbookFormActivity
                Navigation.findNavController(v).navigate(R.id.action_userHomeFragment_to_ebookFormActivity);
            }
        });

        return rootView;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}