package guess.com.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random ran = new Random();
    int r = ran.nextInt(99) + 1;     /*r是SecretNumber*/
    int max=100;
    int min =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Secret = (TextView)findViewById(R.id.secret);
        TextView Info = (TextView)findViewById(R.id.info);
        Button Send = (Button)findViewById(R.id.send);

//        int count = Integer.parseInt(edNumber.getText().toString());
        String s = String.valueOf(r);
        Secret.setText(s);
    }
    public void compare (View view){
        EditText Number = (EditText)findViewById(R.id.number);
        int n = Integer.parseInt(Number.getText().toString());
        if(n==r){
            new AlertDialog.Builder(MainActivity.this)
                    .setMessage("猜對了")
                    .show();
        }
        while (n > r &&n > min &&n < max){
            max = n;
            new AlertDialog.Builder(MainActivity.this)
                    .setMessage(min+"to"+max)
                    .setPositiveButton("OK",null)
                    .show();
            break;
        }
        while(n < r && n > min && n < max){
            min = n;
            new AlertDialog.Builder(MainActivity.this)
                    .setMessage(min+"to"+max)
                    .setPositiveButton("OK",null)
                    .show();
            break;
        }

    }

}
