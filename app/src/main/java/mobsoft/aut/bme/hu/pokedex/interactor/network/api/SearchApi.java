package mobsoft.aut.bme.hu.pokedex.interactor.network.api;

import mobsoft.aut.bme.hu.pokedex.interactor.network.model.Pokemon;
import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SearchApi {
  
  /**
   * Search pokemons
   * Returns the list of pokemons that has the query string in their name.
   * @param name Part of the name of the pokemon
   * @return Call<List<Pokemon>>
   */
  
  @GET("search")
  Call<List<Pokemon>> searchGet(
          @Query("name") String name
  );

  
}
