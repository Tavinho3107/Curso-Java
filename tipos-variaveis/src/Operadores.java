public class Operadores {
    public static void main(String[] args){
        int a = 20;
        int b = 20;
        String result = a == b ? "Verdadeiro" : "Falso";
        System.out.println(result);

        String nomeUm = "Gleyson";
        String nomeDois = new String("Gleyson");
        System.out.println(nomeUm.equals(nomeDois));

    }
}
