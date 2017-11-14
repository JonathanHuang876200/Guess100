package guess.com.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Secret = (TextView)findViewById(R.id.secret);
        TextView Info = (TextView)findViewById(R.id.info);
        EditText Number = (EditText)findViewById(R.id.number);
        Button Send = (Button)findViewById(R.id.send);

    }


}
