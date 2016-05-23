package mobsoft.aut.bme.hu.pokedex.mock.network;

import android.net.Uri;
import android.util.Log;

import java.io.IOException;

import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by mobsoft on 2016. 05. 02..
 */
public class MockInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        return process(chain.request());
    }

    public Response process(Request request) {

        Uri uri = Uri.parse(request.url().toString());

        Log.d("Test Http Client", "URL call: " + uri.toString());
        Headers headers = request.headers();

        if (uri.getPath().startsWith("/catches/add")) {
            return CathesMock.add(request);
        } else if (uri.getPath().startsWith("/catches/get")) {
            return CathesMock.get(request);
        } else if (uri.getPath().startsWith("/catches/remove")) {
            return CathesMock.remove(request);
        } else if (uri.getPath().startsWith("/getPokemon")) {
            return PokemonsMock.get(request);
        } else if (uri.getPath().startsWith("/search")) {
            return PokemonsMock.search(request);
        } else {
            return UserMock.login(request);
        }
    }
}