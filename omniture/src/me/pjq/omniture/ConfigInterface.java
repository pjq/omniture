package me.pjq.omniture;

import android.content.Context;
import com.adobe.mobile.MobilePrivacyStatus;

import java.math.BigDecimal;

/**
 * Created by pengjianqing on 6/12/14.
 */
public interface ConfigInterface {
    public void setContext(Context context);

    public String getVersion();

    public MobilePrivacyStatus getPrivacyStatus();

    public void setPrivacyStatus(MobilePrivacyStatus status);

    public BigDecimal getLifetimeValue();

    public String getUserIdentifier();

    public void setUserIdentifer(String identifier);

    public Boolean getDebugLogging();

    public void setDebugLogging(Boolean debugLogging);

    public void collectLifecycleData();

    public void pauseCollectingLifecycleData();

}
