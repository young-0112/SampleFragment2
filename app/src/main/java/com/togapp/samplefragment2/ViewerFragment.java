package com.togapp.samplefragment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class ViewerFragment extends Fragment {
    ImageView imageView;

    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_viewer,container, false);

        imageView = rootView.findViewById(R.id.imageView);
        return rootView;
    }

    public void setImage(int resId){
        imageView.setImageResource(resId);
    }
}