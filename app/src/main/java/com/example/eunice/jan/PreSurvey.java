package com.example.eunice.jan;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PreSurvey extends AppCompatActivity implements PreSurveyFragment.PreSurveyListener,
        SurveyTwoFragment.SurveyTwoListener, SurveyThreeFragment.SurveyThreeListener{

    private PreSurveyFragment survey_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_survey);

        survey_one = new PreSurveyFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fragmentContainer, survey_one).commit();

    }

    @Override
    public void onClickNext(String veryGood) {

    }

    @Override
    public void onClickNextTwo(String veryGood) {

    }

    @Override
    public void onClickNextThree(String veryGood) {

    }
}
