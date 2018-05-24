package debug;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.andrew.module.business.BusinessCenterActivity;

/**
 * 组件开发模式下，用于传递数据的启动Activity，集成模式下无效<
 *
 * @author Andrew
 * @name LauncherActivity
 */
public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //在这里传值给需要调试的Activity
        Intent intent = new Intent(this, BusinessCenterActivity.class);
        intent.putExtra("id", "123456");
        startActivity(intent);
        finish();
    }

}
