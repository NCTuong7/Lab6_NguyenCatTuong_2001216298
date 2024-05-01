package com.example.lab6_nguyencattuong_2001216298;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_two_3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_two_3 extends Fragment {

    TextView tvData;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    // TODO: Rename and change types of parameters

    public fragment_two_3() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static fragment_two_3 newInstance() {
        fragment_two_3 fragment = new fragment_two_3();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable  ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two_3, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view,  @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tvData = (TextView) view.findViewById(R.id.tvData);

    }

    protected  void displayReceivedData (String message)
    {
        tvData.setText("Data received: " + message);
    }
}