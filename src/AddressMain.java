import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddressMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Address> address = new ArrayList<Address>();

        while (true) {
            System.out.println("================주소록 메뉴=========================");
            System.out.println("1.입력 2.출력 3.수정 4.삭제 5.검색 9.종료");
            System.out.println("=================================================");
            System.out.println("메뉴를 입력하세요.");

            int menu = sc.nextInt();


            switch (menu) {
                case 1: //입력
                    System.out.println("이름을 입력하세요.");
                    String name = sc.next();
                    System.out.println("나이를 입력하세요.");
                    int age = sc.nextInt();
                    System.out.println("사는곳을 입력하세요.");
                    String home = sc.next();
                    System.out.println("연락처를 입력하세요.");
                    String phone = sc.next();

                    /*입력을 다 받은 후*/
                    if(/* 검색했을때 정보가 있다면 */) {
                        System.out.println("중복된 정보가 있습니다.");
                    }

                    if(/* 검색을 했을때 없어서 등록을 한후 검색해서 결과가 나온다면 */) {
                        System.out.println("등록되었습니다");
                    }


                    break;

                case 2: //출력
                    if(address.size() <= 0) {
                        System.out.println("등록된 연락처가 없습니다.");
                    }
                    for(int i= 0; i<address.size(); i++) {
                        System.out.println((i+1)+ ". "+address.get(i).toString());
                    }
                    break;
//                    System.out.println("[ㄱ 으로 시작하는 명단]");
//                    System.out.println("[ㄴ 으로 시작하는 명단]");
//                    System.out.println("[ㄷ 으로 시작하는 명단]");
//                    System.out.println("[ㄹ 으로 시작하는 명단]");
//                    System.out.println("[ㅁ 으로 시작하는 명단]");
//                    System.out.println("[ㅂ 으로 시작하는 명단]");
//                    System.out.println("[ㅅ 으로 시작하는 명단]");
//                    System.out.println("[ㅇ 으로 시작하는 명단]");
//                    System.out.println("[ㅈ 으로 시작하는 명단]");
//                    System.out.println("[ㅊ 으로 시작하는 명단]");
//                    System.out.println("[ㅋ 으로 시작하는 명단]");
//                    System.out.println("[ㅍ 으로 시작하는 명단]");
//                    System.out.println("[ㅌ 으로 시작하는 명단]");
//                    System.out.println("[ㅎ 으로 시작하는 명단]");

                case 3: //수정
                    System.out.println("수정할 이름을 입력하세요.");
                    if(address.size() <= 0) {
                        System.out.println("등록된 연락처가 없습니다.");
                    } else {
                        for(int i = 0; i<address.size(); i++) {
                            System.out.println((i+1)+ ". "+address.get(i).toString());
                        }

                    }
                    break;

                case 4: //삭제
                    System.out.println("삭제할 이름을 입력하세요.");
                    if (address.size() <= 0) {
                        System.out.println("등록된 연락처가 없습니다.");
                    } else {

                    }
                    break;

                case 5: //검색
                    System.out.println("검색할 이름을 입력하세요.");
                    break;

                case 9: //완료
                    System.out.println("종료합니다");
                    System.exit(1);
            }
        }
    }
}
