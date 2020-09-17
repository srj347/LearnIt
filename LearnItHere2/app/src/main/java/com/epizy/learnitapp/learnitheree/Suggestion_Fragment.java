package com.epizy.learnitapp.learnitheree;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;
import java.util.List;

public class Suggestion_Fragment extends Fragment {

    ListView listView;
    String message;
    List<ModalRes> status = new ArrayList<>();
    List<ModalRes> fdlca = new ArrayList<>();
    List<ModalRes> dsa = new ArrayList<>();
    List<ModalRes> python = new ArrayList<>();
    List<ModalRes> maths = new ArrayList<>();
    List<ModalRes> ece_ebook = new ArrayList<>();
    List<ModalRes> mech_ebook  = new ArrayList<>();

    Adapter_Res adapter1;
    Adapter_Res adapter2;
    Adapter_Res adapter3;
    Adapter_Res adapter4;
    Adapter_Res adapter5;
    Adapter_Res adapter6;

    AdView adView;
    InterstitialAd interstitialAd;
    int r = 0;
    int p;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.suggestion_fragment,container,false);
        adView = view.findViewById(R.id.adView2);
        adView.loadAd(new AdRequest.Builder().build());

        interstitialAd = new InterstitialAd(getContext()) ;
        interstitialAd.setAdUnitId("ca-app-pub-1000230449148381/7979912931");
        AdRequest.Builder b = new AdRequest.Builder();
        interstitialAd.loadAd(b.build());
        listView = view.findViewById(R.id.list_view_ebook);
        adapter1 = new Adapter_Res(getContext(),0,dsa);
        adapter2 = new Adapter_Res(getContext(),0,fdlca);
        adapter3 = new Adapter_Res(getContext(),0,maths);
        adapter4 = new Adapter_Res(getContext(),0,python);
        adapter5 = new Adapter_Res(getContext(),0,ece_ebook);
        adapter6 = new Adapter_Res(getContext(),0,mech_ebook);

        message = getActivity().getIntent().getStringExtra("SUBJECT_CLICKED");

        if(r==0){

            dsa.add(new ModalRes("Data Structures in C++ , SARTAJ SAHANI",R.drawable.dsa_onee,"https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/ebbok%2Fdata-structures-algorithms-and-applications-in-c-by-sartraj-sahani.pdf?alt=media&token=97058c82-2f73-421b-9dc8-d21f4657462e"));
            dsa.add(new ModalRes("Introduction to Algorithm , THOMAS H.",R.drawable.edsa_2,"https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/ebbok%2Fintro%20to%20algo%20.pdf?alt=media&token=42ad6bd3-a68d-4908-83cc-16b50e9cccd9"));
            dsa.add(new ModalRes("Computer Algorithm , ELLIS HOROWITZ",R.drawable.edsa_1,"https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/ebbok%2Ffundamentalsof-computer-algorithms-by-ellis-horowitz.pdf?alt=media&token=14d8477e-66b7-4ee2-b264-455286045617"));

            dsa.add(new ModalRes("DS & Algo in Java , MICHAEL T.",R.drawable.edsa_3,"https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/ebbok%2Fds%20algo%20java.pdf?alt=media&token=8f830a7b-3387-4983-b71c-3af4b3d0ff54"));

            maths.add(new ModalRes("Linear Algebra fourth edition , SEYMOUR LIPSCHUTZ",R.drawable.emaths_1,"https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/ebbok%2FLinear_Algebra%2C_4th_Edition__(2009)Lipschutz-Lipson.pdf?alt=media&token=cfc5685b-331f-481f-8953-15f39a192676"));
            maths.add(new ModalRes("Introduction to Probability Theory & Its Application , WILLIAM FELLER",R.drawable.emaths_2,"https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/ebbok%2FFellerV1.pdf?alt=media&token=7ce5a700-3630-4321-8a5c-a2f3d12fbb49"));
            maths.add(new ModalRes("Probability & Statistics , McGRAW HILL",R.drawable.emaths_3,"https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/ebbok%2FProbAndStat.pdf?alt=media&token=c196b98a-7d66-4f23-a8af-566bf1dbda11"));

            fdlca.add(new ModalRes("Fundamental Of Digital Electronics , ANAND KUMAR",R.drawable.efdlca_1,"")) ;
            fdlca.add(new ModalRes("Digital Logic Design , MORRIS MANO",R.drawable.efdlca_2,"https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/ebbok%2Fdigital-logic-and-computer-design-by-m-morris-mano-2nd-edition.pdf?alt=media&token=b7c8c603-825b-4c0c-a759-44dfc9ae6d1e")) ;
            fdlca.add(new ModalRes("Mordern Digital Electronics , RP JAIN",R.drawable.efdlca_3,"https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/ebbok%2Fidoc.pub_r-p-jain-modern-digital-electronics-tata-mcgraw-hill.pdf?alt=media&token=4cc46667-3e9b-4b86-aa60-326491e6b38b")) ;

            ece_ebook.add(new ModalRes("Fundamental of Digital Logic , STEPHEN BROWN",R.drawable.ece_ebook_1,"https://firebasestorage.googleapis.com/v0/b/capapp-ee30e.appspot.com/o/ELC%2FFundamentals%20of%20Digital%20Logic%20with%20Verilog%20Design-Third%20edition_compressed_compressed%20(1).pdf?alt=media&token=020a825d-c21c-4823-aa17-defb8aec6804"));
            ece_ebook.add(new ModalRes("CMOS VLSI Design",R.drawable.ece_ebook2,"https://firebasestorage.googleapis.com/v0/b/capapp-ee30e.appspot.com/o/ELC%2FCMOS-VLSI-design_compressed.pdf?alt=media&token=bc5ab550-3f78-4fb7-9112-7df889285bf2"));

            mech_ebook.add(new ModalRes("All in One Ebook",R.drawable.mech_ebook1,"https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/ece%20networks%2Fbook%2FUPDATED%20mechanical%20all%20subjects%20ebooks.pdf?alt=media&token=eea1f3fe-69c0-441b-9b4f-0aa820cdce3a")) ;
            mech_ebook.add(new ModalRes("Theory of metal cutting",R.drawable.mech_ebook_2,"https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/ece%20networks%2Fbook%2FTheory%20of%20metal%20cutting.pdf?alt=media&token=6ca55327-e7fa-4521-8e34-e6d015c3b7a8"));
            r++;


        }


        if(message.equals("DSA")){
            listView.setAdapter(adapter1);
            status = dsa;

        }
        else if(message.equals("FDLCA")){
            listView.setAdapter(adapter2);
            status = fdlca;

        }
        else if(message.equals("MATHS")){
            listView.setAdapter(adapter3);
            status = maths;

        }
        else if(message.equals("PYTHON")) {
            listView.setAdapter(adapter4);
            status = python;
        }else{


            if(message.equals("MECH_MATHS")||message.equals("MDRAWING")||message.equals("MECHANICS")||message.equals("QPPR")){

                listView.setAdapter(adapter6);
                status = mech_ebook;
            }
            else{

                listView.setAdapter(adapter5);
                status = ece_ebook;

            }
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                p = position;
                Intent i = new Intent(getContext(),Ebook_Activity.class) ;
                i.putExtra("url",  status.get(position).getUrl());
                if(interstitialAd.isLoaded()){
                     interstitialAd.show();

                }
                else{
                    startActivity(i);

                }




            }
        });

        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                Intent i = new Intent(getContext(),Pdf_Activity.class) ;
                i.putExtra("url",  status.get(p).getUrl());
                startActivity(i);
                AdRequest.Builder b = new AdRequest.Builder();
                interstitialAd.loadAd(b.build());
            }
        });





        return view;
    }
}
