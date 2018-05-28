package com.example.eunice.jan;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class PreSurveyFragment extends Fragment{
    private RadioGroup radioGroupOne;
    public static final String VERY_GOOD = "very";
    public static final int VERY = 0;
    public static final String GOOD = "very_nice";
    public static final String NORMAL = "normal";
    public static final String BAD = "very_bad";
    private PreSurveyListener listener;

    public PreSurveyFragment() {
        // Required empty public constructor
    }

    public interface PreSurveyListener{
        void onClickNext(String veryGood);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (PreSurveyListener)context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_pre_survey_dialog, null);
        radioGroupOne = (RadioGroup) view.findViewById(R.id.radio_group_one);
        onRadioButton(view);
        return view;
    }

    public void onRadioButton(View v){
        int id = radioGroupOne.getCheckedRadioButtonId();
        switch (id){
            case R.id.very_good:

                break;
            case R.id.good:

                break;
        }
    }




}
