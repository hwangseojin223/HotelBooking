import java.util.Scanner;

public class Manager{
    private Room arr[][];
    private int count;

    public Manager(){
        arr = new Room[9][31];
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
        if(arr[FixRoomNumber][day-1] == null){ //비어있는 방이면 예약 완료
            if(roomType.equals("스탠다드룸")) arr[FixRoomNumber][day-1] = new StandardRoom;
            else arr[FixRoomNumber][day-1] = new SuiteRoom;


            System.out.println("예약이 완료되었습니다");
            //예약번호 출력
            String reservationNum = phoneNumber + day + roomNumber;
            System.out.println("예약번호:"+reservationNum);

            Customer customer = new Customer(name, phoneNumber, roomType, roomNuber, day, personNumber);
        } 
        //arr[호수][날짜] 

        else if(arr[FixRoomNumber][day-1] != null ){ //비어있지 않으면 빈 방 호수 출력
            System.out.println("예약이 불가능합니다.");
            if (roomType.equals("스탠다드룸")){
                for(int i=0; i<5; i++){
                    if(arr[i][day-1]==null) System.out.println((i+101)+"호 예약 가능");
                }
            }
            else if(roomType.equals("스위트룸")){
                for(int i=5; i<9; i++){
                    if(arr[i][day-1]==null) System.out.println((i+101)+"호 예약 가능");
                }
            }

        }


    public void cancel(){
        //예약번호 받음
        //해당 방 빈 방 처리
        System.out.print("예약번호를 입력하세요:");
        String reservationNum = sc.nextLine;

        //예약번호(전화번호+일자+객실번호)에서 객실번호와 일자 추출
        int phoneNumberLength = phoneNumber.length();
        int dayLength = Integer.toString(day).length();
        int cancelDay = Integer.parseInt(reservationNum.substring(phoneNumberLength,reservationNum.length()-3));
        int roomNum = Integer.parseInt(reservationNum.substring(phoneNumber+dayLength));

        int FixRoomNum = roomNum %10-1;
        arr[FixRoomNum][cancelDay-1] = 0;

        System.out.println("예약번호" + reservationNum + "의 취소가 완료되었습니다.");


    }

    public void checkout(){
         System.out.print("예약번호를 입력하세요:");
        String reservationNum = sc.nextLine;

        //예약번호(전화번호+일자+객실번호)에서 객실번호와 일자 추출
        int phoneNumberLength = phoneNumber.length();
        int dayLength = Integer.toString(day).length();
        int cancelDay = Integer.parseInt(reservationNum.substring(phoneNumberLength,reservationNum.length()-3));
        int roomNum = Integer.parseInt(reservationNum.substring(phoneNumber+dayLength));

        int FixRoomNum = roomNum %10-1;
        Room r = arr[FixRoomNum][cancelDay-1]
        arr[FixRoomNum][cancelDay-1] = 0;

        System.out.println("예약번호" + reservationNum + "의 체크아웃이 완료되었습니다.");
        r.showPrice();

        

    }
}
}