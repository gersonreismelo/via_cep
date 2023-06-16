package br.com.via_cep.main;

import br.com.via_cep.models.Endereco;
import br.com.via_cep.service.BuscarEndereco;
import br.com.via_cep.util.EscritorArquivo;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String cep = "";
        List<Endereco> enderecos = new ArrayList<>();
        BuscarEndereco endereco = new BuscarEndereco();
        EscritorArquivo arquivo = new EscritorArquivo();

        while (!cep.equalsIgnoreCase("sair")) {
            System.out.println("Digite os ceps que deseja encontrar ou (sair):");
            cep = sc.nextLine();

            if (cep.equals("sair")) {
                break;
            }
            try {
                enderecos.add(endereco.buscando(cep));
            } catch (JsonSyntaxException e) {
                System.out.println("Cep invalido!");
                break;
            }
        }

        arquivo.escreverEnderecos(enderecos, "Endereços.txt");
        System.out.println(enderecos);
        System.out.println("O programa finalizou corretamente!");

    }
}