package com.andrew.module.business;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.andrew.module.common.base.BaseActivity;
import com.andrew.module.common.iservices.ISchoolModuleService;

/**
 *
 * @author Andrew
 * @name BusinessCenterActivity
 */
@Route(path = "/business/BusinessCenterActivity")
public class BusinessCenterActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_business_center);
        ARouter.getInstance().inject(this);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ISchoolModuleService moduleService;
                moduleService = ARouter.getInstance().navigation(ISchoolModuleService.class);
                moduleService.sayHello("学校组件");
            }
        });
    }

}
