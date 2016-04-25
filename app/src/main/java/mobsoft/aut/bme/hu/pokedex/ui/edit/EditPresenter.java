package mobsoft.aut.bme.hu.pokedex.ui.edit;

import javax.inject.Inject;
import javax.inject.Singleton;

import mobsoft.aut.bme.hu.pokedex.PokedexApplication;
import mobsoft.aut.bme.hu.pokedex.interactor.network.NetworkInteractor;
import mobsoft.aut.bme.hu.pokedex.interactor.repository.RepositoryInteractor;
import mobsoft.aut.bme.hu.pokedex.ui.Presenter;

@Singleton
public class EditPresenter extends Presenter<EditScreen>{

    @Inject
    protected NetworkInteractor networkInteractor;

    @Inject
    protected RepositoryInteractor repositoryInteractor;


    @Inject
    public EditPresenter(){
    }

    @Override
    public void attachScreen(EditScreen screen) {
        super.attachScreen(screen);
        PokedexApplication.injector.inject(this);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
