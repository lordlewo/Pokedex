package mobsoft.aut.bme.hu.pokedex.mock.presenters;

public class Presenter<T> {
    protected T screen;

    public void attachScreen(T screen) {
        this.screen = screen;
    }

    public void detachScreen() {
        this.screen = null;
    }
}
