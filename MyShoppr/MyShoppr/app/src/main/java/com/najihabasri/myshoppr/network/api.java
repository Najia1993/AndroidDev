package com.najihabasri.myshoppr.network;

import com.najihabasri.myshoppr.model.products;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by HawaNajihah on 10/8/2016.
 */
public interface api {

    @GET("/v2/search/data/men-jackets-nav?p=1&rows=48&userQuery=false")
    public void getData(Callback<List<products>> reponse);
}
