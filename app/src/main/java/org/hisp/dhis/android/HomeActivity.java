package org.hisp.dhis.android;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.MenuItem;

import org.hisp.dhis.client.sdk.ui.bindings.views.DefaultHomeActivity;

public class HomeActivity extends DefaultHomeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected boolean onItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
