package mobsoft.aut.bme.hu.pokedex.ui.details;

import mobsoft.aut.bme.hu.pokedex.ui.Presenter;

public class DetailsPresenter extends Presenter<DetailsScreen>{

    private static DetailsPresenter _instance = null;

    private DetailsPresenter(){
    }

    public static DetailsPresenter getInstance(){
        return _instance;
    }

    @Override
    public void attachScreen(DetailsScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
