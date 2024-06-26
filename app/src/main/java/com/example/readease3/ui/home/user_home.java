package com.example.readease3.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.navigation.Navigation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.readease3.R;
import com.example.readease3.databinding.UserHomeBinding;

public class user_home extends Fragment {
    private UserHomeBinding binding;
    private Button adButton;
    private Button eventButton;
    private Button audioBookButton;

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.user_home, container, false);

        adButton = rootView.findViewById(R.id.button1);
        eventButton = rootView.findViewById(R.id.button2);
        audioBookButton = rootView.findViewById(R.id.button4);

        showAdOptions();
        showEvents();
        showAudioBook();

        return rootView;
    }

    private void showEvents() {
        eventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to AdOptionsActivity
                Navigation.findNavController(v).navigate(R.id.action_userHomeFragment_to_eventsActivity);
            }
        });
    }
    private void showAudioBook() {
        audioBookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.action_userHomeFragment_to_audiobook);
            }
        });
    }

    private void showAdOptions() {
        adButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to AdOptionsActivity
                Navigation.findNavController(v).navigate(R.id.action_userHomeFragment_to_adOptionsActivity);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
