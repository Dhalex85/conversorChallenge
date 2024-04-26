import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Busqueda {

    public Divisa buscarDivisa(String divisa){
        Gson json = new GsonBuilder().create();
        Gson gson = new Gson();
        URI direccion = URI.create
                ("https://v6.exchangerate-api.com/v6/196c69cb96ad3f165c03c752/latest/"+divisa);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        try {
            HttpResponse<String> response = null;
            response = client.send(request,HttpResponse.BodyHandlers.ofString());
            JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);
            JsonObject divisas = jsonObject.getAsJsonObject("conversion_rates");
           // System.out.println(divisas);
            return json.fromJson(divisas,Divisa.class);
        }catch (Exception e){
            throw new RuntimeException("Not found");
        }
    }
}
