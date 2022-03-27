package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<contactmodel> contact_array = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rv = findViewById(R.id.recycle);
        rv.setLayoutManager(new LinearLayoutManager(this));

        contact_array.add(new contactmodel(R.drawable.sunny, "Karachi", "38 Degree Celsius"));
        contact_array.add(new contactmodel(R.drawable.partly, "Islamabad", "26 Degree Celsius"));
        contact_array.add(new contactmodel(R.drawable.partly, "Beijing,China", "22 Degree Celsius"));
        contact_array.add(new contactmodel(R.drawable.rainy, "Hong Kong", "18 Degree Celsius"));
        contact_array.add(new contactmodel(R.drawable.rainny, "Los Angeles", "22 Degree Celsius"));
        contact_array.add(new contactmodel(R.drawable.sunny, "Mumbai", "27 Degree Celsius"));
        contact_array.add(new contactmodel(R.drawable.snowy, "Moscow", "-8 Degree Celsius"));
        contact_array.add(new contactmodel(R.drawable.rainny, "Paris", "14 Degree Celsius"));
        contact_array.add(new contactmodel(R.drawable.stormy, "Singapore", "10 Degree Celsius"));
        contact_array.add(new contactmodel(R.drawable.partly, "Gujranwala", "25 Degree Celsius"));
        contact_array.add(new contactmodel(R.drawable.sunny, "Dubai", "32 Degree Celsius"));
        contact_array.add(new contactmodel(R.drawable.rainy, "Multan", "19 Degree Celsius"));
        contact_array.add(new contactmodel(R.drawable.sunny, "Sharjah", "33 Degree Celsius"));
        contact_array.add(new contactmodel(R.drawable.stormy, "Sydney", "18 Degree Celsius"));
        contact_array.add(new contactmodel(R.drawable.snowy, "Toronto", "-30 Degree Celsius"));
        contact_array.add(new contactmodel(R.drawable.snowy, "Greenland", "-29 Degree Celsius"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, contact_array);
        rv.setAdapter(adapter);
    }
}