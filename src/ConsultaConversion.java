import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion
{
    public Moneda realizarConversion(String monedaBase, String monedaDestino, float monto)
    {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/8370e080366a95b484dc300b/pair/"+monedaBase+"/"+monedaDestino+"/"+monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try{

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        }catch(Exception e){

            throw new RuntimeException("No se pudo realizar la conversion deseada...");

        }
    }
}