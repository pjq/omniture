package me.pjq.omniture;

import android.content.Context;

/**
 * Wrapper for the Omniture Android SDK APIs.
 *
 * Refer to http://microsite.omniture.com/t2/help/en_US/mobile/android/methods.html
 *
 * Created by pengjianqing on 6/12/14.
 */
public class OmnitureManager {
    private static OmnitureManager INSTANCE;
    private AnalyticsInterface analytics;
    private TargetInterface target;
    private AudienceManagerInterface audienceManager;
    private ConfigInterface config;


    public OmnitureManager(){
        analytics = new MyAnalytics();
        target = new MyTarget();
        audienceManager = new MyAudienceManager();
        config = new MyConfig();
    }

    public void setContext(Context context ){
        config.setContext(context);
    }

    public static OmnitureManager getInstance(){
        if (null == INSTANCE){
            INSTANCE = new OmnitureManager();
        }

        return INSTANCE;
    }

    public AnalyticsInterface getAnalytics(){
        return analytics;
    }

    public TargetInterface getTarget(){
        return target;
    }

    public AudienceManagerInterface getAudienceManager(){
        return audienceManager;
    }

    public ConfigInterface getConfig() {
        return config;
    }

    public void onResume(){
        config.collectLifecycleData();
    }

    public void onPause(){
        config.pauseCollectingLifecycleData();
    }
}
