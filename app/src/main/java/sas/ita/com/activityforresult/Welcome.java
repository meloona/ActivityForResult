package sas.ita.com.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Welcome extends AppCompatActivity {
Intent intent;
String namem ,location, qul, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        intent=getIntent();
        namem=intent.getStringExtra("key1");
        location=intent.getStringExtra("key2");
        qul=intent.getStringExtra("key3");
        result="My Name is "+ namem+ "I am from"+ location+ "And my qulification is" +qul;
        intent= new Intent(this, MainActivity.class);
        intent.putExtra("result", result);
        setResult(RESULT_OK, intent);
        finish();
    }
}
