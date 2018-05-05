package app.com.example.cherry.bihar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by cherry on 22-03-2015.
 */
public class Background extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wecome);
        final Context context = this;
        Thread timer=new Thread() {
            public void run() {
                try

                {
                    sleep(5000);

                } catch (InterruptedException e) {


                    Log.e("vfD","catch");
                    //Toast.makeText(this, "catch", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();

                } finally

                    {
                    Intent openStartingPoint = new Intent(context,MyActivity.class);
                    startActivity(openStartingPoint);
                }
            }
        };

        timer.start();
    }



}
