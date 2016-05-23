package mobsoft.aut.bme.hu.pokedex.mock.interactors;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MockInteractors {
    @Singleton
    @Provides
    public NetworkInteractor networkInteractor() {
        return new NetworkInteractor();
    }

    @Singleton
    @Provides
    public RepositoryInteractor repositoryInteractor() {
        return new RepositoryInteractor();
    }
}
