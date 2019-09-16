package freechat.yassinedeveloper.com.freechat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by root on 12/30/17.
 */

public class LoginActivity extends AppCompatActivity implements  View.OnClickListener {
    Button Loginbutton ;
    TextView ForgotPassword;
    ImageView Backbutton;
    EditText EmailText, PasswordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       // ActionBar actionBar = getSupportActionBar();
       // actionBar.hide();

        Loginbutton = (Button) findViewById(R.id.loginbutton);
        Backbutton = (ImageView) findViewById(R.id.backbutton);
        ForgotPassword = (TextView) findViewById(R.id.forgotpassword);

        EmailText = (EditText) findViewById(R.id.editTextEmail);
        PasswordText = (EditText) findViewById(R.id.editTextPassword);


        Loginbutton.setOnClickListener(this);
        Backbutton.setOnClickListener(this);
        ForgotPassword.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.loginbutton:
                String Email = EmailText.getText().toString();
                String Password = PasswordText.getText().toString();

                if (TextUtils.isEmpty(Email)) {
                    Toast.makeText(this, "Please enter your Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(Password)) {
                    Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show();
                    return;
                }
                startActivity(new Intent(LoginActivity.this, MainActivityold.class));
                finish();
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
                break;
            case R.id.backbutton:
                startActivity(new Intent(LoginActivity.this, FrontOfPage.class));
                finish();
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
                break;
            case R.id.forgotpassword:
                String email = EmailText.getText().toString();
                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(this, "Please enter your Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(this," Go to Your inbox email to find a new password ",Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        startActivity(new Intent(LoginActivity.this, FrontOfPage.class));
        finish();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }
}
