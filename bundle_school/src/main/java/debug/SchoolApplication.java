package debug;

import com.andrew.module.common.base.BaseApplication;

/**
 *
 * @author Andrew
 * @name SchoolApplication
 */
public class SchoolApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        login();
    }

    /**
     * 在这里模拟登陆，然后拿到sessionId或者Token
     * 这样就能够在组件请求接口了
     */
    private void login() {
//        HttpClient client = new HttpClient.Builder()
//                .baseUrl("http://www.baidu.com/")
//                .url("**/55")
//                .build();
//        client.get(new OnResultListener<String>() {
//
//            @Override
//            public void onSuccess(String result) {
//                Logger.e(result);
//            }
//
//            @Override
//            public void onError(int code, String message) {
//                Logger.e(message);
//            }
//
//            @Override
//            public void onFailure(String message) {
//                Logger.e(message);
//            }
//        });
    }
}
