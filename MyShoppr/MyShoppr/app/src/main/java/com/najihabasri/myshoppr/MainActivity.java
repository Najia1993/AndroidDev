package com.najihabasri.myshoppr;

import android.app.ListActivity;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.najihabasri.myshoppr.model.products;
import com.najihabasri.myshoppr.network.api;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends ListActivity {

    List<products> productsList;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        final RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint("http://developer.myntra.com").build();
        api productapi = restAdapter.create(api.class);

        productapi.getData(new Callback<List<products>>() {
            @Override
            public void success(List<products> productses, Response response) {
                productsList = productses;
                adapter adapt = new adapter(getApplicationContext(), R.layout.tem_file, productsList);
                setListAdapter(adapt);
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(getApplicationContext(),"Failed", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
