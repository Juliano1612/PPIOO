package exerciciolanchonete;

import java.util.Scanner;

public class ExercicioLanchonete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double total = 0;
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            total += preco(opcao);
            
            System.out.printf("Opção escolhida: %d\n", opcao);
            System.out.printf("Valor de sua conta: R$%.2f\n\n", total);
            
        }while(opcao != 0);
        
    }
    
    //Implementação alternativa usando printf
    public static void menu(){
        int count = 0;
                
        System.out.println("\tBebidas");
        for (Bebida b: Bebida.values()){
            System.out.printf("%d. %s: R$%.2f\n", ++count, b.getNome(), b.getPrecoFinal());
        }
        System.out.println("\tComidas");
        for (Comida b: Comida.values()){
            System.out.printf("%d. %s: R$%.2f\n", ++count, b.getNome(), b.getPrecoFinal());
        }
        
        System.out.println("0. Sair");        
        System.out.println("Escolha sua opção: ");
        
    }
    
    public static double preco(int opcao){
        switch(opcao){
            case 1:
                return Bebida.REFRIGERANTE.getPrecoFinal();
            case 2:
                return Bebida.SUCO.getPrecoFinal();
            case 3:
                return Bebida.AGUA.getPrecoFinal();
            case 4:
                return Comida.HOTDOG.getPrecoFinal();
            case 5:
                return Comida.HAMBURGUER.getPrecoFinal();
            case 6:
                return Comida.BATATA.getPrecoFinal();
            default:
                return 0.0;
        }
    }
    
}
