package com.example.lovelyblue.ascrossappsendsideexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
//This is new branch V201
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//    @Override
//     btnIntentSend

    public void btnIntentSend(View view)
    {
        try {
            Intent intent = new Intent();
            intent.setClassName("com.example.lovelyblue.ascrossappreceivesideexample","com.example" +
                    ".lovelyblue.ascrossappreceivesideexample.Activitys.ReceiveActivity1");
//        intent.setClassName("tw.com.twmp.twwallet", "com.softmobile.mobilewallet.remote" +
//                ".CrossAppLauncherActivity");
            Bundle bundle = new Bundle();
            bundle.putString("name","Kyle Lin");
            bundle.putString("from","Taiwan");
            bundle.putString("to","CN");
//        intent.putExtras(bundle);
            startActivity(intent);
//        startActivityForResult();
        }catch (Exception exp)
        {
            Log.e("exp",exp.getMessage());
        }
    }

    public void btnCallActivity2Pressed(View view)
    {
        try {
            Intent intent = new Intent();
            intent.setClassName("com.example.lovelyblue.ascrossappreceivesideexample", "com.example" +
                    ".lovelyblue.ascrossappreceivesideexample.Activitys.ReceiveActivity2");
            Bundle bundle = new Bundle();
            bundle.putString("name","Kyle Lin");
            bundle.putString("from","Taiwan");
            bundle.putString("to", "CN");
//        intent.putExtras(bundle);
            startActivity(intent);
        }catch (Exception exp)
        {
            Log.e("exp",exp.getMessage());
        }
    }

    public void btnCallActivity3Pressed(View view)
    {
        try {
            Intent intent = new Intent();
            intent.setClassName("com.example.lovelyblue.ascrossappreceivesideexample","com.example" +
                    ".lovelyblue.ascrossappreceivesideexample.Activitys.ReceiveActivity3");
            Bundle bundle = new Bundle();
            bundle.putString("name","Kyle Lin");
            bundle.putString("from","Taiwan");
            bundle.putString("to","CN");
            intent.putExtras(bundle);
            startActivityForResult(intent,1);
        }catch (Exception exp)
        {
            Log.e("exp",exp.getMessage());
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode){
            case RESULT_OK:
                Toast.makeText(MainActivity.this, "Back Ok !", Toast.LENGTH_LONG).show();
                break;
            case RESULT_CANCELED:
                Toast.makeText(MainActivity.this, "Back Cancel !", Toast.LENGTH_LONG).show();
                break;
            case 806449:
                Toast.makeText(MainActivity.this, "Back 806449 ! "+data.getStringExtra("result"),
                        Toast.LENGTH_LONG)
                        .show();
                break;
        }
    }
}
