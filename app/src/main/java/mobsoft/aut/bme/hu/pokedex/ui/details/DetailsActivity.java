package mobsoft.aut.bme.hu.pokedex.ui.details;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import javax.inject.Inject;

import mobsoft.aut.bme.hu.pokedex.PokedexApplication;
import mobsoft.aut.bme.hu.pokedex.R;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
public class DetailsActivity extends AppCompatActivity implements DetailsScreen{

    private Tracker mTracker;

    @Inject
    protected DetailsPresenter detailsPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_detail);

        PokedexApplication application = (PokedexApplication) getApplication();
        mTracker = application.getDefaultTracker();
    }

    @Override
    protected void onStart() {
        super.onStart();
        PokedexApplication.injector.inject(this);
        detailsPresenter.attachScreen(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        String name = "DetailActivity";
        Log.i("Analytics", name);
        mTracker.setScreenName(name);
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        detailsPresenter.detachScreen();
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

}
