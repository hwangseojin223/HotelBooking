import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();

        
        while(true){
            System.err.println("\n1.예약하기 2.예약취소 3.checkout 4.저장 5.로드");
            System.out.println("메뉴선택: ");
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
            }
        }
    }
}
