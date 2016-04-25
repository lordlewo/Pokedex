package mobsoft.aut.bme.hu.pokedex.interactor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mobsoft.aut.bme.hu.pokedex.interactor.network.NetworkInteractor;
import mobsoft.aut.bme.hu.pokedex.interactor.repository.RepositoryInteractor;

@Module
public class InteractorModule {

    @Singleton
    @Provides
    public NetworkInteractor provideNetworkInteractor() {
        return new NetworkInteractor();
    }

    @Singleton
    @Provides
    public RepositoryInteractor provideRepositoryInteractor() {
        return new RepositoryInteractor();
    }
}
