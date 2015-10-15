package br.com.menuruenf.menuruenf.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import br.com.menuruenf.menuruenf.R;

public class WelcomeActivity extends BaseActivity {

    private final int WAIT_TIME = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_welcome);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent choiceIntent = new Intent(WelcomeActivity.this, MainActivity.class);
                WelcomeActivity.this.startActivity(choiceIntent);
                WelcomeActivity.this.finish();
            }

        }, WAIT_TIME);


    }

}
