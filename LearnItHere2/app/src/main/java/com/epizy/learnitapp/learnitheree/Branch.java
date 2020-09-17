package com.epizy.learnitapp.learnitheree;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

import java.util.HashMap;
import java.util.Map;

public class Branch extends AppCompatActivity implements View.OnClickListener {

    AdView adView;
    private CardView c1;
    private CardView c2;
    private CardView c3;
    private Intent intent;
    FirebaseRemoteConfig firebaseRemoteConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.branch);
        MobileAds.initialize(this);

        adView = findViewById(R.id.adView10);
        adView.loadAd(new AdRequest.Builder().build());

        Map<String, Object> defaults = new HashMap<>();
        defaults.put("new_version_code", getVersionCode());
        firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        firebaseRemoteConfig.setConfigSettingsAsync(
                new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(5)
                        .build());
        firebaseRemoteConfig.setDefaultsAsync(defaults);
        firebaseRemoteConfig.fetchAndActivate().addOnCompleteListener(new OnCompleteListener<Boolean>() {
            @Override
            public void onComplete(@NonNull Task<Boolean> task) {
                if (task.isSuccessful()) {
                    String new_version_code = firebaseRemoteConfig.getString("new_version_code");
                    String app_url = firebaseRemoteConfig.getString("app_url");
                    if (Integer.parseInt(new_version_code) > getVersionCode()) {
                        Log.d("suraj", "onComplete: ");
                        showDialog(new_version_code, app_url);

                    }

                }
            }
        });

        c1 = findViewById(R.id.cardView);

        c2 = findViewById(R.id.cardView2);

        c3 = findViewById(R.id.cardView3);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);







    }

    private void showDialog(String new_version_code, final String app_url) {
        AlertDialog ad = new AlertDialog.Builder(this)
                .setTitle("Newer Version Available")
                .setPositiveButton("UPDATE", null)
                .show();
        Button btn = ad.getButton(AlertDialog.BUTTON_POSITIVE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(app_url)));
            }
        });


    }

    private int getVersionCode() {
        PackageInfo packageInfo = null;
        try {
            packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {

        }
        return packageInfo.versionCode;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cardView:
                intent = new Intent(Branch.this, Subject.class);
                intent.putExtra("SUBJECT", "cse");
                break;

            case R.id.cardView2:
                intent = new Intent(Branch.this, Subject.class);
                intent.putExtra("SUBJECT", "MECHA");
                break;

            default:
                intent = new Intent(Branch.this, Subject.class);
                intent.putExtra("SUBJECT", "EC");
                break;

        }
        startActivity(intent);
    }
}
