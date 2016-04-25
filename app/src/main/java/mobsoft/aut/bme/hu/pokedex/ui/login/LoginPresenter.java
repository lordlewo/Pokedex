package mobsoft.aut.bme.hu.pokedex.ui.login;

import mobsoft.aut.bme.hu.pokedex.ui.Presenter;

public class LoginPresenter extends Presenter<LoginScreen>{

    private static LoginPresenter _instance = null;

    private LoginPresenter(){
    }

    public static LoginPresenter getInstance(){
        if (_instance == null){
            _instance = new LoginPresenter();
        }

        return _instance;
    }

    @Override
    public void attachScreen(LoginScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

}
