package com.example.eunice.jan;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    private CardView courseOneCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        courseOneCardView = (CardView)findViewById(R.id.course_one_card_view);
        courseOneCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i = new Intent(Dashboard.this, CoursesPage.class);
                startActivity(i);
            }
        });
    }
}
