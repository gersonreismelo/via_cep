package br.com.via_cep.util;

import br.com.via_cep.models.Endereco;
import br.com.via_cep.service.BuscarEndereco;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscritorArquivo {
    public void escreverEnderecos(List<Endereco> enderecos, String nome) {
        Gson gson = BuscarEndereco.getGson();
        FileWriter writer = null;
        try {
            writer = new FileWriter(nome);
            writer.write(gson.toJson(enderecos));
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
