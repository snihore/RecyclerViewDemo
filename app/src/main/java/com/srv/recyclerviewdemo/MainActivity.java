package com.srv.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<News> list;
    private SharedPreferences sharedPreferences;
    private boolean isDark = false;
    private RecyclerViewAdapter recyclerViewAdapter;
    private FloatingActionButton darkBtn;
    private ConstraintLayout parentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getApplicationContext().getSharedPreferences("dark_feature", MODE_PRIVATE);

        //Init Views
        parentLayout = (ConstraintLayout)findViewById(R.id.parent_layout);
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        darkBtn = (FloatingActionButton)findViewById(R.id.dark_btn);

        //Get News Data
        NewsData newsData = new NewsData();
        list = newsData.getList();

        //Handle dark feature
        isDark = sharedPreferences.getBoolean("is_dark", false);
        if(isDark){
            //TRUE

            //Change Parent's background color -- BLACK
            parentLayout.setBackgroundColor(getResources().getColor(R.color.black));
        }

        //Set Adapter

        //change item's view colors
        //by calling constructor with "isDark" attribute
        recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(), list, isDark);

        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        //click events
        darkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                isDark = !isDark;

                if(isDark){
                    //TRUE

                    //Change Parent's background color -- BLACK
                    parentLayout.setBackgroundColor(getResources().getColor(R.color.black));

                    //change item's view colors
                    //by calling constructor with "isDark" attribute
                    recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(), list, isDark);
                    recyclerView.setAdapter(recyclerViewAdapter);

                }else {
                    //FALSE

                    //Change Parent's background color -- WHITE
                    parentLayout.setBackgroundColor(getResources().getColor(R.color.white));

                    //change item's view colors
                    //by calling constructor without "isDark" attribute
                    recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(), list);
                    recyclerView.setAdapter(recyclerViewAdapter);

                }


                //save isDark state -- TRUE or FALSE
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("is_dark", isDark);
                editor.commit();

            }
        });
    }
}
