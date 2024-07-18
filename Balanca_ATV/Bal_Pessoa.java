package Balanca_ATV;

public class Bal_Pessoa {
    String nome;
    int idade;
    String genero;
    double peso;
    double altura;
    double imc;

    public double IMC(){
        return peso / (altura * altura);
    }

    
    public double BT(double imc, int idade, String genero) {
        if (genero.equalsIgnoreCase("M")) {
            return (1.2 * imc) + (0.23 * idade) - (10.8 * 1) - 5.4;
        } else {
            return (1.2 * imc) + (0.23 * idade) - (10.8 * 0) - 5.4;
        }
    }
}
