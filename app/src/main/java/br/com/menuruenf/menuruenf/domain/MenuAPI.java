package br.com.menuruenf.menuruenf.domain;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Rodolfo on 13/10/2015.
 */
public interface MenuAPI {
    @GET("/dinners.json")
    public void getDinner(Callback<Dinner>cb);
}
