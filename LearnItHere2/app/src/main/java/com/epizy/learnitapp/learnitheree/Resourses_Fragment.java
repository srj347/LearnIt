package com.epizy.learnitapp.learnitheree;

import android.content.Intent;
import android.net.Uri;
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

public class Resourses_Fragment extends Fragment {
    ListView listView;
    String message;
    List<ModalRes> status = new ArrayList<>();
    List<ModalRes> fdlca = new ArrayList<>();
    List<ModalRes> dsa = new ArrayList<>();
    List<ModalRes> python = new ArrayList<>();
    List<ModalRes> maths = new ArrayList<>();

    List<ModalRes> ece_res = new ArrayList<>();
    List<ModalRes> mech_res = new ArrayList<>();

    Adapter_Res adapter1;
    Adapter_Res adapter2;
    Adapter_Res adapter3;
    Adapter_Res adapter4;
    Adapter_Res adapter5;
    Adapter_Res adapter6;

    AdView adView;
    InterstitialAd interstitialAd;
    int r=0;
    int p ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.resourses_fragment,container,false);


        adView = view.findViewById(R.id.adView);
        adView.loadAd( new AdRequest.Builder().build() );

        interstitialAd = new InterstitialAd(getContext()) ;
        interstitialAd.setAdUnitId("ca-app-pub-1000230449148381/7979912931");
        AdRequest.Builder b = new AdRequest.Builder();
        interstitialAd.loadAd(b.build());
        listView = view.findViewById(R.id.listView_res);
        adapter1 = new Adapter_Res(getContext(),0,dsa);
        adapter2 = new Adapter_Res(getContext(),0,fdlca);
        adapter3 = new Adapter_Res(getContext(),0,maths);
        adapter4 = new Adapter_Res(getContext(),0,python);
        adapter5 = new Adapter_Res(getContext(),0,ece_res);
        adapter6 = new Adapter_Res(getContext(),0,mech_res);

        if(r==0){

            fdlca.add(new ModalRes("Advance Computer Architecture",R.drawable.ca_1,"https://www.youtube.com/playlist?list=PLwdnzlV3ogoWJhBxBYu-K4l-q-nNHd24D"));
            fdlca.add(new ModalRes("Project for Software Development",R.drawable.ca_2,"https://youtu.be/oC483DTjRXU"));
            fdlca.add(new ModalRes("Boolean Algebra & logic Gates",R.drawable.ca_3,"https://www.youtube.com/playlist?list=PLIY8eNdw5tW-yJHsxApeilNjX2Dkll-Ox"));
            fdlca.add(new ModalRes("Digital Electronics",R.drawable.ca_4,"https://www.youtube.com/playlist?list=PLBlnK6fEyqRjMH3mWf6kwqiTbT798eAOm"));

            dsa.add(new ModalRes("Linked List By Cs Dojo",R.drawable.dsa_1,"https://youtu.be/WwfhLC16bis"));
            dsa.add(new ModalRes("Dynamic Programming ",R.drawable.dsa_2,"https://www.youtube.com/playlist?list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go"));
            dsa.add(new ModalRes("Time Complexity By Cs Dojo",R.drawable.dsa_3,"https://youtu.be/D6xkbGLQesk"));
            dsa.add(new ModalRes("Git and Github By ApniKaksha",R.drawable.dsa_4,"https://youtu.be/iR5WIknxdkY"));
            dsa.add(new ModalRes("Fastest Sorting Algorithm",R.drawable.dsa_5,"https://youtu.be/4Q72kbwyEmk"));


            python.add(new ModalRes("Python By Cs Dojo",R.drawable.p_1,"https://www.youtube.com/playlist?list=PLBZBJbE_rGRWeh5mIBhD-hhDwSEDxogDg"));
            python.add(new ModalRes("Data Science By Simplilearn",R.drawable.p_2,"https://youtu.be/7WRlYJFG7YI"));
            python.add(new ModalRes("Machine Learning By Edureka",R.drawable.p_3,"https://youtu.be/GwIo3gDZCVQ"));
            python.add(new ModalRes("Python By FreeCodeCamp",R.drawable.p_5,"https://youtu.be/rfscVS0vtbw"));
            python.add(new ModalRes("Python By Telusko",R.drawable.p_4,"https://www.youtube.com/playlist?list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3"));

            maths.add(new ModalRes("Linear Algebra By MIT",R.drawable.m_1 ,"https://www.youtube.com/playlist?list=PLE7DDD91010BC51F8"));
            maths.add(new ModalRes("Statistics For Data Science",R.drawable.m_2 ,"https://youtu.be/Vfo5le26IhY"));
            maths.add(new ModalRes("Probability & Statistics (Gate)",R.drawable.m_3 ,"https://www.youtube.com/playlist?list=PLU6SqdYcYsfLRq3tu-g_hvkHDcorrtcBK"));
            maths.add(new ModalRes("Statistics By Khan Academy",R.drawable.m_4 ,"https://www.youtube.com/playlist?list=PL1328115D3D8A2566"));
            maths.add(new ModalRes("Probability By Khan Academy",R.drawable.m_5 ,"https://www.youtube.com/playlist?list=PLC58778F28211FA19"));

            ece_res.add(new ModalRes("Digital System & Signals",R.drawable.ece_1,"https://www.youtube.com/playlist?list=PLBlnK6fEyqRhG6s3jYIU48CqsT5cyiDTO"));
            ece_res.add(new ModalRes("Electronic Devices",R.drawable.ece_2,"https://www.youtube.com/playlist?list=PL311CA3047EB6EC58"));
            ece_res.add(new ModalRes("Complex Variable",R.drawable.ece_3,"https://www.youtube.com/playlist?list=PLU6SqdYcYsfI3sh-ho_iiTkCGsTbVh_Sw")) ;
            ece_res.add(new ModalRes("Network Theory",R.drawable.ece_4,"https://www.youtube.com/playlist?list=PLgzsL8klq6DJzR2htSP-dyCJVRqelcFf9"));

            mech_res.add(new ModalRes("Machine Drawing",R.drawable.mech_1,"https://www.youtube.com/playlist?list=PLbMVogVj5nJRgBjyxu0PfH3Ucdq_mDo4o"));
            mech_res.add(new ModalRes("Complex Variable",R.drawable.ece_3,"https://www.youtube.com/playlist?list=PLU6SqdYcYsfI3sh-ho_iiTkCGsTbVh_Sw"));
            mech_res.add(new ModalRes("Engineering Mechanics",R.drawable.mech_3,"https://www.youtube.com/playlist?list=PLPq2PKgitBOKPoYZJwHQtmRzLOowXBNQP"));


             r++;


        }






         message = getActivity().getIntent().getStringExtra("SUBJECT_CLICKED");

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
        else if(message.equals("PYTHON")){
            listView.setAdapter(adapter4);
            status = python;

        }
        else {

            if(message.equals("MECH_MATHS")||message.equals("MDRAWING")||message.equals("MECHANICS")||message.equals("QPPR")){

                listView.setAdapter(adapter6);
                status = mech_res;
            }
            else{

                 listView.setAdapter(adapter5);
                 status = ece_res;

            }
            
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                p = position;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(status.get(position).getUrl()));
                if(interstitialAd.isLoaded()){
                      interstitialAd.show();

                }else{

                    startActivity(i);
                }


            }
        });

        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse(status.get(p).getUrl())) ;
                startActivity(j);
                interstitialAd.loadAd(new AdRequest.Builder().build());
                



            }
        });









        return view;
    }
}

