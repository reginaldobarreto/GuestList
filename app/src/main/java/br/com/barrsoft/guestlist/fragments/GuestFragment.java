package br.com.barrsoft.guestlist.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.barrsoft.guestlist.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GuestFragment extends Fragment {


    public GuestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_guest, container, false);
    }

}
