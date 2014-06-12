package me.pjq.omniture;

import com.adobe.mobile.AudienceManager;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pengjianqing on 6/12/14.
 */
public interface AudienceManagerInterface {

    public  HashMap<String, Object> getVisitorProfile();

    public String getDpid();

    public String getDpuuid();

    public void setDpidAndDpuuid(String dpid, String dpuuid);

    public void signalWithData(Map<String, Object> data, AudienceManager.AudienceManagerCallback<Map<String, Object>> callback);
}
