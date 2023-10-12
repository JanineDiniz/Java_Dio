public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume Atual? " + smartTv.volume);

        //LIGAR E DESLIGAR
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        //AUMENTAR E DIMINUIR VOLUME
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        //MUDAR O CANAL
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);
    }
}
