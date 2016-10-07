package com.hc.studycoordinatelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * CoordinatorLayout、AppbarLayout、CollapsingToolbarLayout 以及Toolbar 等的混合使用
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("This is Title");
        toolbar.setNavigationIcon(R.drawable.back);
        setSupportActionBar(toolbar);
    }
}
