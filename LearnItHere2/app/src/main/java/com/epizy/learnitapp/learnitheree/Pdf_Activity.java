package com.epizy.learnitapp.learnitheree;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Pdf_Activity extends AppCompatActivity {

    PDFView pdfView;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_layout);
        progressBar = findViewById(R.id.progress_bar);

        String url1 = getIntent().getStringExtra("url");
        pdfView = findViewById(R.id.pdf);
        MyTask x = new MyTask();
        x.execute(url1);






    }

    class MyTask extends AsyncTask<String , Void , InputStream> {
        InputStream is = null;
        @Override
        protected InputStream doInBackground(String... strings) {
            try {
                URL url= new URL(strings[0]);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                if(con.getResponseCode()==200){
                    is = new BufferedInputStream(con.getInputStream());
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


            return is;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);

        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdfView.fromStream(inputStream).enableSwipe(true).load();
            progressBar.setVisibility(View.INVISIBLE);
            Toast.makeText(Pdf_Activity.this,"Loading... Please Wait",Toast.LENGTH_LONG).show();
        }
    }


}
