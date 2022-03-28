package com.example.movies.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.movies.R;
import com.example.movies.ui.home.HomeFragment;


public class HomeFragment extends Fragment {

        private HomeViewModel mViewModel;

        public static HomeFragment newInstance() {
            return new HomeFragment();
        }

        private View binding;

        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                                 @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_home, container, false);

        }

        @Override
        public void onActivityCreated(@Nullable Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            mViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
            // TODO: Use the ViewModel
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            binding = null;
        }
}