import java.util.Scanner;
public class questao_2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Digite o X: ");
        x = sc.nextInt();
		System.out.print("Digite o Y: ");
        y = sc.nextInt();
        while (x != 0 && y != 0 ) {
            if(x > 0 && y > 0){
                System.out.println("Primeiro");
            }
            else if(x > 0 && y < 0){
                System.out.println("Quarto");
            }
            else if(x < 0 && y < 0){
                System.out.println("Terceiro");
            }
            else{
                System.out.println("Segundo");
            }
            System.out.print("Digite o X: ");
            x = sc.nextInt();
			System.out.print("Digite o Y: ");
            y = sc.nextInt();
        }
        System.out.println("Input inválido, finalizando o programa.");
        sc.close();
    }
}
