package br.com.treinaweb.semana2;

import br.com.treinaweb.semana2.models.Diarista;

public class App {
  public static void main(String[] args) {
    var diarista = new Diarista(1L, "Maria da Silva", "(85) 99999-9999", "123.123.123-85", "Av Emilia Gonçalves");

    System.out.println(diarista.getId());
    System.out.println(diarista.getNome());
    System.out.println(diarista.getTelefone());
    System.out.println(diarista.getCpf());
    System.out.println(diarista.getEndereco());
  }
}