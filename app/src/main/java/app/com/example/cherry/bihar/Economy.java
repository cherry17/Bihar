package app.com.example.cherry.bihar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TabHost;


public class Economy extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.activity_economy,frameLayout);
        TabHost tabHost = (TabHost) findViewById(R.id.tabHost2);
        tabHost.setup();

        TabHost.TabSpec spec1 = tabHost.newTabSpec("ECONOMY");
        spec1.setContent(R.id.stab1);
        spec1.setIndicator("Economy");

        TabHost.TabSpec spec2 = tabHost.newTabSpec("AGRICULTURE");
        spec2.setIndicator("Agriculture");
        spec2.setContent(R.id.stab2);

        TabHost.TabSpec spec3 = tabHost.newTabSpec("INDUSTRY");
        spec3.setIndicator("Industry");
        spec3.setContent(R.id.stab3);
        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);

        Display display = getWindowManager().getDefaultDisplay();
        int width = display.getWidth();

        tabHost.getTabWidget().getChildAt(0).setLayoutParams(new
                LinearLayout.LayoutParams((width/4+width/16),100));
        tabHost.getTabWidget().getChildAt(1).setLayoutParams(new
                LinearLayout.LayoutParams((width/2-width/8),100));

        tabHost.getTabWidget().getChildAt(2).setLayoutParams(new
                LinearLayout.LayoutParams((width/4+width/16),100));
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
        }
        return super.onOptionsItemSelected(item);
    }*/
}
