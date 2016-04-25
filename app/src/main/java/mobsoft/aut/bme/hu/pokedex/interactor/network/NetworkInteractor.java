package mobsoft.aut.bme.hu.pokedex.interactor.network;

import javax.inject.Inject;
import javax.inject.Singleton;

import mobsoft.aut.bme.hu.pokedex.PokedexApplication;

@Singleton
public class NetworkInteractor {

    @Inject
    public NetworkInteractor(){
        PokedexApplication.injector.inject(this);
    }
}
