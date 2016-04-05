package checkboxpratice.example.com.checkboxpratice;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private CheckBox chkBasketBall;
    private CheckBox chkFootBall;
    private CheckBox chkBaseBall;
    private TextView totle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkBasketBall = (CheckBox) findViewById(R.id.chkbasketball);
        chkFootBall = (CheckBox) findViewById(R.id.chkfootball);
        chkBaseBall = (CheckBox) findViewById(R.id.chkbaseball);
        totle = (TextView) findViewById(R.id.totlecheck);
        chkBasketBall.setOnCheckedChangeListener(chklistener);
        chkFootBall.setOnCheckedChangeListener(chklistener);
        chkBaseBall.setOnCheckedChangeListener(chklistener);

    }

    private CheckBox.OnCheckedChangeListener chklistener = new CheckBox.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(CompoundButton buttonView,
                                     boolean isChecked) {
            // TODO Auto-generated method stub
            int n = 0;
            String s1, s2, s3;

            if (chkBasketBall.isChecked()) {
                n++;
                s1 = chkBasketBall.getText().toString();
            } else {
                s1 = "";
            }
            if (chkFootBall.isChecked()) {
                n++;
                s2 = chkFootBall.getText().toString();
            } else {
                s2 = "";
            }
            if (chkBaseBall.isChecked()) {
                n++;
                s3 = chkBaseBall.getText().toString();
            } else {
                s3 = "";
            }
            totle.setText("最喜歡的球類有：" + s1 + " " + s2 + " " + s3 + "，總共 " + n + " 項運動");
            Toast.makeText(getApplicationContext(), "選了：" + s1 + " " + s2 + " " + s3 + "，總共 " + n + " 項運動", Toast.LENGTH_SHORT).show();
        }

    };

}


