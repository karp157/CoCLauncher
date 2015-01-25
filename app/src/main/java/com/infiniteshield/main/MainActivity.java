package com.infiniteshield.main;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    private Button startShield;
    private TextView shieldStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startShield = (Button) findViewById(R.id.start_shield);
        shieldStatus = (TextView) findViewById(R.id.shield_status);

        startShield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean shieldActive = Shield.toggle(MainActivity.this);
                updateUI(shieldActive);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        updateUI(Shield.isActive(this));
    }

    private void updateUI(boolean shieldActive) {
        if (shieldActive) {
            startShield.setBackgroundResource(R.drawable.on);
            shieldStatus.setText(R.string.shield_active);
        } else {
            startShield.setBackgroundResource(R.drawable.off);
            shieldStatus.setText(R.string.shield_not_active);
        }
    }

}