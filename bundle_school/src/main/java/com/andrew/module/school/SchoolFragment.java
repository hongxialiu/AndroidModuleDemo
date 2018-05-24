package com.andrew.module.school;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.andrew.module.common.base.BaseFragment;


/**
 *
 */
@Route(path = "/bundle_school/SchoolFragment")
public class SchoolFragment extends BaseFragment {

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment SchoolFragment.
     */
    public static SchoolFragment newInstance() {
        return new SchoolFragment();
    }


    public SchoolFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_school, container, false);
    }


}
