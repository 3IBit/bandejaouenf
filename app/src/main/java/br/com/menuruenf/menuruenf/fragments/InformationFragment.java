package br.com.menuruenf.menuruenf.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.menuruenf.menuruenf.R;

/**
 * Created by Rodolfo on 31/08/2015.
 */
public class InformationFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_information, container, false);
        return view;
    }
}
