package mobsoft.aut.bme.hu.pokedex.ui;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mobsoft.aut.bme.hu.pokedex.ui.mainlist.MainListPresenter;

@Module
public class UIModule {

    private Context _context;

    public UIModule(Context context){
        this._context = context;
    }

    @Provides
    public Context provideContext(){
        return _context;
    }

    @Provides
    @Singleton
    public MainListPresenter provideMainListPresenter(){
        return new MainListPresenter();
    }
}
