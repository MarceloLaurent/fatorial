//Exercício 3
package controller;

public class FatorialController {

    public FatorialController() {
    }

    public int fatorial(int numero){
        if(numero == 1){
            return 1; //Condição de parada: n = 1
        } else {
            return numero * fatorial(numero - 1); //Chamada: último némero vezes o anterior
        }
    }
}
