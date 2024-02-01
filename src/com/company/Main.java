package com.company;

public class Main {

    public static void main(String[] args) {

        PracticaExcepciones practicaExcepciones = new PracticaExcepciones();

        try{
            practicaExcepciones.calcularCociente();
        }catch (ArithmeticException ex){
            throw new IllegalArgumentException("No se puede dividir por cero");
        }finally {
            System.out.println("Programa finalizado");
        }


    }
}

class PracticaExcepciones{
    int a = 0, b = 300;

    public int calcularCociente(){
        return b/a;
    }
}
