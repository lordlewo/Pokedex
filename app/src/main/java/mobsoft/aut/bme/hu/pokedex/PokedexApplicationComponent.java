package mobsoft.aut.bme.hu.pokedex;

import javax.inject.Singleton;

import dagger.Component;
import mobsoft.aut.bme.hu.pokedex.interactor.network.NetworkInteractor;
import mobsoft.aut.bme.hu.pokedex.interactor.repository.RepositoryInteractor;
import mobsoft.aut.bme.hu.pokedex.ui.UIModule;
import mobsoft.aut.bme.hu.pokedex.ui.about.AboutActivity;
import mobsoft.aut.bme.hu.pokedex.ui.about.AboutPresenter;
import mobsoft.aut.bme.hu.pokedex.ui.details.DetailsActivity;
import mobsoft.aut.bme.hu.pokedex.ui.details.DetailsPresenter;
import mobsoft.aut.bme.hu.pokedex.ui.edit.EditActivity;
import mobsoft.aut.bme.hu.pokedex.ui.edit.EditPresenter;
import mobsoft.aut.bme.hu.pokedex.ui.login.LoginActivity;
import mobsoft.aut.bme.hu.pokedex.ui.login.LoginPresenter;
import mobsoft.aut.bme.hu.pokedex.ui.mainlist.MainListActivity;
import mobsoft.aut.bme.hu.pokedex.ui.mainlist.MainListPresenter;

@Singleton
@Component(modules = {UIModule.class})
public interface PokedexApplicationComponent {

    // ui

    void inject(MainListActivity mainListActivity);
    void inject(MainListPresenter mainListPresenter);

    void inject(LoginActivity loginActivity);
    void inject(LoginPresenter loginPresenter);

    void inject(EditActivity editActivity);
    void inject(EditPresenter editPresenter);

    void inject(DetailsActivity detailsActivity);
    void inject(DetailsPresenter detailsPresenter);

    void inject(AboutActivity aboutActivity);
    void inject(AboutPresenter aboutPresenter);


    // interactor

    void inject(NetworkInteractor networkInteractor);
    void inject(RepositoryInteractor repositoryInteractor);
}
