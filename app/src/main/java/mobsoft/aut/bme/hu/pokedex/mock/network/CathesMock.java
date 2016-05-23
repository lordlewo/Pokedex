package mobsoft.aut.bme.hu.pokedex.mock.network;

import android.net.Uri;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import mobsoft.aut.bme.hu.pokedex.interactor.network.model.Empty;
import mobsoft.aut.bme.hu.pokedex.model.Pokemon;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;


public class CathesMock {
    public static Response add(Request request) {
        String responseString;
        int responseCode;
        Headers headers = request.headers();

        Gson gson = new Gson();

        responseString = gson.toJson(new Empty());
        responseCode = 200;

        return MockHelper.makeResponse(request, headers, responseCode, responseString);
    }

    public static Response get(Request request) {
        String responseString;
        int responseCode;
        Headers headers = request.headers();

        Gson gson = new Gson();

        List<Pokemon> pokemons = new ArrayList<>();

        Pokemon poke1 = new Pokemon();
        poke1.setAdvantage("cucc1");
        poke1.setAttack(11);
        poke1.setDefense(11);
        poke1.setDisadvantage("cucc1");
        poke1.setHealth(11);
        poke1.setHeight(11);
        poke1.setName("cucc1");
        poke1.setNumber(11);
        poke1.setSkill("cucc1");
        poke1.setSpeed(11);
        poke1.setType("cucc1");
        poke1.setWeight(11);

        Pokemon poke2 = new Pokemon();
        poke2.setAdvantage("cucc2");
        poke2.setAttack(22);
        poke2.setDefense(22);
        poke2.setDisadvantage("cucc2");
        poke2.setHealth(22);
        poke2.setHeight(22);
        poke2.setName("cucc2");
        poke2.setNumber(22);
        poke2.setSkill("cucc2");
        poke2.setSpeed(22);
        poke2.setType("cucc2");
        poke2.setWeight(22);

        pokemons.add(poke1);
        pokemons.add(poke2);

        responseString = gson.toJson(pokemons);
        responseCode = 200;

        return MockHelper.makeResponse(request, headers, responseCode, responseString);
    }

    public static Response remove(Request request) {
        String responseString;
        int responseCode;
        Headers headers = request.headers();

        Gson gson = new Gson();

        responseString = gson.toJson(new Empty());
        responseCode = 200;

        return MockHelper.makeResponse(request, headers, responseCode, responseString);
    }
}
