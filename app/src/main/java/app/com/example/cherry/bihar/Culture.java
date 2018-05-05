package app.com.example.cherry.bihar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Culture extends BaseActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.activity_culture,frameLayout);
        b=(Button)findViewById(R.id.bt_culture);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://en.m.wikipedia.org/wiki/ Bihari_culture");
                Intent inte = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(inte);
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
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hi, I am using Bihar app. It is a very exciting app and it helped me to explore and know Bihar. Download the app today!!!!");
            //startActivity(Intent.createChooser(shareIntent,"Share Using"));
            mshare.setShareIntent(shareIntent);

        }
        return true;
        // getMenuInflater().inflate(R.menu.my, menu);
        //return super.onCreateOptionsMenu(menu);
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

