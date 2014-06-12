package me.pjq.omniture;

import android.content.Context;
import com.adobe.mobile.Config;
import com.adobe.mobile.MobilePrivacyStatus;

import java.math.BigDecimal;

/**
 * Created by pengjianqing on 6/12/14.
 */
public class MyConfig implements ConfigInterface {
    @Override
    public void setContext(Context context) {
        Config.setContext(context);
    }

    @Override
    public String getVersion() {
        return Config.getVersion();
    }

    @Override
    public MobilePrivacyStatus getPrivacyStatus() {
        return Config.getPrivacyStatus();
    }

    @Override
    public void setPrivacyStatus(MobilePrivacyStatus status) {
        Config.setPrivacyStatus(status);
    }

    @Override
    public BigDecimal getLifetimeValue() {
        return Config.getLifetimeValue();
    }

    @Override
    public String getUserIdentifier() {
        return Config.getUserIdentifier();
    }

    @Override
    public void setUserIdentifer(String identifier) {
        Config.setUserIdentifier(identifier);
    }

    @Override
    public Boolean getDebugLogging() {
        return Config.getDebugLogging();
    }

    @Override
    public void setDebugLogging(Boolean debugLogging) {
        Config.setDebugLogging(debugLogging);
    }

    @Override
    public void collectLifecycleData() {
        Config.collectLifecycleData();
    }

    @Override
    public void pauseCollectingLifecycleData() {
        Config.pauseCollectingLifecycleData();
    }
}
