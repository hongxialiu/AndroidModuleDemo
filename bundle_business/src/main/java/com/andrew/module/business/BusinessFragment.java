package com.andrew.module.business;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.andrew.module.common.base.BaseFragment;


/**
 * 生意fragment
 */
@Route(path = "/bundle_business/BusinessFragment")
public class BusinessFragment extends BaseFragment {


    public static BusinessFragment newInstance() {
        return new BusinessFragment();
    }



    public BusinessFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_business, container, false);
    }


}
