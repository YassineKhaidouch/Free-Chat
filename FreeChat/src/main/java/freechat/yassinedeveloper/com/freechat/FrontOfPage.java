package freechat.yassinedeveloper.com.freechat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FrontOfPage extends AppCompatActivity implements View.OnClickListener {


    Button Loginbutton, Registerbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontofpage);

        // ActionBar actionBar = getSupportActionBar();
        //  actionBar.hide();

        Loginbutton = (Button) findViewById(R.id.loginbutton);
        Registerbutton = (Button) findViewById(R.id.registerbutton);

        Loginbutton.setOnClickListener(this);
        Registerbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.loginbutton:
                startActivity(new Intent(FrontOfPage.this, LoginActivity.class));
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
                finish();
                break;
            case R.id.registerbutton:
                startActivity(new Intent(FrontOfPage.this, RegisterActivity.class));
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
                finish();
                break;
        }

    }

}