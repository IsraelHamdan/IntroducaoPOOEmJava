package Application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Insira os dados do triangulo A");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Insira os dados do triangulo B");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.areaTriangulo();

        double areaY = y.areaTriangulo();

        if (areaX > areaY) {
            System.out.println("Area do triangulo A é maior que a do triangulo B");
        } else {
            System.out.println("Area do triangulo B é maior que a do A");
        }
        sc.close();
    }


}

