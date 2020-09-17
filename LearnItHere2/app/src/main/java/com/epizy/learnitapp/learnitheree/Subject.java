package com.epizy.learnitapp.learnitheree;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Subject extends AppCompatActivity implements View.OnClickListener {

    private CardView s1;
    private CardView s2;
    private CardView s3;
    private CardView ss;
    private CardView s6;
    private CardView s;
    private Intent intent;
    private Intent intent1;
    public String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        intent = getIntent();
        String message1 = intent.getStringExtra("SUBJECT");
        if(message1.equals("MECHA"))
        {
            setContentView(R.layout.mech_sub);
            s1 = findViewById(R.id.mechamaths);
            s2 = findViewById(R.id.mechamechanics);
            s3 = findViewById(R.id.mechadrawing);

            s6 = findViewById(R.id.qppr);
            s6.setOnClickListener(this);

        }
        else
        {
            if(message1.equals("EC"))
            {
                setContentView(R.layout.ece_sub);
                s1 = findViewById(R.id.devices);
                s2 = findViewById(R.id.design);
                s3 = findViewById(R.id.signals);
                ss = findViewById(R.id.network);
                s = findViewById(R.id.maths);
                s.setOnClickListener(this);
                ss.setOnClickListener(this);
            }
            else
            {
                setContentView(R.layout.cse_sub);
                s1 = findViewById(R.id.csedsa);
                s2 = findViewById(R.id.cseidmaths);
                s3 = findViewById(R.id.csepy);
                ss = findViewById(R.id.csefdl);
                ss.setOnClickListener(this);
            }
        }
        s1.setOnClickListener(this);
        s2.setOnClickListener(this);
        s3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.csedsa :
                message = "DSA";
                break;
            case R.id.csepy:
                message = "PYTHON";
                break;
            case R.id.cseidmaths:
                message = "MATHS";
                break;
            case R.id.csefdl:
                message = "FDLCA";
                break;
            case R.id.mechamaths:
                message = "MECH_MATHS";
                break;
            case R.id.mechadrawing:
                message = "MDRAWING";
                break;
            case R.id.mechamechanics:
                message = "MECHANICS";
                break;

            case R.id.qppr:
                message = "QPPR";
                break;
            case R.id.devices:
                message = "eDevices";
                break;
            case R.id.design:
                message = "design";
                break;
            case R.id.signals:
                message = "signals";
                break;
            case R.id.network:
                message = "network";
                break;
            case R.id.maths:
                message = "ECEmaths";
                break;
        }

        intent1 = new Intent(Subject.this, Tablayout.class);
        intent1.putExtra("SUBJECT_CLICKED", message);
        startActivity(intent1);
    }
}
