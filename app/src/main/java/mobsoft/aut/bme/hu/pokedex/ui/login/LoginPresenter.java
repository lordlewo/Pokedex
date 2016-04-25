package mobsoft.aut.bme.hu.pokedex.ui.login;

import javax.inject.Inject;
import javax.inject.Singleton;

import mobsoft.aut.bme.hu.pokedex.PokedexApplication;
import mobsoft.aut.bme.hu.pokedex.interactor.network.NetworkInteractor;
import mobsoft.aut.bme.hu.pokedex.interactor.repository.RepositoryInteractor;
import mobsoft.aut.bme.hu.pokedex.ui.Presenter;

@Singleton
public class LoginPresenter extends Presenter<LoginScreen>{

    @Inject
    protected NetworkInteractor networkInteractor;

    @Inject
    protected RepositoryInteractor repositoryInteractor;


    @Inject
    public LoginPresenter(){}

    @Override
    public void attachScreen(LoginScreen screen) {
        super.attachScreen(screen);
        PokedexApplication.injector.inject(this);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

}
