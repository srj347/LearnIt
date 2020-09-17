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

public class Pdf_Fragment extends Fragment {
    ListView listView;
    List<Modal> dsa = new ArrayList<>();
    List<Modal> python = new ArrayList<>();
    List<Modal> maths = new ArrayList<>();
    List<Modal> fdlca = new ArrayList<>();

    List<Modal> ElectronicDevice = new ArrayList<>();
    List<Modal> DigitalSystem = new ArrayList<>();
    List<Modal> Sas = new ArrayList<>();
    List<Modal> Netw = new ArrayList<>();
    List<Modal> ecMath = new ArrayList<>();

    List<Modal> EngMech = new ArrayList<>();
    List<Modal> Mp = new ArrayList<>();
    List<Modal> Math3 = new ArrayList<>();
    List<Modal> Quesp = new ArrayList<>();
    List<Modal> Exp = new ArrayList<>();



    String message;
    MyAdapter adapter1;
    MyAdapter adapter2;
    MyAdapter adapter3;
    MyAdapter adapter4;

    MyAdapter adapter1E;
    MyAdapter adapter2E;
    MyAdapter adapter3E;
    MyAdapter adapter4E;
    MyAdapter adapter5E;

    MyAdapter adapter1M;
    MyAdapter adapter2M;
    MyAdapter adapter3M;
    MyAdapter adapter4M;
    MyAdapter adapter5M;

    List<Modal> status = new ArrayList<>();
    InterstitialAd interstitialAd;
    int r=0;
    int p;
    AdView adView;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.pdf_fragment,container,false);

        listView = view.findViewById(R.id.list_view);

        adapter1 = new MyAdapter(getActivity(),0,dsa) ;
        adapter2 = new MyAdapter(getActivity(),0,fdlca);
        adapter3 = new MyAdapter(getActivity(),0,maths);
        adapter4 = new MyAdapter(getActivity(),0,python);

        adapter1E = new MyAdapter(getActivity(),0,ElectronicDevice);
        adapter2E = new MyAdapter(getActivity(),0,DigitalSystem);
        adapter3E = new MyAdapter(getActivity(),0,Sas);
        adapter4E = new MyAdapter(getActivity(),0,Netw);
        adapter5E = new MyAdapter(getActivity(),0,ecMath);

        adapter1M = new MyAdapter(getActivity(),0,EngMech);
        adapter2M = new MyAdapter(getActivity(),0,Mp);
        adapter3M = new MyAdapter(getActivity(),0,Math3);
        adapter4M = new MyAdapter(getActivity(),0,Quesp);
        adapter5M = new MyAdapter(getActivity(),0,Exp);
        



        adView = view.findViewById(R.id.adView1);
        adView.loadAd(new AdRequest.Builder().build());

        if(r==0 ){
           
            dsa.add(new Modal("Array ADT","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FArray_ADT_C_Style_compressed.pdf?alt=media&token=4fb9801b-9379-4d85-a3c8-93bbe22226bf",R.drawable.pdf_view));
            dsa.add(new Modal("Array Representation + Algorithms Introduction","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FArray_Representation_RM_CM_Class_Finale_compressed.pdf?alt=media&token=140eb8fb-e98c-4fe2-8452-4018c62ac29a",R.drawable.pdf_view));
            dsa.add(new Modal("AVL Trees [the Height-Balanced Trees]","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FAVL_Tree_compressed.pdf?alt=media&token=d50f31f5-64a5-4ade-8e2d-75ce3a7f1b71",R.drawable.pdf_view));
            dsa.add(new Modal("Binary Tree Construction","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FBST_BinTree_Construction_From_Traversals_DAB_compressed.pdf?alt=media&token=b41edd73-5932-46f4-808a-56168155cacd",R.drawable.pdf_view));
            dsa.add(new Modal("BinTree Construction From Traversals","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FBST_BinTree_Construction_From_Traversals_DAB_compressed.pdf?alt=media&token=b41edd73-5932-46f4-808a-56168155cacd",R.drawable.pdf_view));
            dsa.add(new Modal("Dijkstra SSSP Algo Code","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FDijkstra_SSSP_Algo_Code_DAB_compressed.pdf?alt=media&token=321e835e-aba9-4cf1-b54c-340aa4c6a7dd",R.drawable.pdf_view));

            dsa.add(new Modal("DoublyLL creation algorithm","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FDoublyLL_2019_Finale_compressed.pdf?alt=media&token=ac7bc3e2-fc96-4694-a21e-2c1dfc86bb71",R.drawable.pdf_view));

            dsa.add(new Modal("DSA and program design","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FDSA_Array_19_Intro_compressed.pdf?alt=media&token=6c96cd58-7e79-43d8-aa73-9261ec156dfb",R.drawable.pdf_view));
            dsa.add(new Modal("Evaluation of Expression-Transform an Infix Expression to Postfix Notation","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FDoublyLL_2019_Finale_compressed.pdf?alt=media&token=ac7bc3e2-fc96-4694-a21e-2c1dfc86bb71",R.drawable.pdf_view));
            dsa.add(new Modal("Execution Trace Dijkstra Floyd Prim","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FExecution_Trace_Dijkstra_Floyd_Prim_compressed.pdf?alt=media&token=4e1dfc83-c2fe-4c5a-9794-03fa79330888",R.drawable.pdf_view));
            dsa.add(new Modal("Graph Examples: Breadth First Search Algorithm","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FGraph_Examples_BFS_1_compressed.pdf?alt=media&token=a8801a92-16e4-469e-92df-7f7a442480ba",R.drawable.pdf_view));
            dsa.add(new Modal("Graph Examples: Breadth First Search Algorithm-2","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FGraph_Examples_BFS_2_compressed.pdf?alt=media&token=0d548e9f-fcf9-4b5f-abdf-b22f2c9365c9",R.drawable.pdf_view));
            dsa.add(new Modal("Graph Examples: Depth First Search Algorithm","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FGraph_Examples_DFS_compressed.pdf?alt=media&token=109b8f81-7ea0-425a-9032-70d5cbcfd47b",R.drawable.pdf_view));
            dsa.add(new Modal("Graph Examples: Dijkstra's Single Source Shortest Path Algorithm","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FGraph_Examples_Dijkstra_compressed.pdf?alt=media&token=e21857d3-3ccd-4bff-addb-4a4b1e2121c1",R.drawable.pdf_view));
            dsa.add(new Modal("Graph Examples: Prim's Minimum Cost Spanning Tree Algorithm","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FGraph_Examples_Prim_compressed.pdf?alt=media&token=17f07f54-7e0e-4385-9821-abd2ce89ff58",R.drawable.pdf_view));
            dsa.add(new Modal("Graph Examples: Warshall-Floyd's All Sources Shortest Path Algorithm","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FGraph_Examples_Warshall_Floyd_compressed.pdf?alt=media&token=9ba45169-1340-4e2c-b051-4db301cea2f2",R.drawable.pdf_view));
            dsa.add(new Modal("Graph Examples: another Non-Linear Data Structure","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FGraphs_2018_Oct_02_Finale_compressed.pdf?alt=media&token=3ad5a3f5-346a-48e8-a98d-3395f1188ba3",R.drawable.pdf_view));
            dsa.add(new Modal("Hashing Introduction","https://firebasestorage.googleapis.com/v0/b/python-7753c.appspot.com/o/DSA%2FHashing_DAB_2018_0_compressed.pdf?alt=media&token=e2ca1344-b667-4ef4-83c7-e5e170fd94e2",R.drawable.pdf_view));
            dsa.add(new Modal("Linked Lists","https://firebasestorage.googleapis.com/v0/b/notesapp-f5302.appspot.com/o/DataStructureAndAlgorithm%2FLinked_Lists_compressed.pdf?alt=media&token=3dcce3bd-1875-43ea-b710-5576d2edbdc0",R.drawable.pdf_view));
            dsa.add(new Modal("Searches and Counting sort","gs://notesapp-f5302.appspot.com/DataStructureAndAlgorithm/Searches_n_Counting_Sort_compressed.pdf",R.drawable.pdf_view));
            dsa.add(new Modal("Solution ESE RW 2017 DSPD DAB","https://firebasestorage.googleapis.com/v0/b/notesapp-f5302.appspot.com/o/DataStructureAndAlgorithm%2FSolution_ESE_RW_2017_DSPD_DAB_compressed.pdf?alt=media&token=33e00696-51ef-4760-8b3d-a0942ba250c3",R.drawable.pdf_view));
            dsa.add(new Modal("Solution T1 2017 DSPD DAB","https://firebasestorage.googleapis.com/v0/b/notesapp-f5302.appspot.com/o/DataStructureAndAlgorithm%2FSolution_T1_2017_DSPD_DAB_compressed.pdf?alt=media&token=46222e21-4e9e-47ae-b62c-125e3756764d",R.drawable.pdf_view));
            dsa.add(new Modal("Solution T2 2017 DSPD DAB","https://firebasestorage.googleapis.com/v0/b/notesapp-f5302.appspot.com/o/DataStructureAndAlgorithm%2FSolution_T2_2017_DSPD_DAB_compressed%20(1).pdf?alt=media&token=00bd6d49-995a-4080-bdf3-4d8c0664666b",R.drawable.pdf_view));
            dsa.add(new Modal("Solution T3 2017 DSPD DAB","https://firebasestorage.googleapis.com/v0/b/notesapp-f5302.appspot.com/o/DataStructureAndAlgorithm%2FSolution_T3_2017_DSPD_DAB_compressed.pdf?alt=media&token=d701f16f-6b66-4d2d-b49e-8593af52ae2c",R.drawable.pdf_view));
            dsa.add(new Modal("Sort Techniques C Style","https://firebasestorage.googleapis.com/v0/b/notesapp-f5302.appspot.com/o/DataStructureAndAlgorithm%2FSort_Techniques_C_Style_compressed.pdf?alt=media&token=bf6faa42-4bb3-40fa-9012-f8ef0aa799c0",R.drawable.pdf_view));
            dsa.add(new Modal("Trees","https://firebasestorage.googleapis.com/v0/b/notesapp-f5302.appspot.com/o/DataStructureAndAlgorithm%2FTrees_compressed.pdf?alt=media&token=1e0d17c5-344c-488d-afd8-b04c4863cebf",R.drawable.pdf_view));
            dsa.add(new Modal("Binary Tree – Creation and Traversal","https://firebasestorage.googleapis.com/v0/b/notesapp-f5302.appspot.com/o/DataStructureAndAlgorithm%2FTutorial_Binary_Tree_Expt_07_Finale_compressed.pdf?alt=media&token=6fe6008e-c2c2-437e-abb7-eed0bcc70167",R.drawable.pdf_view));
            dsa.add(new Modal("Warshall Floyd SSSP Algo Code DAB","https://firebasestorage.googleapis.com/v0/b/notesapp-f5302.appspot.com/o/DataStructureAndAlgorithm%2FWarshall_Floyd_SSSP_Algo_Code_DAB_compressed.pdf?alt=media&token=fbe4f9d6-441f-4624-9fc7-3f4c959acac6",R.drawable.pdf_view));




            python.add(new Modal("Lists", "https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/pdf%2FSystems%20Lab%2FLect1_Lists_1.pdf?alt=media&token=2c7cc863-23a8-48bc-b07f-ed33ba0c8184",R.drawable.pdf_view));
            python.add(new Modal("Dictionary", "https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/pdf%2FSystems%20Lab%2FLect4_Dictionary.pdf?alt=media&token=dad39f57-adf6-417f-b700-01f6cb05bb1b",R.drawable.pdf_view));
            python.add(new Modal("Sets", "https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/pdf%2FSystems%20Lab%2FLect5_Sets.pdf?alt=media&token=b3273b1a-0742-42af-b41c-009762cb2e6a",R.drawable.pdf_view));
            python.add(new Modal("Numpy1", "https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/pdf%2FSystems%20Lab%2FLect6_Numpy_1.pdf?alt=media&token=659040b5-ca40-4b6f-964d-fa67b50d8f29",R.drawable.pdf_view));
            python.add(new Modal("Numpy2", "https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/pdf%2FSystems%20Lab%2FLect7_Numpy_2.pdf?alt=media&token=caec528e-bb37-415d-bc0c-f1349518679f",R.drawable.pdf_view));
            python.add(new Modal("Matrix", "https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/pdf%2FSystems%20Lab%2FLect8_Matrix.pdf?alt=media&token=75e73607-e9fb-4279-aa48-f1f477076025",R.drawable.pdf_view));
            python.add(new Modal("Linear Algebra", "https://firebasestorage.googleapis.com/v0/b/learn-it-94a02.appspot.com/o/pdf%2FSystems%20Lab%2FLect9_LinearAlgebra_1.pdf?alt=media&token=dcbade01-0bed-449c-a507-0c110ae3ea9f",R.drawable.pdf_view));

            maths.add(new Modal("Unit 1: Vector","https://firebasestorage.googleapis.com/v0/b/maths-a67b7.appspot.com/o/Maths%2FUnit%20-1(Maths)_compressed.pdf?alt=media&token=a94c36ac-7729-47da-b114-7184e50172cf",R.drawable.pdf_view));
            maths.add(new Modal("Unit 2: Inner Product Space","https://firebasestorage.googleapis.com/v0/b/capapp-ee30e.appspot.com/o/Maths%2FUnit-2(Maths)_compressed.pdf?alt=media&token=a5ba01db-7625-444c-9467-087cb97f5677",R.drawable.pdf_view));
            maths.add(new Modal("Unit 2: Part 2","https://firebasestorage.googleapis.com/v0/b/capapp-ee30e.appspot.com/o/Maths%2FUnit-2_compressed%20(1).pdf?alt=media&token=efaeed42-1ef6-4d26-908d-ebe291a138de",R.drawable.pdf_view));
            maths.add(new Modal("Unit 4-5","https://firebasestorage.googleapis.com/v0/b/maths-a67b7.appspot.com/o/Maths%2FUnit%20-4%20%26%205_compressed%20(2).pdf?alt=media&token=190a9869-22bc-4268-98a9-9301edc2460e",R.drawable.pdf_view));
            maths.add(new Modal("Linear Algebra Book","https://firebasestorage.googleapis.com/v0/b/maths-a67b7.appspot.com/o/Maths%2FLinear_Algebra%2C_4th_Edition__(2009)Lipschutz-Lipson1.pdf?alt=media&token=a27ee14e-b9aa-4a13-8809-c50854b7a1e3",R.drawable.pdf_view));



            fdlca.add(new Modal("I/O Organisation","https://firebasestorage.googleapis.com/v0/b/capapp-ee30e.appspot.com/o/FDL%2Fchapter7-io%20organization_compressed.pdf?alt=media&token=4387dc8a-338c-4464-8523-09c120cbd4de",R.drawable.pdf_view));
            fdlca.add(new Modal("Computer Organisation","https://firebasestorage.googleapis.com/v0/b/capapp-ee30e.appspot.com/o/FDL%2FComputer%20Organization_compressed%20(1).pdf?alt=media&token=1008b941-ce75-458c-bff5-60d21e16abe7",R.drawable.pdf_view));
            fdlca.add(new Modal("The Memory System","https://firebasestorage.googleapis.com/v0/b/capapp-ee30e.appspot.com/o/FDL%2Fthe%20memory%20system_compressed.pdf?alt=media&token=36935ac0-32ac-4853-9bce-2cf0856d6034",R.drawable.pdf_view));
            fdlca.add(new Modal("Unit 4:","https://firebasestorage.googleapis.com/v0/b/capapp-ee30e.appspot.com/o/FDL%2FUnit%20-%204%20(Shreya).pdf?alt=media&token=a8054d20-8905-42be-b033-5bd5d929c82a",R.drawable.pdf_view));


            ElectronicDevice.add(new Modal("P-N Junction diode", "https://firebasestorage.googleapis.com/v0/b/maths-a67b7.appspot.com/o/ElC%2FPN_junction_compressed.pdf?alt=media&token=9a5cdc10-6b69-4ea3-aea5-42bae4ad40ba",R.drawable.pdf_view));
            ElectronicDevice.add(new Modal("BJT", "https://firebasestorage.googleapis.com/v0/b/maths-a67b7.appspot.com/o/ElC%2FBJT_compressed.pdf?alt=media&token=10b4edf5-df46-4672-be6a-ea367c28baac",R.drawable.pdf_view));
            ElectronicDevice.add(new Modal("FET", "https://firebasestorage.googleapis.com/v0/b/maths-a67b7.appspot.com/o/ElC%2FNotes_on_The_Field_Effect_Transistor_FET_compressed.pdf?alt=media&token=7a2ec84d-9ef7-44fa-860d-0750e0170c37",R.drawable.pdf_view));
            ElectronicDevice.add(new Modal("Frequency analysis of amplifier","https://firebasestorage.googleapis.com/v0/b/maths-a67b7.appspot.com/o/ElC%2Fanalysis_of_amplifier_compressed.pdf?alt=media&token=a20327bb-a18e-4e38-aec0-ba0eb5cd3c29",R.drawable.pdf_view));
            ElectronicDevice.add(new Modal("MOS Tech & VLSI", "https://firebasestorage.googleapis.com/v0/b/maths-a67b7.appspot.com/o/ElC%2FCMOS-VLSI-design_compressed.pdf?alt=media&token=050b013a-eff8-426f-b00e-3fceed066320",R.drawable.pdf_view));
            ElectronicDevice.add(new Modal("CMOS", "https://firebasestorage.googleapis.com/v0/b/maths-a67b7.appspot.com/o/ElC%2Fcmos_compressed.pdf?alt=media&token=26de0e4f-92e6-48c9-be16-08b8a81bc282",R.drawable.pdf_view));


            Sas.add(new Modal("2 D Fourier transforms","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2F2%20D%20Fourier%20transforms.pdf?alt=media&token=6500db66-0ba2-4413-92ac-2c8b3c69d982",R.drawable.pdf_view));
            Sas.add(new Modal("2 D discrete space signals and systems","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2F2%20D%20discrete%20space%20signals%20and%20systems.pdf?alt=media&token=42f14ee9-3510-44fc-87b1-0655f57d54d6",R.drawable.pdf_view));
            Sas.add(new Modal("An Introduction to the sampling theorem","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FAn%20Introduction%20to%20the%20sampling%20theorem.pdf?alt=media&token=5a3983c0-1672-4127-a5fb-f4786f4ceba1",R.drawable.pdf_view));
            Sas.add(new Modal("Analysis of first and second order systems","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FAnalysis%20of%20first%20and%20second%20order%20systems.pdf?alt=media&token=6dd08d79-0a1c-47e9-8a4e-49c78e550d96",R.drawable.pdf_view));
            Sas.add(new Modal("Basic Theoretical Concepts for Time Dependent Problems","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FBasic%20Theoretical%20Concepts%20for%20Time%20Dependent%20Problems.pdf?alt=media&token=902d037c-d4bc-43fb-aefa-645cc0da50ab",R.drawable.pdf_view));
            Sas.add(new Modal("CTFT","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FCTFT.pdf?alt=media&token=f70f4734-8ae1-43af-805a-e44f3dab5b7d",R.drawable.pdf_view));
            Sas.add(new Modal("Commonly used signals differentiation of discrete multidimensional signals","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FCommonly%20used%20signals%20differentiation%20of%20discrete%20multidimensional%20signals.pdf?alt=media&token=e8ceeee9-d837-40f3-bee1-e7e69ede0b29",R.drawable.pdf_view));
            Sas.add(new Modal("Comparison between continuous time FT and DTFT Digital Imaging and Multimedia Introduction to Spectral Techniques","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FComparison%20between%20continuous%20time%20FT%20and%20DTFTDigital%20Imaging%20and%20Multimedia_Introduction%20to%20Spectral%20Techniques_compressed.pdf?alt=media&token=3c630ab3-f838-4b67-9668-bb28a9792e48",R.drawable.pdf_view));
            Sas.add(new Modal("Digital Media Processing","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FDigital%20Media%20Processing.pdf?alt=media&token=7a9aadac-af0e-42f4-ac3b-3d7438c0cfb7",R.drawable.pdf_view));
            Sas.add(new Modal("Discrete Time Systems Described by Difference Equations and Frequency Domain","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FDiscrete%20Time%20Systems%20Described%20by%20Difference%20Equations%20and%20Frequency%20Domain.pdf?alt=media&token=9a90f03c-3ea3-44d4-9ec9-695f23daa97c",R.drawable.pdf_view));
            Sas.add(new Modal("Frequency Response of LTI (LSI) system","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FFREQUENCY%20RESPONSE%20OF%20LTI%20(LSI)%20system.pdf?alt=media&token=77e0b187-1a2b-437c-8745-e257332d224c",R.drawable.pdf_view));
            Sas.add(new Modal("Fourier Analysis","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FFourier%20Analysis.pdf?alt=media&token=d9e2b6ef-b881-41f3-a3e3-4ffa246ad026",R.drawable.pdf_view));
            Sas.add(new Modal("Linear Shift-Invariant (LSI) Systems and Convolution","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FLinear%20Shift-Invariant%20(LSI)%20Systems%20and%20Convolution.pdf?alt=media&token=b61f4bc8-c71d-4220-a594-e103af8859a1",R.drawable.pdf_view));
            Sas.add(new Modal("Properties of Systems","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FProperties%20of%20Systems.pdf?alt=media&token=4e91ae9b-89c8-4c7f-b4c3-54625ef999e1",R.drawable.pdf_view));
            Sas.add(new Modal("Region of Convergence","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FRegion%20of%20Convergence.PDF?alt=media&token=61662129-d19b-4c32-a453-2b339197d202",R.drawable.pdf_view));
            Sas.add(new Modal("Service levels tour- Signals","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FService%20levels%20tour_%20Signals.pdf?alt=media&token=6aedc589-0cc6-443e-9690-17f67ec6ac20",R.drawable.pdf_view));
            Sas.add(new Modal("Signals goals of today's lecture signals","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FSignals%20goals%20of%20today's%20lecture%20signals.pdf?alt=media&token=9c707068-6402-44bf-96ac-fc510aa11b65",R.drawable.pdf_view));
            Sas.add(new Modal("Some important concepts explained briefly","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2FSome%20important%20concepts%20explained%20briefly.pdf?alt=media&token=d3e6b1e1-7f99-4fb4-9297-a8519e6bd523",R.drawable.pdf_view));
            Sas.add(new Modal("The physics of near field","https://firebasestorage.googleapis.com/v0/b/ece-signals.appspot.com/o/ece%2Fthe%20physics%20of%20near%20field.pdf?alt=media&token=d37cf671-aaa8-433d-a7fc-f1c2b8b7f905",R.drawable.pdf_view));


            Netw.add(new Modal("Circuit Analysis using the Node and Mesh Methods","https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/ece%20networks%2FCircuit%20Analysis%20using%20the%20Node%20and%20Mesh%20Methods.pdf?alt=media&token=3380e550-0ea7-4206-a14a-24e43ba54502",R.drawable.pdf_view));
            Netw.add(new Modal("Complex Frequency","https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/ece%20networks%2FComplex%20Frequency.pdf?alt=media&token=9ba00a7e-6e10-4a14-a3cf-83843916552f",R.drawable.pdf_view));
            Netw.add(new Modal("Network Theorems- 1","https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/ece%20networks%2FNetwork%20Theorem.pdf?alt=media&token=f2392af3-fff6-47e3-a549-34898443c43f",R.drawable.pdf_view));
            Netw.add(new Modal("Network Theorems- 2","https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/ece%20networks%2FNetwork%20Theorems_compressed.pdf?alt=media&token=87449b35-97f2-4203-ac88-b48b29bb3737",R.drawable.pdf_view));
            Netw.add(new Modal("Response of First-order RL and RC Circuits","https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/ece%20networks%2FResponse%20of%20First-order%20RL%20and%20RC%20Circuits.pdf?alt=media&token=a224eebb-c4df-4747-a0d4-f07113dab9bc",R.drawable.pdf_view));
            Netw.add(new Modal("Sinusoidal Steady State Response of Linear Circuits","https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/ece%20networks%2FSinusoidal%20Steady%20State%20Response%20of%20Linear%20Circuits.pdf?alt=media&token=2d555d0e-f9cc-4a3a-a446-a9a303efb385",R.drawable.pdf_view));
            Netw.add(new Modal("Two-Port Networks","https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/ece%20networks%2FTwo-Port%20Networks.pdf?alt=media&token=6a48d8cc-41f7-4ded-b508-0f40f44ad4d3",R.drawable.pdf_view));


            ecMath.add(new Modal("Complex Variable- Differentiation","https://firebasestorage.googleapis.com/v0/b/groupapp-bd8a3.appspot.com/o/Diff%20Complex_compressed.pdf?alt=media&token=13f35fe0-97df-4564-ad20-023dcb173be0",R.drawable.pdf_view));
            ecMath.add(new Modal("Complex Variable- Integration","https://firebasestorage.googleapis.com/v0/b/groupapp-bd8a3.appspot.com/o/Integrationcomplex_compressed.pdf?alt=media&token=2557b889-36a3-43df-9530-b5845ecd46e1",R.drawable.pdf_view));
            ecMath.add(new Modal("Partial Differential Equation","https://firebasestorage.googleapis.com/v0/b/groupapp-bd8a3.appspot.com/o/PDE_compressed.pdf?alt=media&token=bbb85696-c246-490a-acf6-c8a101804271",R.drawable.pdf_view));
            ecMath.add(new Modal("Laplace Transformation","https://firebasestorage.googleapis.com/v0/b/groupapp-bd8a3.appspot.com/o/Laplace_compressed.pdf?alt=media&token=951ca8db-ff36-4b0b-8949-6df8b7d9c100",R.drawable.pdf_view));
            ecMath.add(new Modal("Z-Transformation","https://firebasestorage.googleapis.com/v0/b/groupapp-bd8a3.appspot.com/o/Z-Transformation_compressed.pdf?alt=media&token=42da1ec2-7a97-4be2-aeac-4312a79c5f5a",R.drawable.pdf_view));



            DigitalSystem.add(new Modal("Introduction to verilog", "https://firebasestorage.googleapis.com/v0/b/capapp-ee30e.appspot.com/o/ELC%2FUNIT%201_compressed.pdf?alt=media&token=679589bc-dc9d-48a2-a17a-e2c74b4863f4",R.drawable.pdf_view));
            DigitalSystem.add(new Modal("Modules and ports in verilog", "https://firebasestorage.googleapis.com/v0/b/capapp-ee30e.appspot.com/o/ELC%2FUNIT%202_compressed.pdf?alt=media&token=45c9d313-3963-44a2-a1fb-294ae540692e",R.drawable.pdf_view));
            DigitalSystem.add(new Modal("Combinational Circuits", "https://firebasestorage.googleapis.com/v0/b/capapp-ee30e.appspot.com/o/ELC%2FUNIT%203_compressed.pdf?alt=media&token=3ca7f870-92ef-401c-bc23-950be90d051f",R.drawable.pdf_view));
            DigitalSystem.add(new Modal("Sequential Circuits", "https://firebasestorage.googleapis.com/v0/b/capapp-ee30e.appspot.com/o/ELC%2FUNIT%204_compressed.pdf?alt=media&token=ee465d62-8fb0-40d4-a69c-e500053fd863",R.drawable.pdf_view));
            DigitalSystem.add(new Modal("PAL, PLA, etc", "https://firebasestorage.googleapis.com/v0/b/capapp-ee30e.appspot.com/o/ELC%2FUNIT%205_compressed.pdf?alt=media&token=7f59c52c-8014-4225-b454-20de801f2fe4",R.drawable.pdf_view));
            DigitalSystem.add(new Modal("TTL, ECL, CMOS", "https://firebasestorage.googleapis.com/v0/b/capapp-ee30e.appspot.com/o/ELC%2FUNIT%206_compressed.pdf?alt=media&token=2f37ef82-1b06-4ecc-b67f-9e78bc7ed6ad",R.drawable.pdf_view));


            EngMech.add(new Modal("Acceleration Analysis Numericals","https://firebasestorage.googleapis.com/v0/b/engineering-mechanics-937bb.appspot.com/o/notes%2FAcceleration%20Analysis%20Numericals.pdf?alt=media&token=a8c38b67-0c01-4e98-a995-70f89478fa7b",R.drawable.pdf_view));
            EngMech.add(new Modal("Cam and Follower Numericals","https://firebasestorage.googleapis.com/v0/b/engineering-mechanics-937bb.appspot.com/o/notes%2FCam%20and%20Follower%20Numericals.pdf?alt=media&token=a5daf5b1-2aa7-435e-84d5-b6faff48315e",R.drawable.pdf_view));
            EngMech.add(new Modal("KOM Unit-2- Quantitative Kinematic Analysis of Mechanisms","https://firebasestorage.googleapis.com/v0/b/engineering-mechanics-937bb.appspot.com/o/notes%2FKOM%20Unit-2-%20Quantitative%20Kinematic%20Analysis%20of%20Mechanisms.pdf?alt=media&token=9570f530-b8b2-48f7-a163-75324f736a93",R.drawable.pdf_view));
            EngMech.add(new Modal("Mechanism Numericals","https://firebasestorage.googleapis.com/v0/b/engineering-mechanics-937bb.appspot.com/o/notes%2FMechanism%20Numericals.pdf?alt=media&token=b47851ca-5020-4c55-a860-0419bf29aea0",R.drawable.pdf_view));
            EngMech.add(new Modal("Rigid Body and Resisting Body","https://firebasestorage.googleapis.com/v0/b/engineering-mechanics-937bb.appspot.com/o/notes%2FRigid%20Body%20and%20Resisting%20Body.pdf?alt=media&token=47e0a462-ab46-4670-b828-2e1aee3b67fa",R.drawable.pdf_view));
            EngMech.add(new Modal("Velocity Analysis Numericals","https://firebasestorage.googleapis.com/v0/b/engineering-mechanics-937bb.appspot.com/o/notes%2FVelocity%20Analysis%20Numericals.pdf?alt=media&token=32af72cb-2337-426f-a56b-7fa695381d85",R.drawable.pdf_view));


            Mp.add(new Modal("CNC","https://firebasestorage.googleapis.com/v0/b/manufacturing-process-82038.appspot.com/o/CNC_compressed.pdf?alt=media&token=2bd06454-1f99-4b65-a9f6-b2d59daf61d8",R.drawable.pdf_view));
            Mp.add(new Modal("Drilling machine","https://firebasestorage.googleapis.com/v0/b/manufacturing-process-82038.appspot.com/o/Drilling%20machine_compressed.pdf?alt=media&token=19d0659d-6f84-42c0-b24c-5f863538ab7e",R.drawable.pdf_view));
            Mp.add(new Modal("Gear Manufacturing-1","https://firebasestorage.googleapis.com/v0/b/manufacturing-process-82038.appspot.com/o/Gear%20Manufacturing-1_compressed.pdf?alt=media&token=0dd7f997-203e-4425-92b5-970254ab6836",R.drawable.pdf_view));
            Mp.add(new Modal("Gear Manufacturing-2","https://firebasestorage.googleapis.com/v0/b/manufacturing-process-82038.appspot.com/o/Gear%20Manufacturing-2_compressed.pdf?alt=media&token=0f9e62dd-420c-48e0-a7ba-8e427d861416",R.drawable.pdf_view));
            Mp.add(new Modal("Gear Manufacturing-3","https://firebasestorage.googleapis.com/v0/b/manufacturing-process-82038.appspot.com/o/Gear%20Manufacturing-3_compressed.pdf?alt=media&token=f9d4278a-3db6-41e5-b15a-6b2069014426",R.drawable.pdf_view));
            Mp.add(new Modal("Jigs and Fixtures","https://firebasestorage.googleapis.com/v0/b/manufacturing-process-82038.appspot.com/o/Jigs%20and%20Fixtures_compressed.pdf?alt=media&token=d5620be6-0f2c-4e3b-a669-960dc97c15e8",R.drawable.pdf_view));
            Mp.add(new Modal("Complete Unit 1 and 2","https://firebasestorage.googleapis.com/v0/b/manufacturing-process-82038.appspot.com/o/MS-%20UNIT%201%2C2%20FULL_compressed.pdf?alt=media&token=b435b742-6491-4981-b3a8-c7a0045fa512",R.drawable.pdf_view));
            Mp.add(new Modal("Metal Cutting and Cutting Tools","https://firebasestorage.googleapis.com/v0/b/manufacturing-process-82038.appspot.com/o/Metal%20Cutting%20and%20Cutting%20Tools_compressed.pdf?alt=media&token=718cce02-8e01-4f3a-a3c6-9fb9f9478262",R.drawable.pdf_view));
            Mp.add(new Modal("Milling Machines","https://firebasestorage.googleapis.com/v0/b/manufacturing-process-82038.appspot.com/o/Milling%20Machines_compressed.pdf?alt=media&token=5281702e-b27c-48d8-b6d6-caba81bfdbfc",R.drawable.pdf_view));
            Mp.add(new Modal("The Lathe","https://firebasestorage.googleapis.com/v0/b/manufacturing-process-82038.appspot.com/o/The%20Lathe_compressed.pdf?alt=media&token=3d6ecd15-1ba7-45d7-8eb1-14a4e287aa86",R.drawable.pdf_view));


            Math3.add(new Modal("Complex Variable VBD","https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/Complex%20Variable%20VBD_compressed.pdf?alt=media&token=7158c938-74cd-443c-8aeb-60623474e0cd",R.drawable.pdf_view));
            Math3.add(new Modal("Fourier Series and Transform VBD","https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/Fourier%20Series%20and%20Transform%20VBD_compressed.pdf?alt=media&token=36e33b98-5ba7-4ec5-bfff-2a8d096aef5d",R.drawable.pdf_view));
            Math3.add(new Modal("Laplace Transform VBD","https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/Laplace%20Transform%20VBD_compressed.pdf?alt=media&token=afc8c01c-45a0-4553-81a6-a3e8b14c60ee",R.drawable.pdf_view));
            Math3.add(new Modal("Matrices VBD","https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/Matrices%20VBD_compressed.pdf?alt=media&token=2bda4be5-3473-498d-b713-3d7e6c4982e0",R.drawable.pdf_view));
            Math3.add(new Modal("Matrix Class Notes","https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/Matrix%20Class%20Notes_compressed.pdf?alt=media&token=641b1203-1fc8-4114-998c-fc7de825d296",R.drawable.pdf_view));
            Math3.add(new Modal("Partial DE Class Note","https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/Partial%20DE%20Class%20Note_compressed.pdf?alt=media&token=cd511b64-eaf8-448a-9370-d59e95cfc8d5",R.drawable.pdf_view));
            Math3.add(new Modal("Partial Diffrential Equations VBD","https://firebasestorage.googleapis.com/v0/b/maths-8b536.appspot.com/o/Partial%20Diffrential%20Equations%20VBD_compressed.pdf?alt=media&token=c380f801-7881-423d-9451-398cf262299b",R.drawable.pdf_view));

            Quesp.add(new Modal("Engineering Mechanics End Sem paper 1","https://firebasestorage.googleapis.com/v0/b/engineering-mechanics-937bb.appspot.com/o/notes%2Fquestion%20paper%2FKOM%20-1_Compressed.pdf?alt=media&token=399f211b-e67b-49c9-949d-c2e4cb0e90b4",R.drawable.pdf_view));
            Quesp.add(new Modal("Engineering Mechanics End Sem paper 2","https://firebasestorage.googleapis.com/v0/b/engineering-mechanics-937bb.appspot.com/o/notes%2Fquestion%20paper%2FKOM%20-2_Compressed.pdf?alt=media&token=2323892a-88ff-4fe1-ba75-33a6c1fbb7d4",R.drawable.pdf_view));
            Quesp.add(new Modal("Engineering Mechanics End Sem paper 3","https://firebasestorage.googleapis.com/v0/b/engineering-mechanics-937bb.appspot.com/o/notes%2Fquestion%20paper%2FKOM%20-3_Compressed.pdf?alt=media&token=2a19010b-e4dd-4460-ac7d-cad2b54393a7",R.drawable.pdf_view));
            Quesp.add(new Modal("Maths3 End Sem paper 1","https://firebasestorage.googleapis.com/v0/b/engineering-mechanics-937bb.appspot.com/o/notes%2Fquestion%20paper%2FMaths%20paper%20_Compressed.pdf?alt=media&token=409c23c5-5ff8-4900-8be3-31acb92da568",R.drawable.pdf_view));
            Quesp.add(new Modal("Maths3 End Sem paper 2","https://firebasestorage.googleapis.com/v0/b/engineering-mechanics-937bb.appspot.com/o/notes%2Fquestion%20paper%2FMaths%20paper%202_Compressed.pdf?alt=media&token=3be9fa09-9335-440e-b27b-df04f7ed48f9",R.drawable.pdf_view));



            r++;
        }

        interstitialAd = new InterstitialAd(getContext()) ;
        interstitialAd.setAdUnitId("ca-app-pub-1000230449148381/7979912931");
        AdRequest.Builder b = new AdRequest.Builder();
        interstitialAd.loadAd(b.build());



        

        





       
         message = getActivity().getIntent().getStringExtra("SUBJECT_CLICKED");

        if(message.equals("DSA")){
            listView.setAdapter(adapter1);
            status = dsa;
        }
        else if(message.equals("FDLCA")){
            listView.setAdapter(adapter2);
            status= fdlca;

        }
        else if(message.equals("MATHS")){
            listView.setAdapter(adapter3);
            status = maths;
        }
        else if(message.equals("PYTHON")) {
            listView.setAdapter(adapter4);
            status = python;
        }
        else if(message.equals("MECH_MATHS")) {
            listView.setAdapter(adapter3M);
            status = Math3;
        }
        else if(message.equals("MDRAWING")) {
            listView.setAdapter(adapter2M);
            status = Mp;
        }
        else if(message.equals("MECHANICS")) {
            listView.setAdapter(adapter1M);
            status = EngMech;
        }

        else if(message.equals("eDevices")) {
            listView.setAdapter(adapter1E);
            status = ElectronicDevice;
        }
        else if(message.equals("design")) {
            listView.setAdapter(adapter2E);
            status = DigitalSystem;
        }
        else if(message.equals("signals")) {
            listView.setAdapter(adapter3E);
            status = Sas;
        }
        else if(message.equals("network")) {
            listView.setAdapter(adapter4E);
            status = Netw;
        }
        else if(message.equals("ECEmaths")) {
            listView.setAdapter(adapter5E);
            status = ecMath;
        }
        else{
            listView.setAdapter(adapter4M);
            status = Quesp;
            
        }
       
        



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getContext(),Pdf_Activity.class) ;
                p=position;
                i.putExtra("url",  status.get(position).getUrl());

                if(message.equals("fdlca")){
                    switch (position){
                        case 1:
                            Intent j = new Intent(Intent.ACTION_VIEW);
                            j.setData(Uri.parse(status.get(position).getUrl()));
                            startActivity(j);
                            break;
                        case 2:
                            Intent k = new Intent(Intent.ACTION_VIEW);
                            k.setData(Uri.parse(status.get(position).getUrl()));
                            startActivity(k);
                        case 3:
                            Intent m = new Intent(Intent.ACTION_VIEW);
                            m.setData(Uri.parse(status.get(position).getUrl()));
                            startActivity(m);
                        case 4:
                            Intent l = new Intent(Intent.ACTION_VIEW);
                            l.setData(Uri.parse(status.get(position).getUrl()));
                            startActivity(l);





                    }


                } else{


                    if(interstitialAd.isLoaded()){
                        interstitialAd.show();

                    }
                    else {
                        startActivity(i);
                    }
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
                                     }


        );














        return view;
    }
}
