package net.cozz.danco.homework1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import static android.view.View.OnClickListener;


public class MyActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        View view1 = findViewById(R.id.view1);
        view1.setOnClickListener(this);
        View view2 = findViewById(R.id.view2);
        view2.setOnClickListener(this);
        View view3 = findViewById(R.id.view3);
        view3.setOnClickListener(this);
        View view4 = findViewById(R.id.view4);
        view4.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        TextView tv = (TextView)findViewById(R.id.textView1);
        tv.setText(v.getTag().toString());  //need to set the android:tag attribute in the activity_my.xml

        switch (v.getId()) {
            case R.id.view1:
                v.setSelected(true);
                tv.setTextColor(getResources().getColor(R.color.red));
                break;
            case R.id.view2:
                v.setSelected(true);
                tv.setTextColor(getResources().getColor(R.color.green));
                break;
            case R.id.view3:
                v.setSelected(true);
                tv.setTextColor(getResources().getColor(R.color.blue));
                break;
            case R.id.view4:
                v.setSelected(true);
                tv.setTextColor(getResources().getColor(R.color.black));
                break;
        }
    }
}
