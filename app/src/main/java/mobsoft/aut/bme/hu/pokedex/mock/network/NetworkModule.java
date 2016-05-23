package mobsoft.aut.bme.hu.pokedex.mock.network;

import java.io.IOException;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mobsoft.aut.bme.hu.pokedex.interactor.network.api.CatchesApi;
import mobsoft.aut.bme.hu.pokedex.interactor.network.api.PokemonsApi;
import mobsoft.aut.bme.hu.pokedex.interactor.network.api.SearchApi;
import mobsoft.aut.bme.hu.pokedex.interactor.network.api.UserApi;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;


@Module
public class NetworkModule {
    private NetworkModule networkModule = new NetworkModule();

    @Provides
    @Singleton
    public OkHttpClient.Builder provideOkHttpClientBuilder() {
        return networkModule.provideOkHttpClientBuilder();
    }


    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient(OkHttpClient.Builder builder) {
        builder.interceptors().add(0, new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                return MockHttpServer.call(request);
            }
        });
        return builder.build();
    }


    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder().baseUrl("http://192.168.1.34:3000").client(client)
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
