package mobsoft.aut.bme.hu.pokedex.mock.presenters;

import javax.inject.Inject;

import dagger.Module;
import mobsoft.aut.bme.hu.pokedex.mock.interactors.NetworkInteractor;


@Module
public class LoginPresenter {
    @Inject
    protected NetworkInteractor networkInteractor;

    @Inject
    public LoginPresenter() {
    }
}
