package me.pjq.omniture;

import com.adobe.mobile.Target;
import com.adobe.mobile.TargetLocationRequest;

import java.util.Map;

/**
 * Created by pengjianqing on 6/12/14.
 */
public class MyTarget implements TargetInterface {

    /**
     * <pre>
     *     Target.loadRequest(heroBannerRequest, new Target.TargetCallback<String>() {
    @Override
    public void call(String item) {
    // do something with item
    }
    });
     *     <pre/>
     * @param request
     * @param callback
     */
    @Override
    public void loadRequest(TargetLocationRequest request, Target.TargetCallback<String> callback) {
        Target.loadRequest(request, callback);
    }

    /**
     * <pre>
     *     TargetLocationRequest orderConfirm = Target.createOrderConfirmRequest("orderConfirm", "order", "47.88", "3722", null);
     *     <pre/>
     * @param name
     * @param orderId
     * @param orderTotal
     * @param productPurchasedId
     * @param parameters
     * @return
     */
    @Override
    public TargetLocationRequest createOrderConfirmRequest(String name, String orderId, String orderTotal, String productPurchasedId, Map<String, Object> parameters) {
        return Target.createOrderConfirmRequest(name, orderId, orderTotal, productPurchasedId, parameters);
    }

    /**
     * <pre>
     *     TargetLocationRequest heroBannerRequest = Target.createRequest("heroBanner", "default.png", null);
     *     <pre/>
     * @param name
     * @param defaultContent
     * @param parameters
     * @return
     */
    @Override
    public TargetLocationRequest createRequest(String name, String defaultContent, Map<String, Object> parameters) {
        return Target.createRequest(name, defaultContent, parameters);
    }

    @Override
    public void clearCookies() {
        Target.clearCookies();
    }

    @Override
    public String getPcID() {
        return Target.getPcID();
    }

    @Override
    public String getSessionID() {
        return Target.getSessionID();
    }
}
