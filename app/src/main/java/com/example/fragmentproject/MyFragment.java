package com.example.fragmentproject;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //to  vorodi instancr ro dadae so :
       // inflater.inflate(R.layout.fragment_my_fragment,container,false);
        View fragmentView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_my_fragment,container,false);
        TextView textView =fragmentView.findViewById(R.id.tv_myfragment);
        textView.setText("onCreateView");
        return fragmentView;
    }

    //method onViewCreated


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        //TextView textView =getView().findViewById(R.id.tv_myfragment);
        //textView.setText("onCreateView");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    /////////////////////////////back or new fragment :


    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    ////call back to onCreateView

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
