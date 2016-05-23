package mobsoft.aut.bme.hu.pokedex.interactor.network.api;


import mobsoft.aut.bme.hu.pokedex.interactor.network.model.Empty;
import mobsoft.aut.bme.hu.pokedex.interactor.network.model.Pokemon;
import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PokemonsApi {
  
  /**
   * Adds new pokemon
   * Adds a new pokemon to the list of catched pokemons for the user
   * @param userId The user&#39;s unique identifier
   * @param pokeId The pokemon&#39;s unique identifier
   * @return Call<Empty>
   */
  
  @PUT("add")
  Call<Empty> addPut(
          @Query("userId") String userId, @Query("pokeId") String pokeId
  );

  
  /**
   * List of user&#39;s pokemons
   * Returns the pokemons which were catched by the user.
   * @param userId The user&#39;s unique identifier
   * @return Call<List<Pokemon>>
   */
  
  @GET("get")
  Call<List<Pokemon>> getGet(
          @Query("userId") String userId
  );

  
  /**
   * Detailed data on a pokemon
   * Returns the detailed description of the selected pokemon
   * @param pokeId The pokemon&#39;s unique identifier
   * @return Call<Pokemon>
   */
  
  @GET("getPokemon")
  Call<Pokemon> getPokemonGet(
          @Query("pokeId") String pokeId
  );

  
  /**
   * Deletes a pokemon
   * Deletes a pokemon from the users list of catched pokemons
   * @param userId The user&#39;s unique identifier
   * @param pokeId The pokemon&#39;s unique identifier
   * @return Call<Empty>
   */
  
  @DELETE("remove")
  Call<Empty> removeDelete(
          @Query("userId") String userId, @Query("pokeId") String pokeId
  );

  
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
