package mobsoft.aut.bme.hu.pokedex.interactor.repository;

public class RepositoryInteractor {

    private static RepositoryInteractor _instance = null;

    private RepositoryInteractor(){}

    public static RepositoryInteractor getInstance(){
        if (_instance == null){
            _instance = new RepositoryInteractor();
        }

        return _instance;
    }

    public String getLoremIpsum(){
        return "Lorem Ipsum ...";
    }
}
