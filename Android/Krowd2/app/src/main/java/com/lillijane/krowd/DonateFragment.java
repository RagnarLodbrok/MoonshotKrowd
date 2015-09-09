package com.lillijane.krowd;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DonateFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DonateFragment extends Fragment {


    /**
     * Use this factory method to create a new instance of
     * this fragment.
     *
     * @return A new instance of fragment DonateFragment.
     */
    public static DonateFragment newInstance() {
        return new DonateFragment();
    }

    public DonateFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_donate, container, false);
    }

}
