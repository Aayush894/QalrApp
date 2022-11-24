package com.example.newqalrapp;

import static com.example.newqalrapp.R.color.blue;
import static com.google.android.material.navigation.NavigationView.*;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.animation.DrawableAlphaProperty;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

import java.util.Locale;
import java.util.Objects;

public class MainActivity<setFragment> extends AppCompatActivity  {

        BottomNavigationView bottomNavigationView;
        FrameLayout main_frame;
        private Toolbar toolbar;
        private TextView drawerProfileName, drawerProfileText;
        private DrawerLayout drawerLayout;
        private NavigationView navigationView;
        private ImageView side_menu;

        @Override
        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // setting name and image of drawer profile starts


            drawerLayout = findViewById(R.id.drawer_layout);
            navigationView = findViewById(R.id.nav_view);
            toolbar = findViewById(R.id.toolbar);
            // step 1:
            setSupportActionBar(toolbar);

            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer);

            drawerLayout.addDrawerListener(toggle);
            toggle.syncState();

            // set the name and image first letter with profile ->
            drawerProfileName = navigationView.getHeaderView(0).findViewById(R.id.nav_drawer_name);
            drawerProfileText = navigationView.getHeaderView(0).findViewById(R.id.nav_drawer_text_img);
            String name = DbQuery.myProfile.getName(); // setting name in profile
            drawerProfileName.setText(name);
            drawerProfileText.setText(name.toUpperCase().substring(0,1));
            // ssetting text to first letter
            // drawer layout works completed <--

            // creating for navigation drawer OnClick -->
            navigationView.setNavigationItemSelectedListener(new OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    int id = item.getItemId();

                    if(id == R.id.nav_home){
                        setFragment(new CategoryFragment());
                    }
                    else if(id == R.id.nav_account){
                        setFragment(new AccountFragment());
                    }
                    else if(id == R.id.nav_leaderboard){
                        setFragment(new LeaderBoardFragment());
                    }
                    else if(id == R.id.nav_share){
                        Toast.makeText(MainActivity.this, "share", Toast.LENGTH_SHORT).show();
                    }
                    else if(id == R.id.nav_send){
                        Toast.makeText(MainActivity.this, "send", Toast.LENGTH_SHORT).show();
                    }

                    drawerLayout.closeDrawer(GravityCompat.START);

                    return true;
                }
            });
            // on click drawer ends <--


            main_frame = findViewById(R.id.main_frame);
            bottomNavigationView = findViewById(R.id.bottom_nav_bar);

            setFragment(new CategoryFragment());
            bottomNavigationView.setSelectedItemId(R.id.nav_home);
            bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    if(item.getItemId()==R.id.nav_home){
//                        setFragment(new CategoryFragment());
                        bottomNavigationView.setSelectedItemId(R.id.nav_home);
                    }
                    else if(item.getItemId()==R.id.nav_leaderboard){
//                        setFragment(new LeaderBoardFragment());
                        bottomNavigationView.setSelectedItemId(R.id.nav_leaderboard);
                    }
                    else if(item.getItemId()==R.id.nav_account){
//                        setFragment(new AccountFragment());
                        bottomNavigationView.setSelectedItemId(R.id.nav_account);
                    }
                    return true;
                }
            });

        } // on create ends here

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed(); // it closes the app
        }
    }

    @Override
        public boolean onCreateOptionsMenu (Menu menu){
        new MenuInflater(this).inflate(R.menu.otp_menu, menu);
        return super.onCreateOptionsMenu(menu);
        }

        @Override
        public boolean onOptionsItemSelected (@NonNull MenuItem item){
        int itemId = item.getItemId();
        if (itemId == R.id.share2) {
            Toast.makeText(this, "Share Via", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.notification1) {
            Toast.makeText(this, "There is 8 notificataions for you", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.setting1) {
            Toast.makeText(this, "Opened Setting", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.study1) {
            Intent intent = new Intent(MainActivity.this, MainActivity1.class);
            startActivity(intent);
        }
        else if (itemId == android.R.id.home) {
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
        }

    public void setFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(main_frame.getId(),fragment);
        transaction.commit();
    }



}