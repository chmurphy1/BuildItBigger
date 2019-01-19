package murphy.christopher.androidjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView jokeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        jokeView = (TextView)findViewById(R.id.jokeView);

        Intent intent = getIntent();

        jokeView.setText(intent.getStringExtra("joke"));
    }
}
