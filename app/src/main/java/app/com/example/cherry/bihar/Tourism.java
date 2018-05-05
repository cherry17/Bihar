package app.com.example.cherry.bihar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Tourism extends BaseActivity implements View.OnClickListener {
    TextView v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.activity_tourism,frameLayout);
    initialise();
    }
    private void initialise()
    {
        v1=(TextView)findViewById(R.id.t1);
        v2=(TextView)findViewById(R.id.t2);
        v3=(TextView)findViewById(R.id.t3);
        v4=(TextView)findViewById(R.id.t4);
        v5=(TextView)findViewById(R.id.t5);
        v6=(TextView)findViewById(R.id.t6);
        v7=(TextView)findViewById(R.id.t7);
        v8=(TextView)findViewById(R.id.t8);
        v9=(TextView)findViewById(R.id.t9);
        v10=(TextView)findViewById(R.id.t10);
        v11=(TextView)findViewById(R.id.t11);
        v12=(TextView)findViewById(R.id.t12);
        v13=(TextView)findViewById(R.id.t13);
        v14=(TextView)findViewById(R.id.t14);



        v1.setOnClickListener((View.OnClickListener) this);
        v2.setOnClickListener((View.OnClickListener) this);
        v3.setOnClickListener((View.OnClickListener) this);
        v4.setOnClickListener((View.OnClickListener) this);
        v5.setOnClickListener((View.OnClickListener) this);
        v6.setOnClickListener((View.OnClickListener) this);
        v7.setOnClickListener((View.OnClickListener) this);
        v8.setOnClickListener((View.OnClickListener) this);
        v9.setOnClickListener((View.OnClickListener) this);
        v10.setOnClickListener((View.OnClickListener) this);
        v11.setOnClickListener((View.OnClickListener) this);
        v12.setOnClickListener((View.OnClickListener) this);
        v13.setOnClickListener((View.OnClickListener) this);
        v14.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.t1:
                Uri ur1 = Uri.parse("https://www.google.co.in/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=mahabodhi+temple&stick=H4sIAAAAAAAAAGOovnz8BQMDw0oOZiFO_Vx9AyNLg6IkJTDTML2yskzLIDvZSj8nPzmxJDM_Tz8xJTczL7O4pAjILUuNT8ksyywGilsllgCFkkFKih8xxnALvPxxT1gqeNKak9cYfblINkJIkovNNa8ks6RSiJ-LVwrhMA0GngmV6S84T5r-VsmfPE_75QYrXd26cADeEdqkxgAAAA");
                Intent int1 = new Intent(Intent.ACTION_VIEW, ur1);
                startActivity(int1);
                break;
            case R.id.t2:
                Uri ur2 = Uri.parse("https://www.google.co.in/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=patna+museum&stick=H4sIAAAAAAAAAGOovnz8BQMDw0oOZiFO_Vx9AyNLg6IkJTDTPCM7zVjLIDvZSj8nPzmxJDM_Tz8xJTczL7O4pAjILUuNT8ksyywGilsllgCFkkFKih8xxnALvPxxT1gqeNKak9cYfblINkJIkovNNa8ks6RSiJ-LVwrhMA0Gnsd_j7xconay3nWnLvPjyxqholEzygB-2AO3xgAAAA\n");
                Intent int2 = new Intent(Intent.ACTION_VIEW, ur2);
                startActivity(int2);
                break;
            case R.id.t3:
                Uri ur3 = Uri.parse("https://www.google.co.in/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=bodhi+tree&stick=H4sIAAAAAAAAAGOovnz8BQMDw0oOZiFO_Vx9AyNLg6IkJTDTMMOwzELLIDvZSj8nPzmxJDM_Tz8xJTczL7O4pAjILUuNT8ksyywGilsllgCFkkFKih8xxnALvPxxT1gqeNKak9cYfblINkJIkovNNa8ks6RSiJ-LVwrhMA0GntI5ljdXZl2Mn3E21ezGLGfb2WzHHwIA9Ymzl8YAAAA");
                Intent int3 = new Intent(Intent.ACTION_VIEW, ur3);
                startActivity(int3);
                break;
            case R.id.t4:
                Uri ur4 = Uri.parse("https://www.google.co.in/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=golghar&stick=H4sIAAAAAAAAAGOovnz8BQMDw0oOZiFO_Vx9AyNLg6IkJTDTNDujxELLIDvZSj8nPzmxJDM_Tz8xJTczL7O4pAjILUuNT8ksyywGilsllgCFkkFKih8xxnALvPxxT1gqeNKak9cYfblINkJIkovNNa8ks6RSiJ-LVwrhMA0GHs9fR9lniexfryq19PXkW0f5BV78vgsAlJ1lH8YAAAA");
                Intent int4 = new Intent(Intent.ACTION_VIEW, ur4);
                startActivity(int4);
                break;
            case R.id.t5:
                Uri ur5 = Uri.parse("https://www.google.co.in/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=takht+sri+patna+sahib&stick=H4sIAAAAAAAAAGOovnz8BQMDw0oOZiFO_Vx9AyNLg6IkJTDTIr4opUTLIDvZSj8nPzmxJDM_Tz8xJTczL7O4pAjILUuNT8ksyywGilsllgCFkkFKih8xxnALvPxxT1gqeNKak9cYfblINkJIkovNNa8ks6RSiJ-LVwrhMA0GHt9l8Rxzd_XOzHwanTXRdW6I2yPpfAABbCpIxgAAAA");
                Intent int5 = new Intent(Intent.ACTION_VIEW, ur5);
                startActivity(int5);
                break;
            case R.id.t6:
                Uri ur6 = Uri.parse("https://www.google.co.in/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=sanjay+gandhi+jaivik+udyan+patna&stick=H4sIAAAAAAAAAGOovnz8BQMDwyoOZiFO_Vx9AyNLg6IkJS4Q0yQn3aIkR8sgO9lKPyc_ObEkMz9PPzElNzMvs7ikCMgtS41PySzLLAaKWyWWAIWSQUqKHzHGcAu8_HFPWCp40pqT1xh9uUg2QkiSi801rySzpFKIn4tXCuEyDQaeO4Etm_pKX9lLhXbYzE5-XdnqFTwbAIqWnvbHAAAA");
                Intent int6 = new Intent(Intent.ACTION_VIEW, ur6);
                startActivity(int6);
                break;
            case R.id.t7:
                Uri ur7 = Uri.parse("https://www.google.co.in/search?q=tourism+in+bihar&oq=t&aqs=chrome.2.69i59j69i57j69i59.2896j0j9&sourceid=chrome&es_sm=122&ie=UTF-8#q=agam+kuan&stick=H4sIAAAAAAAAAGOovnz8BQMDw0oOZiFO_Vx9AyNLg6IkJTDTPCMrO17LIDvZSj8nPzmxJDM_Tz8xJTczL7O4pAjILUuNT8ksyywGilsllgCFkkFKih8xxnALvPxxT1gqeNKak9cYfblINkJIkovNNa8ks6RSiJ-LVwrhMA0GHv2C3JRVC9btvq6Uenz2pe1tfy5ejAQA-Td-9MYAAAA\n");
                Intent int7 = new Intent(Intent.ACTION_VIEW, ur7);
                startActivity(int7);
                break;
            case R.id.t8:
                Uri ur8 = Uri.parse("https://www.google.co.in/search?sa=X&es_sm=122&biw=1366&bih=623&noj=1&q=mahavir+mandir+patna&stick=H4sIAAAAAAAAAGOovnz8BQMDwyoOZiFO_Vx9AyNLg6IkJS4Q0yQnrcTIWMsgO9lKPyc_ObEkMz9PPzElNzMvs7ikCMgtS41PySzLLAaKWyWWAIWSQUqKHzHGcAu8_HFPWCp40pqT1xh9uUg2QkiSi801rySzpFKIn4tXCuEyDQae-QUH3JdLrv3ypPnsgZ9KlbYBJn7MAL-CwOzHAAAA&npsic=-476&ei=TZGCVZSdN4TM8gW_mYAg&ved=0CDMQ-BY&lei=TZGCVZSdN4TM8gW_mYAg");
                Intent int8 = new Intent(Intent.ACTION_VIEW, ur8);
                startActivity(int8);
                break;
            case R.id.t9:
                Uri ur9 = Uri.parse("https://www.google.co.in/search?q=tourism+in+bihar&oq=t&aqs=chrome.2.69i59j69i57j69i59.2896j0j9&sourceid=chrome&es_sm=122&ie=UTF-8#q=patan+devi&stick=H4sIAAAAAAAAAGOovnz8BQMDwyoOZiFO_Vx9AyNLg6IkJS4QMz0t3TwtT8sgO9lKPyc_ObEkMz9PPzElNzMvs7ikCMgtS41PySzLLAaKWyWWAIWSQUqKHzHGcAu8_HFPWCp40pqT1xh9uUg2QkiSi801rySzpFKIn4tXCuEyDQaepaVr2vQl2MOMEvuuGzSlPX55XWIDAI36AhDHAAAA");
                Intent int9 = new Intent(Intent.ACTION_VIEW, ur9);
                startActivity(int9);
                break;
            case R.id.t10:
                Uri ur10 = Uri.parse("https://www.google.co.in/search?q=tourism+in+bihar&oq=t&aqs=chrome.2.69i59j69i57j69i59.2896j0j9&sourceid=chrome&es_sm=122&ie=UTF-8#q=vishnupad+mandir+gaya&stick=H4sIAAAAAAAAAGOovnz8BQMDwyoOZiFO_Vx9AyNLg6IkJS4Q06SqwsLIUssgO9lKPyc_ObEkMz9PPzElNzMvs7ikCMgtS41PySzLLAaKWyWWAIWSQUqKHzHGcAu8_HFPWCp40pqT1xh9uUg2QkiSi801rySzpFKIn4tXCuEyDQaeravn9X6e41VxvDt5w4rAA6-PLDTiAwAUIBBnxwAAAA\n" +
                        "\n");
                Intent int10 = new Intent(Intent.ACTION_VIEW, ur10);
                startActivity(int10);
                break;
            case R.id.t11:
                Uri ur11 = Uri.parse("https://www.google.co.in/search?q=tourism+in+bihar&oq=to&aqs=chrome.1.69i57j69i59j69i65l3.2659j0j9&sourceid=chrome&es_sm=122&ie=UTF-8#q=funtasia+water+park+patna&stick=H4sIAAAAAAAAAGOovnz8BQMDwyoOZiFO_Vx9AyNLg6IkJS4Qs8KwyqzYRMsgO9lKPyc_ObEkMz9PPzElNzMvs7ikCMgtS41PySzLLAaKWyWWAIWSQUqKHzHGcAu8_HFPWCp40pqT1xh9uUg2QkiSi801rySzpFKIn4tXCuEyDQaeaI3ri3W-2WR-CS202B974NvptdUNAAp-c3HHAAAA");
                Intent int11 = new Intent(Intent.ACTION_VIEW, ur11);
                startActivity(int11);
                break;
            case R.id.t12:
                Uri ur12 = Uri.parse("https://www.google.co.in/search?sa=X&es_sm=122&biw=1366&bih=623&noj=1&q=patna+planetarium&stick=H4sIAAAAAAAAAGOovnz8BQMDwyoOZiFO_Vx9AyNLg6IkJS4Q0yQn3aCkSssgO9lKPyc_ObEkMz9PPzElNzMvs7ikCMgtS41PySzLLAaKWyWWAIWSQUqKHzHGcAu8_HFPWCp40pqT1xh9uUg2QkiSi801rySzpFKIn4tXCuEyDQaevceeRfFEegl_sX5fGbldPWzj1yJuADkPIwnHAAAA&npsic=-476&ei=AJCCVdX-BcSA8gWwioHYDw&ved=0CD8Q-BY&lei=AJCCVdX-BcSA8gWwioHYDw");
                Intent int12 = new Intent(Intent.ACTION_VIEW, ur12);
                startActivity(int12);
                break;
            case R.id.t13:
                Uri ur13 = Uri.parse("https://www.google.co.in/search?es_sm=122&q=gautam+buddha+wildlife+sanctuary&stick=H4sIAAAAAAAAAGOovnz8BQMDw2oOZiFO_Vx9AyNLg6IkJW4Q09DIoMIgN0vLIDvZSj8nPzmxJDM_Tz8xJTczL7O4pAjILUuNT8ksyywGilsllgCFkkFKih8xxnALvPxxT1gqeNKak9cYfblINkJIkovNNa8ks6RSiJ-LVwrhNA0Gnh6th6s-x-ltZE1vmOmYb8X1mf_fDAB-MIqLyAAAAA&npsic=-476&sa=X&ved=0CEEQ-BY&lei=WI2CVfzJHYatmAXlrJHAAw&bav=on.2,or.&bvm=bv.96041959,d.dGc&biw=1366&bih=623&ech=1&psi=DIqCVczSNYbi8gXIk4PwDw.1434618389723.13&ei=WI2CVfzJHYatmAXlrJHAAw&emsg=NCSR&noj=1");
                Intent int13 = new Intent(Intent.ACTION_VIEW, ur13);
                startActivity(int13);
                break;
            case R.id.t14:
                Uri ur14 = Uri.parse("https://www.google.co.in/search?q=tourism+in+bihar&oq=to&aqs=chrome.1.69i57j69i59j69i65l3.2659j0j9&sourceid=chrome&es_sm=122&ie=UTF-8#q=somapura+mahavihara&stick=H4sIAAAAAAAAAGOovnz8BQMDwyoOZiFO_Vx9AyNLg6IkJS4ws8KgqMREyyA72Uo_Jz85sSQzP08_MSU3My-zuKQIyC1LjU_JLMssBopbJZYAhZJBSoofMcZwC7z8cU9YKnjSmpPXGH25SDZCSJKLzTWvJLOkUoifi1cK4TINBp7HTO8jTfbuEiu1859UJDQ17KzFHnMArF9jkMcAAAA\n");
                Intent int14= new Intent(Intent.ACTION_VIEW, ur14);
                startActivity(int14);
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
