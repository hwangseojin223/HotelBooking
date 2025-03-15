import java.util.Scanner;

public class Manager{
    private Room arr[][];
    private int count;

    public Manager(){
        arr = new Room[9][31];
        arr = 0;
    }

    Scanner sc = new Scanner(System.in);

    public void reservation(){
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = sc.nextLine();

        do{
            System.out.print("객실 타입을 입력하세요(스탠다드룸, 스위트룸)");
            String roomType = sc.nextLine();
            if (roomType.equals("스탠다드룸") || roomType.equals("스위트룸")) break;
            else System.out.print("잘못된 객실 타입입니다."); 

        }while(true);
        
        if(roomType.equals("스탠다드룸")){
            while(true){
                System.out.print("객실 번호를 입력하세요(101~105)");
                int min = 101;
                int max = 105;
                int roomNumber = sc.nextInt();

                if((roomNumber>=min)&&(roomNumber<=max)) break;
                else System.out.print("101~105 사이로 입력하세요");
            }   
        }
        else if(roomType.equals("스위트룸")){
            while(true){
                System.out.print("객실 번호를 입력하세요(106~109)");
                int min = 106;
                int max = 109;
                int roomNumber = sc.nextInt();

                if((roomNumber>=min)&&(roomNumber<=max)) break;
                else System.out.print("106~109 사이로 입력하세요");
            }   
        }

        System.out.print("예약일자를 입력하세요: ");
        int day = sc.nextInt();
        
        System.out.print("예약인원을 입력하세요: ");
        int personNumber = sc.nextInt();

        int FixRoomNumber = roomNumber % 10-1;
        if(arr[FixRoomNumber][day-1] == 0){
            arr[FixRoomNumber][day-1] = -1;
            System.out.println("예약이 완료되었습니다");
        } 

        else if(arr[FixRoomNumber][day-1] == -1){
            System.out.println("예약이 불가능합니다.");
            if (roomType.equals("스탠다드룸")){
                for(int i=0; i<5; i++){
                    System.out.println("예약이 불가능합니다.");
                    if(arr[i][day-1]==0)
                }
            }

        }





    }

    public void cancel(){

    }

    public void checkout(){

    }
}