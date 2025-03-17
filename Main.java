import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();

        
        while(true){
            System.out.println("\n1.�����ϱ� 2.������� 3.checkout 4.�����ϱ� 5.�ҷ����� 6.����");
            System.out.print("�޴�����: ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1 :
                    m.reservation();
                    break;
                case 2:
                    m.cancel();
                    break;
                case 3:
                    m.checkout();
                    break;
                case 4:
                    m.save();
                    break;
                case 5:
                    m.load();
                    break;
                case 6:
                    System.out.println("���α׷� ����");
                    return;
            }
        }
    }
}
