package com.example.dhiviya.dhivya;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

   // List<MyJson.Content> DataList =new ArrayList<>();
   List<MyJson.Data> DataList =new ArrayList<>();
    public MyAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_list);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        loadJson();
    }
    private void loadJson() {
        //Grid
//        GridLayoutManager manager = new GridLayoutManager(getApplicationContext(),2);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(manager);
     //   List
        LinearLayoutManager linear=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linear);
//        ApiService api=RetroClient.getApiService();
//        Call<MyJson> call = api.getMyJSON();
//        call.enqueue(new Callback<MyJson>() {
//            @Override
//            public void onResponse(Call<MyJson> call, Response<MyJson> response) {
//                if (response != null) {
//                    MyJson data = response.body();
//                    DataList = data.Item.Content;
//                    adapter = new MyAdapter(getApplicationContext(),DataList);
//                    recyclerView.setAdapter(adapter);
//                }
//            }
//            @Override
//            public void onFailure(Call<MyJson> call, Throwable t) {
//                Toast.makeText(getApplicationContext(),"Network Connection Is Not Available",Toast.LENGTH_LONG).show();
//            }
//
//        });
//
//    }

//    private void loadJson() {
//        LinearLayoutManager linear=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
//        recyclerView.setLayoutManager(linear);
       ApiService api=RetroClient.getApiService();
       Call<MyJson> call = api.getMyJSON();
       call.enqueue(new Callback<MyJson>() {
          @Override
           public void onResponse(Call<MyJson> call, Response<MyJson> response) {
                 if (response != null) {
                   MyJson data = response.body();
                   DataList = data.sitter.response.data;
                   adapter = new MyAdapter(getApplicationContext(),DataList);
                   recyclerView.setAdapter(adapter);
            }
            }
          @Override
            public void onFailure(Call<MyJson> call, Throwable t) {
               Toast.makeText(getApplicationContext(),"Network Connection Is Not Available",Toast.LENGTH_LONG).show();
          }
       });
   }
}
