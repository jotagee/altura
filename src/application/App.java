package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Alturas;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be typed? ");
        int n = sc.nextInt();
        Alturas[] vect = new Alturas[n];
        for(int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println((i+1) + " person data: ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            vect[i] = new Alturas(name, age, height);
        }

        double sum = 0.0;
        for(int i = 0; i<vect.length; i++) {
            sum += vect[i].getAltura();
        }

        double average = sum / n;
        System.out.printf("Altura média: %.2f%n", average);

        int count = 0;
        for(int i = 0; i < vect.length; i++) {
            if(vect[i].getAge() < 16) {
                count++;
            }
        }
        double percent = count * 100.0 / vect.length;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        for(int i = 0; i < vect.length; i++) {
            if(vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }
        }







        sc.close();
    }
}
