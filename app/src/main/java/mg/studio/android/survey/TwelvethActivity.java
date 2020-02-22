package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwelvethActivity extends AppCompatActivity {
    Button next11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eleven);

        //定位按钮
        next11=(Button) findViewById(R.id.next11);
        //按钮添加监视器
        next11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TwelvethActivity.this,FinishActivity.class);
                startActivity(intent);
            }
        });
    }
}
