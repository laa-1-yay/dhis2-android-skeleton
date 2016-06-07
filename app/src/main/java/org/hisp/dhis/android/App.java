package org.hisp.dhis.android;

import android.app.Application;

import org.hisp.dhis.client.sdk.ui.bindings.commons.Inject;
import org.hisp.dhis.client.sdk.ui.bindings.commons.NavigationHandler;
import org.hisp.dhis.client.sdk.ui.bindings.views.DefaultLoginActivity;

public final class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Inject.init(this, App.class.getCanonicalName(), App.class.getCanonicalName());

        NavigationHandler.loginActivity(DefaultLoginActivity.class);
        NavigationHandler.homeActivity(HomeActivity.class);
    }
}
