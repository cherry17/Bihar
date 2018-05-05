package app.com.example.cherry.bihar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Education extends BaseActivity implements View.OnClickListener{
  Button bu1,bu2,bu3,bu4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.activity_education,frameLayout);
        bu1 = (Button) findViewById(R.id.enng_but);
        bu2 = (Button) findViewById(R.id.med_but);
        bu3 = (Button) findViewById(R.id.other_but);
        bu4 = (Button) findViewById(R.id.patna_but);

        bu1.setOnClickListener((View.OnClickListener) this);
        bu2.setOnClickListener((View.OnClickListener) this);
        bu3.setOnClickListener((View.OnClickListener) this);
        bu4.setOnClickListener((View.OnClickListener) this);
    }


        @Override
        public void onClick(View v) {
                switch (v.getId())
                {
                case R.id.patna_but:
                        Uri uri4 = Uri.parse("http://en.wikipedia.org/wiki/List_of_schools_in_Patna");
                        Intent inte4 = new Intent(Intent.ACTION_VIEW, uri4);
                        startActivity(inte4);
                        break;
                case R.id.enng_but:
                         Uri uri1 = Uri.parse("http://dst.bih.nic.in/EngineeringCollegeDetails.aspx");
                         Intent inte1 = new Intent(Intent.ACTION_VIEW, uri1);
                         startActivity(inte1);
                          break;
                case R.id.med_but:
                        Uri uri2 = Uri.parse("http://mbbsadmission.in/bihar.html");
                        Intent inte2 = new Intent(Intent.ACTION_VIEW, uri2);
                        startActivity(inte2);
                        break;
                case R.id.other_but:
                        Uri uri3 = Uri.parse("https://targetstudy.com/colleges/commerce-colleges-in-bihar.html");
                        Intent inte3 = new Intent(Intent.ACTION_VIEW, uri3);
                        startActivity(inte3);
                        break;
                }
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
