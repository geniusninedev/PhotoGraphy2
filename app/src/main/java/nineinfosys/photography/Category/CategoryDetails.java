package nineinfosys.photography.Category;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import nineinfosys.photography.R;


public class CategoryDetails extends AppCompatActivity {
    WebView tutorialsWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tutorialsWebView = (WebView) findViewById(R.id.CallTutorialWebViwId);

        WebSettings webSetting = tutorialsWebView.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        tutorialsWebView.setWebViewClient(new CategoryDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            tutorialsWebView.loadUrl("file:///android_asset/astrography.html");
        } else if (position == 1) {
            tutorialsWebView.loadUrl("file:///android_asset/blackwhite.html");
        } else if (position == 2) {
            tutorialsWebView.loadUrl("file:///android_asset/color.html");
        } else if (position == 3) {
            tutorialsWebView.loadUrl("file:///android_asset/wedding.html");
        } else if (position == 4) {
            tutorialsWebView.loadUrl("file:///android_asset/flash.html");

        } else if (position == 5) {
            tutorialsWebView.loadUrl("file:///android_asset/landscape.html");
        } else if (position == 6) {
            tutorialsWebView.loadUrl("file:///android_asset/nature.html");
        } else if (position == 7) {
            tutorialsWebView.loadUrl("file:///android_asset/photojournalism.html");
        }
        else if (position == 8) {
            tutorialsWebView.loadUrl("file:///android_asset/panoramma.html");
        } else if (position == 9) {
            tutorialsWebView.loadUrl("file:///android_asset/docccc.html");
        }


    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case android.R.id.home:


                this.finish();
                return true;
            default:

                return super.onOptionsItemSelected(item);

        }
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //  Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            //Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }
}




