package mobsoft.aut.bme.hu.pokedex.ui.details;

import javax.inject.Inject;
import javax.inject.Singleton;

import mobsoft.aut.bme.hu.pokedex.PokedexApplication;
import mobsoft.aut.bme.hu.pokedex.interactor.network.NetworkInteractor;
import mobsoft.aut.bme.hu.pokedex.interactor.repository.RepositoryInteractor;
import mobsoft.aut.bme.hu.pokedex.ui.Presenter;

@Singleton
public class DetailsPresenter extends Presenter<DetailsScreen>{

    @Inject
    protected NetworkInteractor networkInteractor;

    @Inject
    protected RepositoryInteractor repositoryInteractor;


    @Inject
    public DetailsPresenter(){}

    @Override
    public void attachScreen(DetailsScreen screen) {
        super.attachScreen(screen);
        PokedexApplication.injector.inject(this);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
