package com.poo_desafio.Ipod;

public class Video implements Ipod {

    public Video(){
        BuscarVideos();
    }
    @Override
    public void Play() {
        System.err.println("Reproduzindo vídeo");
    }

    @Override
    public void Pause() {
        System.out.println("Congelou imagem e som do vídeo");
    }

    @Override
    public void Parar() {
        System.err.println("Encerrou a reprodução do vídeo");
    }

    @Override
    public void Proximo() {
        System.out.println("Avançou para o vídeo seguinte da lista");
    }

    @Override
    public void Anterior() {
        System.out.println("Retrocedeu para o vídeo anterior da lista");
    }

    @Override
    public void Classificar(int classificar) {
        System.err.println("Classificou o vídeo em " + classificar + " estrela(s)");
    }
    
    @Override
    public void Volume(float volume) {
        System.out.println("Volume alterado para " + volume);
    }

    private void BuscarVideos(){
        System.err.println("Encontrou todos os videos do dispositivo.");
        ListarVideos();
    }

    private void ListarVideos(){
        System.err.println("Listou todos os videos encontrados");
    }
}
