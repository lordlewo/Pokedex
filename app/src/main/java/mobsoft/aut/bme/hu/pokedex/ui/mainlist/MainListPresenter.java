package mobsoft.aut.bme.hu.pokedex.ui.mainlist;

import mobsoft.aut.bme.hu.pokedex.interactor.repository.RepositoryInteractor;
import mobsoft.aut.bme.hu.pokedex.ui.Presenter;

public class MainListPresenter extends Presenter<MainListScreen>{

    private static MainListPresenter _instance = null;

    private MainListPresenter(){
    }

    public static MainListPresenter getInstance(){
        if (_instance == null) {
            _instance = new MainListPresenter();
        }

        return _instance;
    }

    @Override
    public void attachScreen(MainListScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }


    public void getLoremIpsum(){

        String li = RepositoryInteractor.getInstance().getLoremIpsum();

        screen.setLoremIpsum(li);
    }

}
