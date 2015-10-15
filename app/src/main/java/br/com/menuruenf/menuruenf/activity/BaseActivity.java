package br.com.menuruenf.menuruenf.activity;


import android.support.v7.widget.Toolbar;

import br.com.menuruenf.menuruenf.R;

/**
 * Created by Rodolfo on 31/08/2015.
 */
public class BaseActivity extends livroandroid.lib.activity.BaseActivity {
    protected void setUpToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if(toolbar != null){
            setSupportActionBar(toolbar);
        }
    }

}
