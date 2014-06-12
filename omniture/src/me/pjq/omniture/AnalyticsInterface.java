package me.pjq.omniture;

import android.location.Location;
import com.adobe.mobile.*;
import com.adobe.mobile.Analytics;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Refer to http://microsite.omniture.com/t2/help/en_US/mobile/android/analytics.html
 *
 * Created by pengjianqing on 6/12/14.
 */
public interface AnalyticsInterface {
    public void trackState(String state, Map<String, Object> contextData);

    public void trackAction(String state, Map<String, Object> contextData);

    public String trackingIdentifier();

    public void trackLocation(Location location, Map<String, Object> contextData);

    public void trackLifetimeValueIncrease(BigDecimal amount, HashMap<String, Object> contextData);

    public void trackTimedActionStart(String action, Map<String, Object> contextData);

    public void trackTimedActionUpdate(String action, Map<String, Object> contextData);

    public void trackTimedActionEnd(String action, Analytics.TimedActionBlock<Boolean> logic);

    void sendQueuedHits();

    long getQueueSize();

    void clearQueue();
}
