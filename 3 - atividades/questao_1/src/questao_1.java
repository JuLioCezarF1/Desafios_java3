import java.util.Scanner;
public class questao_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        int tentativa = 0;
        while (tentativa != senha) {
            System.out.print("Digite a senha: ");
            tentativa = sc.nextInt();
            System.out.println("senha Inválida.");
        }
        System.out.println("Acesso permitido");
        sc.close();
    }
}
