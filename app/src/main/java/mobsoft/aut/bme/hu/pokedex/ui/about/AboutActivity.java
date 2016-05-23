package mobsoft.aut.bme.hu.pokedex.ui.about;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import javax.inject.Inject;

import mobsoft.aut.bme.hu.pokedex.PokedexApplication;
import mobsoft.aut.bme.hu.pokedex.R;
import mobsoft.aut.bme.hu.pokedex.ui.details.DetailsActivity;
import mobsoft.aut.bme.hu.pokedex.ui.mainlist.MainListActivity;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

public class AboutActivity extends AppCompatActivity implements AboutScreen{

    private Tracker mTracker;

    @Inject
    protected AboutPresenter aboutPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_about);

        PokedexApplication application = (PokedexApplication) getApplication();
        mTracker = application.getDefaultTracker();
    }

    @Override
    protected void onStart() {
        super.onStart();
        aboutPresenter.attachScreen(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String name = "AboutActivity";
        Log.i("Analytics", name);
        mTracker.setScreenName(name);
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        PokedexApplication.injector.inject(this);
        aboutPresenter.detachScreen();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.detail:
                mTracker.send(new HitBuilders.EventBuilder()
                        .setCategory("Action")
                        .setAction("Detail")
                        .build());
                Intent intentDetails = new Intent(this, DetailsActivity.class);
                this.startActivity(intentDetails);
                break;
            case R.id.about:
                mTracker.send(new HitBuilders.EventBuilder()
                        .setCategory("Action")
                        .setAction("About")
                        .build());
                Intent intentAbout = new Intent(this, AboutActivity.class);
                this.startActivity(intentAbout);
                break;
        }
        return true;
    }

    public void forceCrash(View view) {
        throw new RuntimeException("This is a crash");
    }
}
