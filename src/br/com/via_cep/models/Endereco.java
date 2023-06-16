package br.com.via_cep.models;

public record Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) { }
