package sas.ita.com.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private final int Request_code=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(View view) {
        EditText text1=(EditText)findViewById(R.id.name);
        EditText text2=(EditText)findViewById(R.id.location);
        EditText text3=(EditText)findViewById(R.id.qulaification);
         String a=text1.getText().toString();
        String b=text2.getText().toString();
        String c=text3.getText().toString();
        Intent i= new Intent(this, Welcome.class);
        i.putExtra("key1",a);
        i.putExtra("key2",b);
        i.putExtra("key3",c);
        startActivityForResult(i, Request_code);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode== Request_code && resultCode== RESULT_OK){
            String str=data.getStringExtra("result");
            TextView textView=findViewById(R.id.display);
            textView.setText(str);

        }
        else
        {
            Toast.makeText(this, "WRONG RESULT", Toast.LENGTH_SHORT).show();
        }
    }

}
