package mobsoft.aut.bme.hu.pokedex.ui.details;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import mobsoft.aut.bme.hu.pokedex.R;

public class DetailsActivity extends AppCompatActivity implements DetailsScreen{

    @Override
    protected void onStart() {
        super.onStart();
        DetailsPresenter.getInstance().attachScreen(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        DetailsPresenter.getInstance().detachScreen();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
