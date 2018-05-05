package app.com.example.cherry.bihar;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class MyActivity extends Activity implements View.OnClickListener {
    ImageView t1,t2,t3,t4,t5,t6,t7,t8;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        initilize();
    }
    private void initilize()
    {
        t1=(ImageView)findViewById(R.id.imageView1);
        t2=(ImageView)findViewById(R.id.imageView2);
        t3=(ImageView)findViewById(R.id.imageView3);
        t4=(ImageView)findViewById(R.id.imageView4);
        t5=(ImageView)findViewById(R.id.imageView5);
        t6=(ImageView)findViewById(R.id.imageView6);
        t7=(ImageView)findViewById(R.id.imageView7);
        t8=(ImageView)findViewById(R.id.imageView8);
        b1=(Button)findViewById(R.id.search_button);

        t1.setOnClickListener((View.OnClickListener) this);
        t2.setOnClickListener((View.OnClickListener) this);
        t3.setOnClickListener((View.OnClickListener) this);
        t4.setOnClickListener((View.OnClickListener) this);
        t5.setOnClickListener((View.OnClickListener) this);
        t6.setOnClickListener((View.OnClickListener) this);
        t7.setOnClickListener((View.OnClickListener) this);
        t8.setOnClickListener((View.OnClickListener) this);
        b1.setOnClickListener((View.OnClickListener) this);
    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView1:
                Intent intent1 = new Intent(this, History.class);
                startActivity(intent1);
                break;
            case R.id.imageView2:
                Intent intent2 = new Intent(this, Districts.class);
                startActivity(intent2);
                break;
            case R.id.imageView3:
                Intent intent3 = new Intent(this, Weather.class);
                if(!isNetworkAvailable()){
                    //Toast.makeText(this, "No Internet Connection", Toast.LENGTH_SHORT).show();
                    new AlertDialog.Builder(this)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .setTitle("Closing the App.")
                            .setMessage("No Internet Connection,check your settings.")
                            .setPositiveButton("Close", new DialogInterface.OnClickListener()
                            {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    moveTaskToBack(true);
                                }

                            })
                            .show();

                }

                else
                startActivity(intent3);
                break;
            case R.id.imageView4:
                Intent intent4 = new Intent(this, Economy.class);
                startActivity(intent4);
                break;
            case R.id.imageView5:
                Intent intent5 = new Intent(this,Culture.class);
                startActivity(intent5);
                break;
            case R.id.imageView6:
                Intent intent6 = new Intent(this, Transportation.class);
                startActivity(intent6);
                break;
            case R.id.imageView7:
                Intent intent7 = new Intent(this,Tourism.class);
                startActivity(intent7);
                break;
            case R.id.imageView8:
                Intent intent8 = new Intent(this,Education.class);
                startActivity(intent8);
                break;
            case R.id.search_button:
                openPreferredLocationInMap();
         }
    }
    private void openPreferredLocationInMap() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String location = sharedPreferences.getString(getString(R.string.pref_key), getString(R.string.pref_default_value));

        Uri geolocation = Uri.parse("geo:0,0?").buildUpon()
                .appendQueryParameter("q", location)
                .build();

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geolocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("Map Feature", "Could not call " + location + ", nothing!");
        }
    }




    /**
     * A placeholder fragment containing a simple view.
     */   public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_my, container, false);
            return rootView;
        }
    }
    @Override
    public void onBackPressed()
    {
        moveTaskToBack(true);
    }
}
