package mobsoft.aut.bme.hu.pokedex;

import android.app.Application;

import mobsoft.aut.bme.hu.pokedex.ui.UIModule;

public class PokedexApplication extends Application {

    public static PokedexApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();

        injector = DaggerPokedexApplicationComponent.builder().uIModule(new UIModule(this)).build();
    }
}
