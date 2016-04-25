package mobsoft.aut.bme.hu.pokedex.ui.edit;

import mobsoft.aut.bme.hu.pokedex.ui.Presenter;

public class EditPresenter extends Presenter<EditScreen>{

    private static EditPresenter _instance = null;

    private EditPresenter(){
    }

    public static EditPresenter getInstance(){
        return _instance;
    }

    @Override
    public void attachScreen(EditScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
