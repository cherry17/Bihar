package app.com.example.cherry.bihar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.view.MenuItemCompat;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Districts extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.activity_districts, frameLayout);
        Button rtn = (Button)findViewById(R.id.but_dis);
        final EditText edit_text   = (EditText)findViewById(R.id.edit_dis);

        rtn .setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        String s = edit_text.getText().toString();
                        openPreferredLocationInMap(s);

                    }
                });
    }


    android.support.v7.widget.ShareActionProvider mshare;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.history,menu);
        MenuItem shareItem=menu.findItem(R.id.menu_item_share);
        if (shareItem!=null) {
            mshare = (android.support.v7.widget.ShareActionProvider) MenuItemCompat.getActionProvider(shareItem);
        }
        if (mshare!=null) {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hi, I am using Bihar app. It is a very exciting app and it helped me to explore and know Bihar. Download the app today!!!!!");
            //startActivity(Intent.createChooser(shareIntent,"Share Using"));
            mshare.setShareIntent(shareIntent);

        }
        return true;
        // getMenuInflater().inflate(R.menu.my, menu);
        //return super.onCreateOptionsMenu(menu);
    }
    private void openPreferredLocationInMap(String s) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String location = sharedPreferences.getString(getString(R.string.pref_key), s);

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

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}
