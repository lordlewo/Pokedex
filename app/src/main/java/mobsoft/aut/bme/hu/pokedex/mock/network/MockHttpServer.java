package mobsoft.aut.bme.hu.pokedex.mock.network;

import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by mobsoft on 2016. 05. 02..
 */
public class MockHttpServer {
    public static Response call(Request request) {
        MockInterceptor mockInterceptor = new MockInterceptor();
        return mockInterceptor.process(request);
    }
}
