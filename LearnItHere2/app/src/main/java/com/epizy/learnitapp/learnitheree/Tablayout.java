package com.epizy.learnitapp.learnitheree;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class Tablayout extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    Pdf_Fragment pdfFragment;
    Suggestion_Fragment suggestionFragment;
    Resourses_Fragment resoursesFragment;
    DrawerLayout drawerLayout;
    NavigationView navigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);

        mAuth = FirebaseAuth.getInstance();

        toolbar = findViewById(R.id.toolbar);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tablayout);
        pdfFragment = new Pdf_Fragment();
        suggestionFragment = new Suggestion_Fragment();
        resoursesFragment = new Resourses_Fragment();

        drawerLayout = findViewById(R.id.drawer_layout) ;
        navigationView = findViewById(R.id.nav_view);

        
        tabLayout.setupWithViewPager(viewPager);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.Drawer_Open,R.string.Drawer_Close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                 switch (item.getItemId()) {
                     case R.id.signout:

                         mAuth.signOut();

                         mAuth.addAuthStateListener(new FirebaseAuth.AuthStateListener() {
                             @Override
                             public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                                 if(firebaseAuth.getCurrentUser() == null)
                                 {

                                     startActivity(new Intent(Tablayout.this, LoginActivity.class));

                                 }
                             }
                         });
                         break;
                     case R.id.credits:
                         startActivity(new Intent(Tablayout.this,Credit.class));
                         break;
                     case R.id.cse:
                         startActivity(new Intent(Tablayout.this,Branch.class));
                         break;
                     case R.id.ece:
                         startActivity(new Intent(Tablayout.this,Branch.class));
                         break;
                     case R.id.mechanical:
                         startActivity(new Intent(Tablayout.this,Branch.class));
                         break;




                 }
                 drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });
        

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),0);
        viewPagerAdapter.addFragment(pdfFragment,"Pdf");
        viewPagerAdapter.addFragment(resoursesFragment,"Resourses");
        viewPagerAdapter.addFragment(suggestionFragment,"Ebooks");
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.getTabAt(0).setIcon(R.drawable.pdf_icon) ;
        tabLayout.getTabAt(1).setIcon(R.drawable.resourses_icon)  ;
        tabLayout.getTabAt(2).setIcon(R.drawable.ebook_icon)   ;
        BadgeDrawable bd = tabLayout.getTabAt(0).getOrCreateBadge();
        bd.setVisible(true);



    }
   



    private class ViewPagerAdapter  extends FragmentPagerAdapter {

        List<String> fragmentTitle = new ArrayList<>();
        List<Fragment> fragments = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior){
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitle.get(position);
        }

        public void addFragment(Fragment fragment , String title){
            fragments.add(fragment);
            fragmentTitle.add(title);

        }
    }
}
