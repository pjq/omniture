package me.pjq.omniture;

import com.adobe.mobile.Target;
import com.adobe.mobile.TargetLocationRequest;

import java.util.Map;

/**
 * Created by pengjianqing on 6/12/14.
 */
public interface TargetInterface {
    public void loadRequest(TargetLocationRequest request, Target.TargetCallback<String> callback);

    public TargetLocationRequest createOrderConfirmRequest(String name, String orderId, String orderTotal, String productPurchasedId, Map<String, Object> parameters);

    public TargetLocationRequest createRequest(String name, String defaultContent, Map<String, Object> parameters);

    public void clearCookies();

    public String getPcID();

    public String getSessionID();

}
