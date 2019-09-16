package freechat.yassinedeveloper.com.freechat;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class AddFriend extends AppCompatActivity {

    ImageView gobackBack,Addfriend;
    EditText EText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.addfriend_bar);
        View view =getSupportActionBar().getCustomView();

        gobackBack = (ImageView) findViewById(R.id.back);
        Addfriend = (ImageView) findViewById(R.id.add_friend);

        EText = (EditText) findViewById(R.id.add_friend_text);

        gobackBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Addfriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(EText.getText().toString())){
                    Toast.makeText(AddFriend.this,"DiscordTag#00000 or email is required",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
