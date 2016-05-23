package mobsoft.aut.bme.hu.pokedex.mock.presenters;

import javax.inject.Inject;
import javax.inject.Singleton;

import mobsoft.aut.bme.hu.pokedex.mock.interactors.NetworkInteractor;

@Singleton
public class DetailsPresenter {
    @Inject
    protected NetworkInteractor networkInteractor;

    @Inject
    public DetailsPresenter() {
    }
}
