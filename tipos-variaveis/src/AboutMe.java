import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        /*String name = args[0];
        *String lastname = args[1];
        *int age = Integer.valueOf(args[2]);
        *double height = Double.valueOf(args[3]);
        */
        /*System.out.println("Olá! Meu nome é " + name + " " + lastname + ".");
        System.out.println("Tenho " + age + " anos.");
        System.out.println("Tenho " + height + " de altura.");
        */
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("EN"));

        System.out.println("Digite seu nome:");
        String name = scanner.nextLine();

        System.out.println("Digite seu sobrenome:");
        String lastname = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int age = scanner.nextInt();
        
        System.out.println("Digite sua altura:");
        double height = scanner.nextDouble();

        System.out.println("Olá! Meu nome é " + name + " " + lastname + ".");
        System.out.println("Tenho " + age + " anos.");
        System.out.println("Tenho " + height + " de altura.");


    }
}
