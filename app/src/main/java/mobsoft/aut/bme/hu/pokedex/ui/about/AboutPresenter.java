package mobsoft.aut.bme.hu.pokedex.ui.about;

import mobsoft.aut.bme.hu.pokedex.ui.Presenter;

public class AboutPresenter extends Presenter<AboutScreen> {

    private static AboutPresenter _instance = null;

    private AboutPresenter(){
    }

    public static AboutPresenter getInstance(){
        return _instance;
    }

    @Override
    public void attachScreen(AboutScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
