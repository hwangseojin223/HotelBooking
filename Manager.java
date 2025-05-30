import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.*;

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

        String roomType;
        int roomNumber = -1;

        // 객실 타입 입력
        do{
            System.out.print("객실 타입을 입력하세요(스탠다드룸, 스위트룸): ");
            roomType = sc.nextLine();
            if (roomType.equals("스탠다드룸") || roomType.equals("스위트룸")) break;
            else System.out.print("잘못된 객실 타입입니다."); 

        }while(true);
        
        if(roomType.equals("스탠다드룸")){
            while(true){
                System.out.print("객실 번호를 입력하세요(101~105): ");
                int min = 101;
                int max = 105;
                roomNumber = Integer.parseInt(sc.nextLine());

                if((roomNumber>=min)&&(roomNumber<=max)) break;
                else System.out.println("101~105 사이로 입력하세요");
            }   
        }
        else if(roomType.equals("스위트룸")){
            while(true){
                System.out.print("객실 번호를 입력하세요(106~109): ");
                int min = 106;
                int max = 109;
                roomNumber = Integer.parseInt(sc.nextLine());

                if((roomNumber>=min)&&(roomNumber<=max)) break;
                else System.out.println("106~109 사이로 입력하세요");
            }   
        }

        System.out.print("예약일자를 입력하세요: ");
        int day = Integer.parseInt(sc.nextLine());
        String formattedDay = String.format("%02d", day);

        System.out.print("예약인원을 입력하세요: ");
        int personNumber = Integer.parseInt(sc.nextLine());

        int FixRoomNumber = roomNumber - 101;
        if(arr[FixRoomNumber][day-1] == null){ //비어있는 방이면 예약 완료
            if(roomType.equals("스탠다드룸")) arr[FixRoomNumber][day-1] = new StandardRoom(new Customer(name, phoneNumber, roomType, roomNumber, day, personNumber));
            else arr[FixRoomNumber][day-1] = new SuiteRoom(new Customer(name, phoneNumber, roomType, roomNumber, day, personNumber));


            System.out.println("예약이 완료되었습니다");
            //예약번호 출력
            String reservationNum = phoneNumber + formattedDay + roomNumber;
            

            Customer customer = new Customer(name, phoneNumber, roomType, roomNumber, day, personNumber);
            customer.show();
            System.out.println("예약번호:"+reservationNum);
        } 
        //arr[호수][날짜] 

        else if(arr[FixRoomNumber][day-1] != null ){ //비어있지 않으면 빈 방 호수 출력
            System.out.println("예약이 불가능합니다.");
            boolean roomSelected = false;
            
            while (!roomSelected) {
                if (roomType.equals("스탠다드룸")){
                    for(int i=0; i<5; i++){
                        if(arr[i][day-1] == null) System.out.println((i+101)+"호 예약 가능");
                    }
                    System.out.print("다시 객실 번호를 입력하세요(101~105): ");
                }
                else if (roomType.equals("스위트룸")){
                    for(int i=5; i<9; i++){
                        if(arr[i][day-1] == null) System.out.println((i+101)+"호 예약 가능");
                    }
                    System.out.print("다시 객실 번호를 입력하세요(106~109): ");
                }
            
                roomNumber = Integer.parseInt(sc.nextLine());
                FixRoomNumber = roomNumber - 101;
            
                if (arr[FixRoomNumber][day-1] == null) {
                    roomSelected = true; // 예약 가능한 방이 선택되었을 때 루프 종료
                } else {
                    System.out.println("이미 예약된 방입니다. 다시 선택해주세요.");
                }
            }
            
            // 예약 처리
            if(roomType.equals("스탠다드룸")) arr[FixRoomNumber][day-1] = new StandardRoom(new Customer(name, phoneNumber, roomType, roomNumber, day, personNumber));
            else arr[FixRoomNumber][day-1] = new SuiteRoom(new Customer(name, phoneNumber, roomType, roomNumber, day, personNumber));
            
            System.out.println("예약이 완료되었습니다");
            // 예약번호 출력
            String reservationNum = phoneNumber + day + roomNumber;
                
            
            Customer customer = new Customer(name, phoneNumber, roomType, roomNumber, day, personNumber);
            customer.show();
            System.out.println("예약번호:"+reservationNum);
        }
    }


    public void cancel(){
        //예약번호 받음
        //해당 방 빈 방 처리
        System.out.print("예약번호를 입력하세요:");
        String reservationNum = sc.nextLine();

    try{

        //예약번호(전화번호8+일자2+객실번호3)에서 객실번호와 일자 추출
        int roomNum = Integer.parseInt(reservationNum.substring(reservationNum.length() - 3));
        int cancelDay = Integer.parseInt(reservationNum.substring(8,10));
        int FixRoomNum = roomNum - 101;

        if(arr[FixRoomNum][cancelDay-1] == null){
            System.out.println("존재하지 않는 예약번호입니다.");
            return;
        }

        if (FixRoomNum < 0 || FixRoomNum >= arr.length || cancelDay < 1 || cancelDay > 31) {
        System.out.println("유효하지 않은 예약번호입니다.");
        return;
    }

        arr[FixRoomNum][cancelDay-1] = null;

        System.out.println("예약번호" + reservationNum + "의 취소가 완료되었습니다.");

    }catch (NumberFormatException e) {
    	System.out.println("올바른 예약번호를 입력하세요.");
	}catch (Exception e) {
		System.out.println("올바른 예약번호를 입력하세요.");
	}

        
    }

    public void checkout(){
        System.out.print("예약번호를 입력하세요:");
        String reservationNum = sc.nextLine();

        //예약번호(전화번호+일자+객실번호)에서 객실번호와 일자 추출
        int phoneNumberLength = 8;
        int dayLength = 2;
        int cancelDay = Integer.parseInt(reservationNum.substring(phoneNumberLength,phoneNumberLength + dayLength));
        int roomNum = Integer.parseInt(reservationNum.substring(reservationNum.length() - 3));

        int FixRoomNum = roomNum - 101;

        Room r = arr[FixRoomNum][cancelDay-1];
        if (r instanceof StandardRoom){
            ((StandardRoom) r).showPrice();
        } else if (r instanceof SuiteRoom){
            ((SuiteRoom) r).showPrice();
        }
        else {
            System.out.println("존재하지 않는 예약번호입니다.");
            return;
        }
        arr[FixRoomNum][cancelDay-1] = null;
        System.out.println("예약번호" + reservationNum + "의 체크아웃이 완료되었습니다.");

    }

    public void save(){
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream("room.txt"));
            oos.writeObject(arr);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(oos != null){
                try {
                    oos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void load(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("room.txt"));
            arr = (Room[][]) ois.readObject(); 

            System.out.println("저장된 예약 내용:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] != null) {
                        arr[i][j].show();  // 예약된 객실이 있으면 show() 메서드를 호출하여 정보 출력
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
           if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}