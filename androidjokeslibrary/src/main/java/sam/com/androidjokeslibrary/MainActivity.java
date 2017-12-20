package sam.com.androidjokeslibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView funny_text_view;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_joe);

        funny_text_view =(TextView) findViewById(R.id.funny);

        if(getIntent().hasExtra("Joke")) {
            s = getIntent().getStringExtra("Joke");
            funny_text_view.setText(s);
        }


    }
}
