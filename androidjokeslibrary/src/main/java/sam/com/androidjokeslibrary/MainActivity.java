package sam.com.androidjokeslibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import sam.com.javajokeslib.JavaJokesList;

public class MainActivity extends AppCompatActivity {
    TextView funny_text_view;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        funny_text_view =(TextView) findViewById(R.id.funny_text_view);

        if(getIntent().hasExtra("Joke")) {
            s = getIntent().getStringExtra("Joke");
            funny_text_view.setText(s);
        }


    }
}
