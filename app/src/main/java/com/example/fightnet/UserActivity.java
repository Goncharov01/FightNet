package com.example.fightnet;

import android.content.ClipData;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.fightnet.NetWork.Api;
import com.example.fightnet.NetWork.Controller;
import com.example.fightnet.NetWork.Fragments.FightsFragment;
import com.example.fightnet.NetWork.Fragments.InvitesFragment;
import com.example.fightnet.NetWork.Fragments.MapFragment;
import com.example.fightnet.NetWork.Fragments.MessagesFragment;
import com.example.fightnet.NetWork.Fragments.NotebookFragment;
import com.example.fightnet.NetWork.Fragments.NotificationsFragment;
import com.example.fightnet.NetWork.Fragments.OverviewFragment;
import com.example.fightnet.NetWork.Fragments.SearchFragment;
import com.example.fightnet.NetWork.Fragments.VideosFragment;
import com.example.fightnet.NetWork.Pojo.EmailBody;
import com.example.fightnet.NetWork.Pojo.FindUser;
import com.example.fightnet.NetWork.PreferenceMeneger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class UserActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    Api api;
    PreferenceMeneger preferenceMeneger;
    FragmentManager fragmentManager ;
    Fragment fragment=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        if (savedInstanceState == null) {
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().add(R.id.flContent,new OverviewFragment()).commit();
        }
        navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                selectDrawerItem(menuItem);
                return true;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.appbar:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void findUser(EmailBody email){
        api.findUser(email).enqueue(new Callback<FindUser>() {
            @Override
            public void onResponse(Call<FindUser> call, Response<FindUser> response) {
                System.out.println(response.body().getDescription()+"+++++++++" );
            }

            @Override
            public void onFailure(Call<FindUser> call, Throwable t) {
                System.out.println("----------"+t);
            }
        });

    }
    public void messsagOnClick(){
        System.out.println("llllll");

    }

    public void selectDrawerItem(MenuItem menuItem){

        Class fragmentClass = null;
            switch (menuItem.getItemId()){
                case R.id.overview:
                    fragmentClass= OverviewFragment.class;
                    break;
                case R.id.messageFragment:
                    fragmentClass= MessagesFragment.class;
                    break;
                case R.id.notifications:
                    fragmentClass= NotificationsFragment.class;
//                    Toast.makeText(this,"notification",Toast.LENGTH_LONG).show();
                    break;
                case R.id.map:
                    fragmentClass= MapFragment.class;
                    break;
                case R.id.search:
                    fragmentClass= SearchFragment.class;
                    break;
                case R.id.notebook:
                    fragmentClass= NotebookFragment.class;
                    break;
                case R.id.invites:
                    fragmentClass= InvitesFragment.class;
                    break;
                case R.id.fights:
                    fragmentClass= FightsFragment.class;
                    break;
                case R.id.videos:
                    fragmentClass= VideosFragment.class;
                    break;
                default:
                    fragmentClass=MessagesFragment.class;
            }
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();

        }
        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
        menuItem.setChecked(true);
        setTitle(menuItem.getTitle());
        drawerLayout.closeDrawers();
    }


}
