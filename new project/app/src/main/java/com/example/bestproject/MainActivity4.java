package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);




        ArrayList<food_three> foodAryy__three = new ArrayList<>();

        food_three f1 = new food_three("krap","10","menuts",R.drawable.creap_three);
        food_three f2 = new food_three("krap","10","menuts",R.drawable.creap_three);
        food_three f3 = new food_three("krap","10","menuts",R.drawable.creap_three);
        food_three f4 = new food_three("krap","10","menuts",R.drawable.creap_three);
        food_three f5 = new food_three("krap","10","menuts",R.drawable.creap_three);
        food_three f6 = new food_three("krap","10","menuts",R.drawable.creap_three);
        food_three f7 = new food_three("krap","10","menuts",R.drawable.creap_three);

        foodAryy__three.add(f1);
        foodAryy__three.add(f2);
        foodAryy__three.add(f3);
        foodAryy__three.add(f4);
        foodAryy__three.add(f5);
        foodAryy__three.add(f6);
        foodAryy__three.add(f7);

        RecyclerView rv3  = findViewById(R.id.recyclerView3);


        rv3.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv3.setLayoutManager(lm);

        adapter_food_three ad3 = new adapter_food_three(foodAryy__three,this);
        rv3.setAdapter(ad3);
        rv3.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));



    }
}