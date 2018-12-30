package dragon.bakuman.iu.dfpoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView mGreetingTextView;
    private Button mPlayButton;
    private EditText mNameInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGreetingTextView = findViewById(R.id.activity_main_greeting_txt);
        mPlayButton = findViewById(R.id.activity_main_play_btn);
        mNameInput = findViewById(R.id.activity_main_name_input);

        //Disabled until user types at least a letter in the input
        mPlayButton.setEnabled(false);

        //enable using code, we need to add TextWatcher!!
        mNameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                //this code makes sure the mPlayButton is disabled again when user empties the mNameInput
                mPlayButton.setEnabled(s.length() > 0);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 
            }
        });

    }
}
