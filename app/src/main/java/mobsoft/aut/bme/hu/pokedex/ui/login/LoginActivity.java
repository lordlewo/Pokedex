package mobsoft.aut.bme.hu.pokedex.ui.login;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import javax.inject.Inject;

import mobsoft.aut.bme.hu.pokedex.PokedexApplication;
import mobsoft.aut.bme.hu.pokedex.R;

public class LoginActivity extends AppCompatActivity implements LoginScreen{

    @Inject
    protected LoginPresenter loginPresenter;

    @Override
    protected void onStart() {
        super.onStart();
        PokedexApplication.injector.inject(this);
        loginPresenter.attachScreen(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginPresenter.detachScreen();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
