package br.com.menuruenf.menuruenf.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.okhttp.ResponseBody;

import br.com.menuruenf.menuruenf.R;
import br.com.menuruenf.menuruenf.domain.Dinner;
import br.com.menuruenf.menuruenf.domain.MenuAPI;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Rodolfo on 01/09/2015.
 */
public class DinnerFragment extends BaseFragment  {

    String url = "http://menu-api.herokuapp.com";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){




        final View view = inflater.inflate(R.layout.fragment_dinner, container, false);


        RestAdapter adapter = new RestAdapter.Builder().setEndpoint(url).build();

        MenuAPI menuapi = adapter.create(MenuAPI.class);

        menuapi.getDinner(new Callback<Dinner>() {
            @Override
            public void success(Dinner dinner, Response response) {

                TextView date = (TextView) view.findViewById(R.id.dinner_date);
                TextView salad = (TextView) view.findViewById(R.id.dinner_salad);
                TextView juice = (TextView) view.findViewById(R.id.dinner_juice);
                TextView protein1 = (TextView) view.findViewById(R.id.dinner_protein1);
                TextView protein2 = (TextView) view.findViewById(R.id.dinner_protein2);
                TextView protein3 = (TextView) view.findViewById(R.id.dinner_protein3);
                TextView garnish = (TextView) view.findViewById(R.id.dinner_garnish);
                TextView accompaniment = (TextView) view.findViewById(R.id.dinner_accompaniment1);
                TextView dessert = (TextView) view.findViewById(R.id.dinner_dessert);



                date.setText(dinner.getDate());
                salad.setText(dinner.getSalad());
                juice.setText(dinner.getJuice());
                protein1.setText(dinner.getProtein1());
                protein2.setText(dinner.getProtein2());
                protein3.setText(dinner.getProtein3());
                garnish.setText(dinner.getGarnish());
                accompaniment.setText(dinner.getAccompaniment());
                dessert.setText(dinner.getDessert());

            }

            @Override
            public void failure(RetrofitError error) {
                String merror = error.getMessage();

            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

    }


}