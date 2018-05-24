package com.andrew.module.school;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.andrew.module.common.base.BaseActivity;

/**
 * <p> </p>
 *
 * @author Andrew 2017/5/19 20:24
 * @version V1.1
 * @name SchoolActivity
 */
@Route(path = "/school/SchoolActivity")
public class SchoolActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);

    }

}
