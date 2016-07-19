package me.rk.andses13ass3;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by airodyra on 7/19/2016.
 */
public class FragmentAudio extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_audio_layout, container, false);
        TextView textView=(TextView)view.findViewById(R.id.textView);
        textView.setText("Fragments Audio");
        return view;
    }
}
