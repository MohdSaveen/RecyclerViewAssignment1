package com.example.recyclerviewassignment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button);

        RecyclerView recyclerView=findViewById(R.id.recyclerview);
        ArrayList<String> names=new ArrayList<>();
        AdapterClass adapterClass=new AdapterClass(names,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapterClass);
        Button button2=findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                names.add("    Saveen Khan");
                adapterClass.notifyDataSetChanged();

            }
        });


           button2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if(names.size()!=0) {

                       names.remove(0);
                       adapterClass.notifyDataSetChanged();
                   }
               }
           });


    }
}