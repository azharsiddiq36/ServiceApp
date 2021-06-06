package com.example.digiservice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


import com.example.digiservice.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

//    private TextView mTextMessage;
//    private BottomNavigationView navigation;
////    private View search_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(R.layout.activity_main);
        loadFragment(new HomeFragment());
        initComponent(binding);
    }
    public boolean loadFragment(Fragment fragment) {
        if (fragment != null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameFragment, fragment)
                    .commit();
            return true;
        }
        return false;
    }
    private void initComponent(ActivityMainBinding binding) {
        binding.searchBar.icEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotolistmessage = new Intent(MainActivity.this,ListMessageActivity.class);
                startActivity(gotolistmessage);
            }
        });
        binding.navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.navigation_service:
                        fragment = new ServiceFragment();
                        break;
                    case R.id.navigation_user:
                        fragment = new ProfileWalletFragment();
                        break;
                    case R.id.navigation_home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.navigation_shop:
                        fragment = new ShopFragment();
                        break;
                    case R.id.navigation_history:
                        fragment = new HistoryFragment();
                        break;

                }
                return loadFragment(fragment);

            }
        });

        NestedScrollView nested_content = (NestedScrollView) findViewById(R.id.nested_scroll_view);
        nested_content.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if (scrollY < oldScrollY) { // up
                    animateNavigation(false,binding);
//                    animateSearchBar(false,binding);
                }
                if (scrollY > oldScrollY) { // down
                    animateNavigation(true, binding);
//                    animateSearchBar(true, binding);
                }
            }
        });


        ((ImageButton) findViewById(R.id.bt_menu)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }


    boolean isNavigationHide = false;

    private void animateNavigation(final boolean hide, ActivityMainBinding binding) {
        if (isNavigationHide && hide || !isNavigationHide && !hide) return;
        isNavigationHide = hide;
        int moveY = hide ? (2 * binding.navigation.getHeight()) : 0;
        binding.navigation.animate().translationY(moveY).setStartDelay(100).setDuration(300).start();
    }

    boolean isSearchBarHide = false;

//    private void animateSearchBar(final boolean hide, ActivityMainBinding binding) {
//        if (isSearchBarHide && hide || !isSearchBarHide && !hide) return;
//        isSearchBarHide = hide;
//        int moveY = hide ? -(2 * binding.searchBar.getHeight()) : 0;
//        binding.searchBar.animate().translationY(moveY).setStartDelay(100).setDuration(300).start();
//    }

}