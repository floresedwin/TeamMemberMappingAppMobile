package edu.msu.flores59.mobile.util;

import android.view.MenuItem;

import edu.msu.flores59.mobile.identity.AuthenticationHandler;

public class LogoutListener implements MenuItem.OnMenuItemClickListener {
    private AuthenticationHandler authenticationHandler;

    public LogoutListener(AuthenticationHandler authenticationHandler) {
        this.authenticationHandler = authenticationHandler;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        authenticationHandler.logout();
        return true;
    }
}
