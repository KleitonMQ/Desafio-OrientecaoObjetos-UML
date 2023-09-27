package com.poo_desafio.Safari;

public class Navegador {
    public void AbrirPagina(){
        System.out.println("Endereco carregado");
    }

    public void AtualizarPagina(){
        System.out.println("Pagina atualizada");
    }

    public void AdicionarAba(){
        System.out.println("Nova aba aberta e aguardando endereço");
    }

    public void FechaAba(){
        System.out.println("Aba fechada");
    }

    public void Zoom(float zoom){
        System.out.println("Zoom ajustado para o valor " + zoom);
    }

    public void AdicionarFavorito(String endereco){
        System.out.println("endereco salvo nos favoritos");
    }

        public void RemoverFavorito(String endereco){
        System.out.println("endereco removido dos favoritos");
    }
}
