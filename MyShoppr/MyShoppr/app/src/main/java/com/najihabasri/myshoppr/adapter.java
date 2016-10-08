package com.najihabasri.myshoppr;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.najihabasri.myshoppr.model.products;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by HawaNajihah on 10/8/2016.
 */
public class adapter extends ArrayAdapter<products> {

    String url = "http://developer.myntra.com/";
    private Context context;
    private List<products> productsList;



    public adapter(Context context, int resource, List<products> objects) {
        super(context, resource, objects);
        this.context = context;
        this.productsList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.tem_file,parent, false);
        products p = productsList.get(position);
        TextView tv = (TextView) view.findViewById(R.id.name);
        tv.setText(p.getBrands_filter_facet());
        ImageView img = (ImageView) view.findViewById(R.id.img);
        Picasso.with(getContext()).load(url+p.getSearch_image()).resize(400,400).into(img);
        return view;

    }

}
