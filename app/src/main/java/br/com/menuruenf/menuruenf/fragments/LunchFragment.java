package br.com.menuruenf.menuruenf.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.menuruenf.menuruenf.R;

/**
 * Created by Rodolfo on 01/09/2015.
 */
public class LunchFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_lunch, container, false);
        return view;
    }
}
