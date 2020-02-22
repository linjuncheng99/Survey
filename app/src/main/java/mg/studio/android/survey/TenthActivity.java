package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TenthActivity extends AppCompatActivity {
    Button next9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_nine);

        //定位按钮
        next9=(Button) findViewById(R.id.next9);
        //按钮添加监视器
        next9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TenthActivity.this,ElventhActivity.class);
                startActivity(intent);
            }
        });
    }
}
