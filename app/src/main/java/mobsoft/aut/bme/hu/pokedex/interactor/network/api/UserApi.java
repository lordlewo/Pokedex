package mobsoft.aut.bme.hu.pokedex.interactor.network.api;


import mobsoft.aut.bme.hu.pokedex.interactor.network.model.Empty;
import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserApi {
  
  /**
   * Login
   * Attempts to log in the user
   * @param userId The user&#39;s id
   * @param password The user&#39;s password sent in a very safe plaintext way
   * @return Call<Empty>
   */
  
  @GET("login")
  Call<Empty> loginGet(
          @Query("userId") String userId, @Query("password") String password
  );

  
}
