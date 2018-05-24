package com.andrew.module.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.alibaba.android.arouter.launcher.ARouter;
import com.andrew.module.common.base.BaseActivity;
import com.andrew.module.common.base.BaseFragment;
import com.andrew.module.common.widget.NoScrollViewPager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrew
 * @name MainFragmentActivity
 */
public class MainFragmentActivity extends BaseActivity {

    private NoScrollViewPager mPager;
    private List<BaseFragment> mFragments = new ArrayList<>();
    private FragmentAdapter mAdapter;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int i = item.getItemId();
            if (i == R.id.navigation_home) {
                mPager.setCurrentItem(0);
                return true;
            } else if (i == R.id.navigation_dashboard) {
                mPager.setCurrentItem(1);
                return true;
            } else if (i == R.id.navigation_notifications) {
                mPager.setCurrentItem(2);
                return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        initViewPager();
    }

    private void initViewPager() {
        BaseFragment businessFragment = (BaseFragment) ARouter.getInstance().build("/bundle_business/BusinessFragment").navigation();
        BaseFragment schoolFragment = (BaseFragment) ARouter.getInstance().build("/bundle_school/SchoolFragment").navigation();
        BaseFragment businessFragment1 = (BaseFragment) ARouter.getInstance().build("/bundle_business/BusinessFragment").navigation();//可以是其他的fragment
        mFragments.add(businessFragment);
        mFragments.add(schoolFragment);
        mFragments.add(businessFragment1);
        mPager = findViewById(R.id.container_pager);
        mAdapter = new FragmentAdapter(getSupportFragmentManager(), mFragments);
        mPager.setPagerEnabled(false);
        mPager.setAdapter(mAdapter);
    }



}
