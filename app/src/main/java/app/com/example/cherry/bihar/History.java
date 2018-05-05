package app.com.example.cherry.bihar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TabHost;


public class History extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.activity_history,frameLayout);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec spec1 = tabHost.newTabSpec("ABOUT");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("ABOUT");

        TabHost.TabSpec spec2 = tabHost.newTabSpec("HISTORY");
        spec2.setIndicator("HISTORY");
        spec2.setContent(R.id.tab2);

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);

        Display display = getWindowManager().getDefaultDisplay();
        int width = display.getWidth();

        tabHost.getTabWidget().getChildAt(0).setLayoutParams(new
                LinearLayout.LayoutParams((width/2)-2,100));
        tabHost.getTabWidget().getChildAt(1).setLayoutParams(new
                LinearLayout.LayoutParams((width/2)-2,100));


                /*Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Hey check out my app at: https://play.google.com/store/apps/details?id=com.google.android.apps.plus");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);*/


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
            shareIntent.putExtra(Intent.EXTRA_TEXT,"Hi, I am using Bihar app. It is a very exciting app and it helped me to explore and know Bihar. Download the app today!!!!!");
            //startActivity(Intent.createChooser(shareIntent,"Share Using"));
            mshare.setShareIntent(shareIntent);

        }
        return true;
        // getMenuInflater().inflate(R.menu.my, menu);
        //return super.onCreateOptionsMenu(menu);
    }
    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;

        return super.onOptionsItemSelected(item);
    }*/


}
