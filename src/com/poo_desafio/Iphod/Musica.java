package com.poo_desafio.Iphod;

public class Musica implements Iphod{

    public Musica(){
        BuscarMusicas();
    }

    @Override
    public void Play() {
        System.out.println("Tocando musica");
        ExibirCapaDoAlbum();
    }

    @Override
    public void Pause() {
        System.out.println("Musica em pause");
    }

    @Override
    public void Parar() {
        System.out.println("A musica parou");
    }

    @Override
    public void Proximo() {
        System.out.println("avançou a próxima musica do album");
    }

    @Override
    public void Anterior() {
        System.out.println("Voltou para a musica anterior do album.");
    }
    
    @Override
    public void Classificar(int classificar) {
        System.out.println("A musica tem classificação: " + classificar + "Estrela(s)");
    }
    
    @Override
    public void Volume(float volume) {
        System.out.println("Volume alterado para " + volume);
    }

    private void BuscarMusicas(){
        System.out.println("Encontrou musicas no aparleho");
        ListarMusicas();
    }

    private void ListarMusicas(){
        System.out.println("Organizar musicas listadas");
    }

    private void ExibirCapaDoAlbum(){
        System.out.println("exibindo capa do album executado");
    }
}
