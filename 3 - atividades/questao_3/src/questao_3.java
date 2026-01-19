import java.util.Scanner;
public class questao_3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;
        int entrada_usuarios = 0;
        while(entrada_usuarios != 4){
            System.out.println("Lista de itens:");
            System.out.println("1 - Alcool");
            System.out.println("2 - Gasolina");
            System.out.println("3 - Diesel");
            System.out.println("4 - Fim");
            System.out.print("Digite a Opção desejada: ");
            entrada_usuarios = sc.nextInt();
            if(entrada_usuarios == 1){
                alcool += 1;
            }
            else if(entrada_usuarios == 2){
                gasolina += 1;
            }
            else if(entrada_usuarios == 3){
                diesel += 1;
            }   
        }
        System.out.println("Muito Obrigado");
            System.out.println("Vendas: ");
            System.out.println("Alcool: "+ alcool);
            System.out.println("Gasolina: "+ gasolina);
            System.out.println("Diesel: "+ diesel);
    
    
        sc.close();
    }
}
