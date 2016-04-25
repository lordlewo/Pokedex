package mobsoft.aut.bme.hu.pokedex.interactor.network;

public class NetworkInteractor {

    private static NetworkInteractor _instance = null;

    private NetworkInteractor(){}

    public static NetworkInteractor getInstance(){
        if (_instance == null){
            _instance = new NetworkInteractor();
        }

        return _instance;
    }
}
