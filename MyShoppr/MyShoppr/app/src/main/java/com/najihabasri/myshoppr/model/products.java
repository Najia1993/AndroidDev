package com.najihabasri.myshoppr.model;

import android.graphics.Bitmap;

/**
 * Created by HawaNajihah on 10/8/2016.
 */
public class products {

    private String brands_filter_facet;
    private Bitmap search_image;

    public String getBrands_filter_facet() {
        return brands_filter_facet;
    }

    public void setBrands_filter_facet(String brands_filter_facet) {
        this.brands_filter_facet = brands_filter_facet;
    }

    public Bitmap getSearch_image() {
        return search_image;
    }

    public void setSearch_image(Bitmap search_image) {
        this.search_image = search_image;
    }
}
