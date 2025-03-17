import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();

        
        while(true){
            System.err.println("\n1.예약하기 2.예약취소 3.checkout 4.저장하기 5.불러오기 6.종료");
            System.out.print("메뉴선택: ");
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
                    System.out.println("프로그램 종료");
                    return;
            }
        }
    }
}
