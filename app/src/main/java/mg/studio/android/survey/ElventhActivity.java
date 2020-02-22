package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElventhActivity extends AppCompatActivity {
    Button next10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_ten);

        //定位按钮
        next10=(Button) findViewById(R.id.next10);
        //按钮添加监视器
        next10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ElventhActivity.this,TwelvethActivity.class);
                startActivity(intent);
            }
        });
    }
}
