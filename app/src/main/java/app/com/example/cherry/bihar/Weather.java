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


public class Weather extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.activity_weather,frameLayout);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ForecastFragment())
                    .commit();
        }
    }

    android.support.v7.widget.ShareActionProvider mshare;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.weather,menu);
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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            startActivity(new Intent(this,SettingsActivity.class));
            return true;
        }
        if (id == R.id.action_map) {
            openPreferredLocationInMap();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void openPreferredLocationInMap() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String location = sharedPreferences.getString(getString(R.string.pref_key), getString(R.string.pref_default));

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
    protected void onPostExecute(String result)
    {
        if(result==null)
        {
            Log.w("one","result is null");
            return;
        }
    }
}
