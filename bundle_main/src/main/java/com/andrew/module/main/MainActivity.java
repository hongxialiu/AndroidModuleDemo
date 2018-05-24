package com.andrew.module.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.andrew.module.common.base.BaseActivity;
import com.andrew.module.common.utils.ToastUtils;

/**
 *
 * @author Andrew
 * @name MainActivity
 */
public class MainActivity extends BaseActivity implements View.OnClickListener {

    private long mExitTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.school_button).setOnClickListener(this);
        findViewById(R.id.business_button).setOnClickListener(this);
        findViewById(R.id.fragment_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.school_button) {
            //跳转到SchoolActivity
            ARouter.getInstance().build("/school/SchoolActivity").navigation();
        } else if (view.getId() == R.id.business_button) {
            //跳转到BusinessCenterActivity
            ARouter.getInstance().build("/business/BusinessCenterActivity").navigation();
        } else if (view.getId() == R.id.fragment_button) {
            startActivity(new Intent(this, MainFragmentActivity.class));
        }
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
            //两秒之内按返回键就会退出
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                ToastUtils.showShortToast(getString(R.string.app_exit_hint));
                mExitTime = System.currentTimeMillis();
            } else {
                finish();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
