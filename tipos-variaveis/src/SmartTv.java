public class SmartTv {
        boolean ligado = false;
        int volume = 25;
        int canal = 1;
      public void ligarTv(){
        ligado = true;
      }
      public void desligarTv(){
        ligado = false;
      }
      public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
      }
      public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
      }
      public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando para o canal: " + canal);
      }
      public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
      }
      public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);
      }
}


