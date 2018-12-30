package dragon.bakuman.iu.dfpoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private TextView mGameQuestionTextView;
    private Button mGameAnswer1Btn, mGameAnswer2Btn, mGameAnswer3Btn, mGameAnswer4Btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mGameQuestionTextView = findViewById(R.id.activity_game_question_text);
        mGameAnswer1Btn = findViewById(R.id.activity_game_answer1_btn);
        mGameAnswer2Btn = findViewById(R.id.activity_game_answer2_btn);
        mGameAnswer3Btn = findViewById(R.id.activity_game_answer3_btn);
        mGameAnswer4Btn = findViewById(R.id.activity_game_answer4_btn);
    }
}
