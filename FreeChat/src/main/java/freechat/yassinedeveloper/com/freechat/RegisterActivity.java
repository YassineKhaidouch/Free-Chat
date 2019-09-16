package freechat.yassinedeveloper.com.freechat;

import android.content.Intent;
import android.net.Uri;
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

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
    Button Registerbtn;
    ImageView backbtn;
    TextView PrivacyTerms;
    EditText EmailText, PasswordText, UsernameText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


      Registerbtn = (Button) findViewById(R.id.registerbtn);
      backbtn = (ImageView) findViewById(R.id.backbtn);
      PrivacyTerms = (TextView) findViewById(R.id.privacyterms);

        EmailText = (EditText) findViewById(R.id.editTextEmail);
        PasswordText = (EditText) findViewById(R.id.editTextPassword);
        UsernameText = (EditText) findViewById(R.id.editTextUsername);

        Registerbtn.setOnClickListener(this);
        backbtn.setOnClickListener(this);
        PrivacyTerms.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.registerbtn:
                String email = EmailText.getText().toString();
                String password = PasswordText.getText().toString();
                String username = UsernameText.getText().toString();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(this, "Please enter your Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(this, "Please enter your Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(username)) {
                    Toast.makeText(this, "Please enter your Username", Toast.LENGTH_SHORT).show();
                    return;
                }
                startActivity(new Intent(RegisterActivity.this, MainActivityold.class));
                finish();
                break;
            case R.id.backbtn:
                startActivity(new Intent(RegisterActivity.this, FrontOfPage.class));
                finish();
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
                break;
           case R.id.privacyterms:
               Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://google.com"));
               startActivity(i);
                break;
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(RegisterActivity.this, FrontOfPage.class));
        finish();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);

    }
}
