package mobsoft.aut.bme.hu.pokedex.mock.presenters;

import javax.inject.Inject;
import javax.inject.Singleton;

import mobsoft.aut.bme.hu.pokedex.mock.interactors.NetworkInteractor;
import mobsoft.aut.bme.hu.pokedex.mock.interactors.RepositoryInteractor;
import mobsoft.aut.bme.hu.pokedex.ui.mainlist.MainListScreen;


@Singleton
public class MainPresenter extends Presenter<MainListScreen> {
    @Inject
    protected NetworkInteractor networkInteractor;
    @Inject
    protected RepositoryInteractor repositoryInteractor;

    @Inject
    public MainPresenter() {
    }

    public void lol() {
        System.out.println("lol");
    }
}
