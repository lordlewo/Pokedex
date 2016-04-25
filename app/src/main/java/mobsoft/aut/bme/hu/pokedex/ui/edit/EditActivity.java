package mobsoft.aut.bme.hu.pokedex.ui.edit;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import javax.inject.Inject;

import mobsoft.aut.bme.hu.pokedex.PokedexApplication;
import mobsoft.aut.bme.hu.pokedex.R;

public class EditActivity extends AppCompatActivity implements EditScreen{

    @Inject
    protected EditPresenter editPresenter;

    @Override
    protected void onStart() {
        super.onStart();
        PokedexApplication.injector.inject(this);
        editPresenter.attachScreen(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        editPresenter.detachScreen();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
