package freechat.yassinedeveloper.com.freechat.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import freechat.yassinedeveloper.com.freechat.R;

/**
 * Created by Anu on 22/04/17.
 */



public class FragmentSUGGESTIONS extends android.support.v4.app.Fragment {

    public FragmentSUGGESTIONS() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_suggestions, container, false);
    }

}