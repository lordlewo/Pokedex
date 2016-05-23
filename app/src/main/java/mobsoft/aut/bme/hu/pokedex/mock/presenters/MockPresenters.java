package mobsoft.aut.bme.hu.pokedex.mock.presenters;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class MockPresenters {
    private Context context;

    public MockPresenters(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }
}
