import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Response response = null;

        try {
            response = okHttpClient.newCall(new Request.Builder()
                    .get()
                    .url("https://api.icndb.com/jokes/random")
                    .build()).execute();
        } catch(IOException e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = null;

        try {
            jsonNode = objectMapper.readTree(response.body().string());
        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println(jsonNode.get("value").get("joke"));
    }
}