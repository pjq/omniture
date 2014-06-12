package me.pjq.omniture;

import android.location.Location;
import com.adobe.mobile.Analytics;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pengjianqing on 6/12/14.
 */
public class MyAnalytics implements AnalyticsInterface {
    @Override
    public void trackState(String state, Map<String, Object> contextData) {
        Analytics.trackState(state, contextData);
    }

    @Override
    public void trackAction(String state, Map<String, Object> contextData) {
        Analytics.trackAction(state, contextData);
    }

    @Override
    public String trackingIdentifier() {
        return Analytics.getTrackingIdentifier();
    }

    @Override
    public void trackLocation(Location location, Map<String, Object> contextData) {
        Analytics.trackLocation(location, contextData);
    }

    @Override
    public void trackLifetimeValueIncrease(BigDecimal amount, HashMap<String, Object> contextData) {
        Analytics.trackLifetimeValueIncrease(amount, contextData);
    }

    @Override
    public void trackTimedActionStart(String action, Map<String, Object> contextData) {
        Analytics.trackTimedActionStart(action, contextData);
    }

    @Override
    public void trackTimedActionUpdate(String action, Map<String, Object> contextData) {
        Analytics.trackTimedActionUpdate(action, contextData);
    }

    /**
     * <pre>
     *     Analytics.trackTimedActionEnd("cartToCheckout", new Analytics.TimedActionBlock<Boolean>() {
    @Override
    public Boolean call(long inAppDuration, long totalDuration, Map<String, Object> contextData) {
    contextData.put("price", 49.95);
    return true;
    }
    });
     *
     *
     *     <pre/>
     *
     * @param action
     * @param logic
     */
    @Override
    public void trackTimedActionEnd(String action, com.adobe.mobile.Analytics.TimedActionBlock<Boolean> logic) {
        Analytics.trackTimedActionEnd(action, logic);

    }

    @Override
    public void sendQueuedHits() {
        //TODO Requires SDK 4.1
//        Analytics.sendQueuedHits();
    }

    @Override
    public long getQueueSize() {
        return Analytics.getQueueSize();
    }

    @Override
    public void clearQueue() {
        Analytics.clearQueue();
    }
}
