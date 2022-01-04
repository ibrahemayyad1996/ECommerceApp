package com.exmaple.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.exmaple.ecommerceapp.fragment.AccountFragment;
import com.exmaple.ecommerceapp.fragment.CartFragment;
import com.exmaple.ecommerceapp.fragment.HomeFragment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import nl.joery.animatedbottombar.AnimatedBottomBar;

public class MainActivity extends AppCompatActivity {

    AnimatedBottomBar bottomBar;


    HomeFragment homeFragment = null;
    CartFragment cartFragment = null;
    AccountFragment accountFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomBar = findViewById(R.id.bottom_bar);

        homeFragment = HomeFragment.newInstance("","");
        cartFragment = CartFragment.newInstance("","");
        accountFragment = AccountFragment.newInstance("","");

      //  bottomBar.selectTabAt(0,true);
        bottomBar.selectTabById(R.id.tab_home,true);
        setFragmentToContainer(homeFragment);
        bottomBar.setOnTabSelected(new Function1<AnimatedBottomBar.Tab, Unit>() {
            @Override
            public Unit invoke(AnimatedBottomBar.Tab tab) {
                if (tab.getId() == R.id.tab_home){
                    setFragmentToContainer(homeFragment);
                }else if (tab.getId() == R.id.tab_cart){
                    setFragmentToContainer(cartFragment);

                }else if (tab.getId() == R.id.tab_account){
                    setFragmentToContainer(accountFragment);
                }
                return null;
            }
        });
    }

    private void setFragmentToContainer(Fragment fragment){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.containerView, fragment)
                .commit();


    }

}