package com.andrew.module.school;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.andrew.module.common.iservices.ISchoolModuleService;
@Route(path = "/bundle_school/SchoolModuleServiceImpl")
public class SchoolModuleServiceImpl implements ISchoolModuleService {
    @Override
    public String sayHello(String name) {
        return "我是学校组件" + name;
    }

    @Override
    public void init(Context context) {

    }
}
