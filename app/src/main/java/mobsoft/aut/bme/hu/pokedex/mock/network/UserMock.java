package mobsoft.aut.bme.hu.pokedex.mock.network;

import com.google.gson.Gson;

import mobsoft.aut.bme.hu.pokedex.interactor.network.model.Empty;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;


public class UserMock {
    public static Response login(Request request) {
        String responseString;
        int responseCode;
        Headers headers = request.headers();

        Gson gson = new Gson();

        responseString = gson.toJson(new Empty());
        responseCode = 200;

        return MockHelper.makeResponse(request, headers, responseCode, responseString);
    }
}
