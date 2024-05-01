package com.example.lab6_nguyencattuong_2001216298;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentOne6#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentOne6 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    // TODO: Rename and change types of parameters

    public FragmentOne6() {
        // Required empty public constructor
    }



    // TODO: Rename and change types and number of parameters
    public static FragmentOne6 newInstance() {
        FragmentOne6 fragment = new FragmentOne6();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one6, container, false);
        // Inflate the layout for this fragment
        return view;
    }
}