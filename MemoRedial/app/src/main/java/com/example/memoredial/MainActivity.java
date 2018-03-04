package com.example.memoredial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static ContactsHelper contactsHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactsHelper = new ContactsHelper();
        contactsHelper.start();
    }

    public void dialContactViewingNumber(View v) {
        Intent intent = new Intent(this, ContactsActivity.class);
        intent.putExtra("MODE","DialContactViewingNumber");
        startActivity(intent);
    }

    public void dialContactFromMemory(View v) {
        Intent intent = new Intent(this, ContactsActivity.class);
        intent.putExtra("MODE","DialContactFromMemory");
        startActivity(intent);
    }

    public void quizOnAllContacts(View v) {
        Intent intent = new Intent(this, MultiQuizDialerActivity.class);
        startActivity(intent);
    }
}
