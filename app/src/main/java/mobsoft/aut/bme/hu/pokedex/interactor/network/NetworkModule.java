package mobsoft.aut.bme.hu.pokedex.interactor.network;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mobsoft.aut.bme.hu.pokedex.interactor.network.api.CatchesApi;
import mobsoft.aut.bme.hu.pokedex.interactor.network.api.PokemonsApi;
import mobsoft.aut.bme.hu.pokedex.interactor.network.api.SearchApi;
import mobsoft.aut.bme.hu.pokedex.interactor.network.api.UserApi;
import mobsoft.aut.bme.hu.pokedex.mock.network.GsonHelper;
import okhttp3.OkHttpClient;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

@Module
public class NetworkModule {
    @Provides
    @Singleton
    public OkHttpClient.Builder provideOkHttpClientBuilder() {
        OkHttpClient.Builder clientBuilder = null;
        try {
            clientBuilder = UnsafeClientFactory.getUnsafeClient();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (clientBuilder == null) {
            throw new RuntimeException("HttpClient cannot be initialized!");
        }

        return clientBuilder;
    }

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient(OkHttpClient.Builder builder) {
        return builder.build();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder().baseUrl("http://mymovies.com").client(client)
                .addConverterFactory(GsonConverterFactory.create(GsonHelper.getGson())).build();
    }

    @Provides
    @Singleton
    public CatchesApi provideCatchesApi(Retrofit retrofit) {
        return retrofit.create(CatchesApi.class);
    }

    @Provides
    @Singleton
    public PokemonsApi providePokemonsApi(Retrofit retrofit) {
        return retrofit.create(PokemonsApi.class);
    }

    @Provides
    @Singleton
    public SearchApi provideSearchApi(Retrofit retrofit) {
        return retrofit.create(SearchApi.class);
    }

    @Provides
    @Singleton
    public UserApi provideUserApi(Retrofit retrofit) {
        return retrofit.create(UserApi.class);
    }

}
