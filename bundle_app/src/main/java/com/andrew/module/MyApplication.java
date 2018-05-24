package com.andrew.module;

import android.content.Context;
import android.support.multidex.MultiDex;

import com.alibaba.android.arouter.launcher.ARouter;
import com.andrew.module.common.base.BaseApplication;
import com.andrew.module.common.utils.Utils;

/**
 * 初始化
 *
 * @author Andrew
 * @name MyApplication
 */
public class MyApplication extends BaseApplication {


    @Override
    public void onCreate() {
        super.onCreate();
        if (Utils.isAppDebug()) {
            //开启InstantRun之后，一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // dex突破65535的限制
        MultiDex.install(this);
    }


}
