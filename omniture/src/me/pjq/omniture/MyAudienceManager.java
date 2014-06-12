package me.pjq.omniture;

import com.adobe.mobile.AudienceManager;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pengjianqing on 6/12/14.
 */
public class MyAudienceManager implements AudienceManagerInterface{

    public MyAudienceManager(){

    }

    @Override
    public HashMap<String, Object> getVisitorProfile() {
        return AudienceManager.getVisitorProfile();
    }

    @Override
    public String getDpid() {
        return AudienceManager.getDpid();
    }

    @Override
    public String getDpuuid() {
        return AudienceManager.getDpuuid();
    }

    @Override
    public void setDpidAndDpuuid(String dpid, String dpuuid) {
        AudienceManager.setDpidAndDpuuid(dpid,dpuuid);
    }

    /**
     * <pre>
     HashMap aamTraits = new HashMap<String, Object>();
     aamTraits.put("trait", "b");
     AudienceManager.signalWithData(aamTraits, new AudienceManager.AudienceManagerCallback<Map<String, Object>>() {
        @Override
        public void call(Map<String, Object> item) {
        // segments come back here, normally found in the segs object of your json
        }
        });
     * <pre/>
     * @param data
     * @param callback
     */
    @Override
    public void signalWithData(Map<String, Object> data, AudienceManager.AudienceManagerCallback<Map<String, Object>> callback) {
        AudienceManager.signalWithData(data, callback);
    }
}
