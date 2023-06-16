package br.com.via_cep.service;

import br.com.via_cep.models.Endereco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscarEndereco {
    private HttpClient client;
    private Gson gson;

    public BuscarEndereco() {
        this.client = HttpClient.newHttpClient();
        this.gson = getGson();
    }

    public Endereco buscando(String cep){
        String url = "https://viacep.com.br/ws/%s/json/".formatted(cep);
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return gson.fromJson(response.body(), Endereco.class);
    }

    public HttpClient getClient() {
        return client;
    }

    public static Gson getGson() {
        return new GsonBuilder().setPrettyPrinting().create();
    }
}
