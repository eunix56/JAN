package com.example.eunice.jan;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CoursesPage extends AppCompatActivity implements PreSurveyFragment.PreSurveyListener{

    private CollapsingToolbarLayout toolbarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_page);
        toolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapsing_tool_bar_courses);
        toolbarLayout.setTitle("Java");

        PreSurveyFragment survey = new PreSurveyFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fragmentContainer, survey).commit();

    }

    @Override
    public void onClickNext(String veryGood) {
        Bundle args = new Bundle();
        args.getSerializable(veryGood);
    }
}
