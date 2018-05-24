package debug;

import com.andrew.module.common.base.BaseApplication;

/**
 *
 * @author Andrew
 * @name MainApplication
 */
public class MainApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        login();
    }

    /**
     * 模拟登陆，然后拿到sessionId或者Token
     * 这样就能够在组件请求接口了
     */
    private void login() {
//        HttpClient client = new HttpClient.Builder()
//                .baseUrl("http://www.baidu.com")
//                .url("**/**")
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
