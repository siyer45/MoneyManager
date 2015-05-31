package betahouse.santoshkumar.moneymanager.CStartScreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import betahouse.santoshkumar.moneymanager.CMainScreen.CMainScreen;
import betahouse.santoshkumar.moneymanager.R;

/**
 * Created by Santoshkumar on 31-05-2015.
 */
public class CStartScreen extends Activity
{
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startscreen_layout);

        final ImageView LoadingBar00 = (ImageView)findViewById(R.id.LoadingBar00);
        final ImageView LoadingBar75 = (ImageView)findViewById(R.id.LoadingBar75);

        LoadingBar00.setVisibility(View.VISIBLE);
        LoadingBar75.setVisibility(View.INVISIBLE);

        new Handler().postDelayed(new Runnable()
        {
            /*
            * Showing splash screen with a timer. This will be useful when you
            * want to show case your app logo / company
            */
            @Override
            public void run()
            {
                LoadingBar00.setVisibility(View.INVISIBLE);
                LoadingBar75.setVisibility(View.VISIBLE);
            }
        }, SPLASH_TIME_OUT / 2);


        new Handler().postDelayed(new Runnable()
        {
            /*
            * Showing splash screen with a timer. This will be useful when you
            * want to show case your app logo / company
            */
            @Override
            public void run()
            {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(CStartScreen.this, CMainScreen.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT / 2);
    }
}
