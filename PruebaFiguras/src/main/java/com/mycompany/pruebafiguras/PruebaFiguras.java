package com.mycompany.pruebafiguras;

import java.util.Scanner;

public class PruebaFiguras {

    public static void main(String[] args) {
        // Solicitar datos para el círculo
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar datos para el círculo
            System.out.println("Ingrese el radio del circulo:");
            int radioCirculo = scanner.nextInt();
            Circulo figura1 = new Circulo(radioCirculo);
            // Solicitar datos para el rectángulo
            System.out.println("Ingrese la base del rectangulo:");
            double baseRectangulo = scanner.nextDouble();
            System.out.println("Ingrese la altura del rectangulo:");
            double alturaRectangulo = scanner.nextDouble();
            Rectangulo figura2;
            figura2 = new Rectangulo((int) baseRectangulo, (int) alturaRectangulo);
            // Solicitar datos para el cuadrado
            System.out.println("Ingrese el lado del cuadrado:");
            double ladoCuadrado = scanner.nextDouble();
            Cuadrado figura3 = new Cuadrado((int) ladoCuadrado);
            // Solicitar datos para el triángulo
            System.out.println("Ingrese la base del triangulo:");
            double baseTriangulo = scanner.nextDouble();
            System.out.println("Ingrese la altura del triangulo:");
            double alturaTriangulo = scanner.nextDouble();
            TrianguloRectangulo figura4;
            figura4 = new TrianguloRectangulo((int) baseTriangulo, (int) alturaTriangulo);
            // Imprimir resultados
            System.out.println("El area del círculo es = " + figura1.calcularArea());
            System.out.println("El perimetro del círculo es = " + figura1.calcularPerimetro());
            System.out.println();
            System.out.println("El area del rectángulo es = " + figura2.calcularArea());
            System.out.println("El perimetro del rectángulo es = " + figura2.calcularPerimetro());
            System.out.println();
            System.out.println("El area del cuadrado es = " + figura3.calcularArea());
            System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerimetro());
            System.out.println();
            System.out.println("El area del triangulo es = " + figura4.calcularArea());
            System.out.println("El perimetro del triangulo es = " + figura4.calcularPerimetro());
            figura4.determinarTipoTriangulo();
            // Cerrar el scanner
        }
    }
}

