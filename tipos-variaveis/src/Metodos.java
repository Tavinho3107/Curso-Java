public class Metodos {
    public static void main(String[] args){
      SmartTv smartTv = new SmartTv();

      smartTv.diminuirVolume();
      smartTv.diminuirVolume();
      smartTv.diminuirVolume();
      smartTv.aumentarVolume();

      System.out.println("Tv ligada? " + smartTv.ligado);
      System.out.println("Canal atual: " + smartTv.canal);
      System.out.println("Volume atual: " + smartTv.volume);
    
        smartTv.ligarTv();
        System.out.println("Novo Status Tv ligada? " + smartTv.ligado);
        smartTv.desligarTv();
        System.out.println("Novo Status Tv ligada? " + smartTv.ligado);
        smartTv.mudarCanal(12);
        System.out.println("Canal atual: " + smartTv.canal);

    }
}
