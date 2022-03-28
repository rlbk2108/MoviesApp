package com.example.movies;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.movies.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_profile)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        RecyclerView recyclerView = findViewById(R.id.myrecyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Звездные воины", "Фэнтези", "7.1", R.drawable.starwars));
        items.add(new Item("Гарри Поттер", "Приключения", "9.0", R.drawable.harry_potter));
        items.add(new Item("Интерстеллар", "Драма", "10.0", R.drawable.interstellar_2014));
        items.add(new Item("Зеленая книга", "Драма", "8.7", R.drawable.greenbook));
        items.add(new Item("Джон Уик", "Боевик", "8.1", R.drawable.john_wick));

        items.add(new Item("Семь жизней", "Драма", "7.1", R.drawable.seven_pounds));
        items.add(new Item("Легенда", "Боевик", "9.0", R.drawable.legend));
        items.add(new Item("Триггер", "Драма", "10.0", R.drawable.trigger));
        items.add(new Item("Властелин колец", "Приключения", "8.7", R.drawable.kingofrings));
        items.add(new Item("25-21", "Дорама", "8.1", R.drawable.tt));

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
    }

    @SuppressLint("SetJavaScriptEnabled")
    public void onClickWeb(View view){
        WebView browser = new WebView(this);
        setContentView(browser);
        browser.loadUrl("https://github.com/rlbk2108/MoviesApp");

        WebSettings webSettings = browser.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}