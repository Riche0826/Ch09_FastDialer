package flag.com.tw.ch09_fastdialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v){
        //Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:800"));
        Intent it = new Intent();
        it.setAction(ContactsContract.Intents.Insert.ACTION);
        it.setType(ContactsContract.RawContacts.CONTENT_TYPE);
        it.putExtra(ContactsContract.Intents.Insert.NAME, "克服專線");
        it.putExtra(ContactsContract.Intents.Insert.PHONE, "800");

        startActivity(it);
    }
}
