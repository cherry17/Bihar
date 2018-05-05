package app.com.example.cherry.bihar;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class BaseActivity extends ActionBarActivity
        {
            class NavItem {
                String mTitle;
                int mIcon;

                public NavItem(String title, int icon) {
                    mTitle = title;
                    mIcon = icon;
                }
            }

    protected FrameLayout frameLayout;
    protected ListView mDrawerList;
   // protected String[] listArray = { "1. HOME","2. HISTORY", "3. DISTRICTS AND DIVISION", "4. WEATHER", "5. ECONOMY", "6. CULTURE","7. TRANSPORTATION","8. TOURISM","9. EDUCATION" };
    protected static int position;
    private static boolean isLaunch = true;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
  // RelativeLayout mDrawerPane;
    ArrayList<NavItem> mNavItems = new ArrayList<NavItem>();


   // @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation);
        mNavItems.add(new NavItem("Home", R.drawable.bihar_icon));
                mNavItems.add(new NavItem("History",R.drawable.history));
                mNavItems.add(new NavItem("Districts and division",R.drawable.districts));
                mNavItems.add(new NavItem("Weather", R.drawable.weath));
                mNavItems.add(new NavItem("Economy",R.drawable.economy));
                mNavItems.add(new NavItem("Culture",R.drawable.culture));
                mNavItems.add(new NavItem("Transportation", R.drawable.transport));
                mNavItems.add(new NavItem("Tourism",R.drawable.tourism));
                mNavItems.add(new NavItem("Education",R.drawable.education));

                frameLayout = (FrameLayout)findViewById(R.id.main);
                mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
                //mDrawerPane = (RelativeLayout) findViewById(R.id.drawerPane);
                mDrawerList = (ListView) findViewById(R.id.left_drawer);
                DrawerListAdapter adapter = new DrawerListAdapter(this, mNavItems);
                mDrawerList.setAdapter(adapter);


                // set a custom shadow that overlays the main content when the drawer opens
                //mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);

                // set up the drawer's list view with items and click listener


                // mDrawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_list_item, listArray));
                mDrawerList.setOnItemClickListener(new OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {

                        openActivity(position);
            }
        });


        // enable ActionBar app icon to behave as action to toggle nav drawer
       /* getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);*/
        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
        mDrawerLayout.setDrawerListener(actionBarDrawerToggle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));


        // ActionBarDrawerToggle ties together the the proper interactions between the sliding drawer and the action bar app icon
        actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,						/* host Activity */
                mDrawerLayout, 				/* DrawerLayout object */
                R.drawable.ic_drawer,     /* nav drawer image to replace 'Up' caret */
                R.string.drawer_open,       /* "open drawer" description for accessibility */
                R.string.drawer_close )      /* "close drawer" description for accessibility */
        {
            @Override
            public void onDrawerClosed(View drawerView) {
               // getActionBar().setTitle(listArray[position]);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
               // getActionBar().setTitle(getString(R.string.app_name));
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
            }

            @Override
            public void onDrawerStateChanged(int newState) {
                super.onDrawerStateChanged(newState);
            }
        };


        /**
         * As we are calling BaseActivity from manifest file and this base activity is intended just to add navigation drawer in our app.
         * We have to open some activity with layout on launch. So we are checking if this BaseActivity is called first time then we are opening our first activity.
         * */
        //if(isLaunch){
            /**
             *Setting this flag false so that next time it will not open our first activity.
             *We have to use this flag because we are using this BaseActivity as parent activity to our other activity.
             *In this case this base activity will always be call when any child activity will launch.
             */
           // isLaunch = false;
           // openActivity(0);
       // }
    }
            private boolean isNetworkAvailable() {
                ConnectivityManager connectivityManager
                        = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            }

    /**
     * @param position
     *
     * Launching activity when any list item is clicked.
     */
    protected void openActivity(int position) {

        /**
         * We can set title & itemChecked here but as this BaseActivity is parent for other activity,
         * So whenever any activity is going to launch this BaseActivity is also going to be called and
         * it will reset this value because of initialization in onCreate method.
         * So that we are setting this in child activity.
         */
//		mDrawerList.setItemChecked(position, true);
//		setTitle(listArray[position]);
        mDrawerLayout.closeDrawer(mDrawerList);
        BaseActivity.position = position; //Setting currently selected position in this field so that it will be available in our child activities.

        switch (position) {
            case 0:
                startActivity(new Intent(this, MyActivity.class));
                break;
            case 1:
                startActivity(new Intent(this, History.class));
                break;
            case 2:
                startActivity(new Intent(this, Districts.class));
                break;
            case 3:
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
                startActivity(new Intent(this, Weather.class));
                break;
            case 4:
                startActivity(new Intent(this, Economy.class));
                break;
            case 5:
                startActivity(new Intent(this, Culture.class));
                break;
            case 6:
                startActivity(new Intent(this, Transportation.class));
                break;
            case 7:
                startActivity(new Intent(this, Tourism.class));
                break;
            case 8:
                startActivity(new Intent(this, Education.class));
                break;
            default:
                break;
        }
}
/*android.support.v7.widget.ShareActionProvider mshare;
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
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Text to share");
            //startActivity(Intent.createChooser(shareIntent,"Share Using"));
            mshare.setShareIntent(shareIntent);

        }
        return true;
       // getMenuInflater().inflate(R.menu.my, menu);
        //return super.onCreateOptionsMenu(menu);
    }*/




            @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // The action bar home/up action should open or close the drawer.
        // ActionBarDrawerToggle will take care of this.
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

      /* switch (item.getItemId()) {


            case R.id.action_settings:
                return true;

            default:*/
                return super.onOptionsItemSelected(item);
        }



    /* Called whenever we call invalidateOptionsMenu() */
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // If the nav drawer is open, hide action items related to the content view
        boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
        menu.findItem(R.id.menu_item_share).setVisible(!drawerOpen);
        return super.onPrepareOptionsMenu(menu);
    }


    /* We can override onBackPressed method to toggle navigation drawer*/
    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MyActivity.class));

    }
            @Override
            protected void onPostCreate(Bundle savedInstanceState) {
                super.onPostCreate(savedInstanceState);
                // Sync the toggle state after onRestoreInstanceState has occurred.
                actionBarDrawerToggle.syncState();
            }

            @Override
            public void onConfigurationChanged(Configuration newConfig) {
                super.onConfigurationChanged(newConfig);
                actionBarDrawerToggle.onConfigurationChanged(newConfig);
            }
    class DrawerListAdapter extends BaseAdapter {

                Context mContext;
                ArrayList<NavItem> mNavItems;

                public DrawerListAdapter(Context context, ArrayList<NavItem> navItems) {
                    mContext = context;
                    mNavItems = navItems;
                }

                @Override
                public int getCount() {
                    return mNavItems.size();
                }

                @Override
                public Object getItem(int position) {
                    return mNavItems.get(position);
                }

                @Override
                public long getItemId(int position) {
                    return 0;
                }

                @Override
                public View getView(int position, View convertView, ViewGroup parent) {
                    View view;

                    if (convertView == null) {
                        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        view = inflater.inflate(R.layout.drawer_list_item, null);
                    }
                    else {
                        view = convertView;
                    }

                    TextView titleView = (TextView) view.findViewById(R.id.title);
                    ImageView iconView = (ImageView) view.findViewById(R.id.icon);

                    titleView.setText( mNavItems.get(position).mTitle );
                    iconView.setImageResource(mNavItems.get(position).mIcon);

                    return view;
                }
            }


}





