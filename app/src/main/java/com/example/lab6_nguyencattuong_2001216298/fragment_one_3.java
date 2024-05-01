package com.example.lab6_nguyencattuong_2001216298;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_one_3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_one_3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    SendMessage SM;
    Button btnPassData;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_one_3() {
        // Required empty public constructor
    }


    public static fragment_one_3 newInstance() {
        fragment_one_3 fragment = new fragment_one_3();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_one_3,container,false);

        // Inflate the layout for this fragment
        return rootview;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnPassData = (Button) view.findViewById(R.id.btnPassData);
        final EditText edtMessage =    (EditText) view.findViewById(R.id.edtMessage);
        btnPassData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SM.sendData(edtMessage.getText().toString().trim());
            }
        });
    }

    interface SendMessage
    {
        void sendData(String message);
    }

    @Override
    public void onAttach( Context context) {
        super.onAttach(context);

        try
        {
            SM = (SendMessage) getActivity();

        }

        catch (ClassCastException e)
        {
            throw new ClassCastException("Error in retrieving data. Please try again");
        }
    }
}