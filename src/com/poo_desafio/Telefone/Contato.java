package com.poo_desafio.Telefone;

public class Contato {
    private String Nome;
    private String Email;
    private int NumeroTelefone;
    private boolean Favorito = false;
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getNumeroTelefone() {
        return NumeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        NumeroTelefone = numeroTelefone;
    }


    public boolean isFavorito() {
        return Favorito;
    }

    public void setFavorito(boolean favorito) {
        Favorito = favorito;
    }
}
