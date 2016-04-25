package mobsoft.aut.bme.hu.pokedex.ui.mainlist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import javax.inject.Inject;

import mobsoft.aut.bme.hu.pokedex.PokedexApplication;
import mobsoft.aut.bme.hu.pokedex.R;

public class MainListActivity extends AppCompatActivity implements MainListScreen{

    @Inject
    protected MainListPresenter mainListPresenter;

    @Override
    protected void onStart() {
        super.onStart();
        PokedexApplication.injector.inject(this);
        mainListPresenter.attachScreen(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainListPresenter.detachScreen();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button li_btn = (Button) findViewById(R.id._li_btn);
        li_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainListPresenter.getLoremIpsum();
                Toast.makeText(getApplicationContext(), _li, Toast.LENGTH_LONG).show();
            }
        });
    }

    /**************************************************************************/

    private String _li;

    public void setLoremIpsum(String li){
        this._li = li;
    }

}
