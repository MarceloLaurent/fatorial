package view;

import controller.FatorialController;

public class Main {
    public static void main(String[] args) {
        FatorialController fc = new FatorialController();

        int resultado = fc.fatorial(6);

        System.out.println(resultado);
    }

}