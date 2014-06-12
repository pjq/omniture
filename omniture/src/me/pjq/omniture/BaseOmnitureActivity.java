package me.pjq.omniture;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by pengjianqing on 6/12/14.
 */
public class BaseOmnitureActivity extends Activity {
    protected OmnitureManager omnitureManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        omnitureManager = OmnitureManager.getInstance();
        omnitureManager.getConfig().setContext(getApplicationContext());
    }

    @Override
    protected void onResume() {
        super.onResume();

        omnitureManager.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();

        omnitureManager.onPause();
    }
}
