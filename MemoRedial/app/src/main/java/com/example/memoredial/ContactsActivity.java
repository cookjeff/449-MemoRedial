package com.example.memoredial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactsActivity extends AppCompatActivity {

    Button button1;
    String mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        Bundle bundle = getIntent().getExtras();
        mode = bundle.getString("MODE");
        button1 = (Button)findViewById(R.id.contactButton1);


    }

    public void goToDialer(String name, String number) {
        Intent intent = new Intent(this, MainDialActivity.class);
        intent.putExtra("MODE",mode);
        intent.putExtra("NAME",name);
        intent.putExtra("NUMBER",number);
        if (mode=="DialContactViewingNumber") {


        }
        startActivity(intent);
    }

    public void contactButton1Click(View v) {
        String name = button1.getText().toString();
        String number = ContactsHelper.getNumber(name);

        goToDialer(name,number);
    }
}
