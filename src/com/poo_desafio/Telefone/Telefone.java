package com.poo_desafio.Telefone;

import java.util.List;

public class Telefone {
    List<Contato> contatos;

    public void ExibirContatos(){
        System.out.println("Lista de contatos exibida");
    }

    public void LigarParacontato(int numero){
        System.out.println("Chamada para contato iniciada");
    }

    public void IniciarCorreioEletronico(){
        System.out.println("Listado mensagens de vós do correio");
    }

    public void EncerrarChamada(){
        System.out.println("Chama encerrada");
    }

    public void AtenderChamada(){
        System.out.println("Chamada atendida");
    }

    public void RecusarChamada(){
        System.out.println("Chamada recusada");
    }

    public void PorChamadaEmEspera(){
        System.out.println("Chamada entrou em espera");
    }

    public void DesativarMicrofone(){
        System.out.println("Microfone mutado");
    }

    public void MesclarChamadas(){
        System.out.println("Uniu as chamadas ativas");
    }

    public void Discar(int numero){
        System.out.println("Discando para o numero digitado");
    }
}
