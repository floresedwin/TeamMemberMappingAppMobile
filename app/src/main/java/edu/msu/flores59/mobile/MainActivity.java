package edu.msu.flores59.mobile;

import edu.msu.flores59.mobile.identity.AuthAwareActivity;



import android.os.Bundle;

public class MainActivity extends AuthAwareActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}