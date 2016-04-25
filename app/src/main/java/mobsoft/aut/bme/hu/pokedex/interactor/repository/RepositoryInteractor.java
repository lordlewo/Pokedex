package mobsoft.aut.bme.hu.pokedex.interactor.repository;

import javax.inject.Inject;
import javax.inject.Singleton;

import mobsoft.aut.bme.hu.pokedex.PokedexApplication;

@Singleton
public class RepositoryInteractor {

    @Inject
    public RepositoryInteractor(){
        PokedexApplication.injector.inject(this);
    }

    public String getLoremIpsum(){
        return "Lorem Ipsum ...";
    }
}
