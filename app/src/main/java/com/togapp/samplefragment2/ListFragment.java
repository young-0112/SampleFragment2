package com.togapp.samplefragment2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment {

    // 각각의 버튼을 눌렀을 때 호출될 메서드
    public interface ImageSelectionCallback{
        void onImageSelected(int position);
    }

    public ImageSelectionCallback callback;

    // onAttach() 메서드는 프래그먼트가 액티비티 위에 올라가는 시점에 호출됨됨
    // ctrl + o onAttach 호출
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof ImageSelectionCallback) {
            callback = (ImageSelectionCallback) context;
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_list, container, false);

        Button button = rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (callback != null) {
                    callback.onImageSelected(0);
                }
            }
        });

        Button button2 = rootView.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (callback != null) {
                    callback.onImageSelected(1);
                }
            }
        });

        Button button3 = rootView.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (callback != null) {
                    callback.onImageSelected(2);
                }
            }
        });

        return rootView;
    }
}