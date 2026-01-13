package ch19_collections.testitem;

import java.util.*;

public class Meeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> meeting = new HashSet<>();
        List<String> meetList = new ArrayList<>();
        System.out.println("[ 종료 ] 라고 입력하면 프로그램을 종료합니다.");

        while (true){
            System.out.print("참석자 이름을 입력하세요 >>> ");
            String a = sc.next();
            if(a.equals("종료")){
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }else {
                meeting.add(a);
            }

        }
        System.out.println();
        System.out.println("---최종 참석자 명단---");
        meetList.addAll(meeting);
        for (String met : meetList){
            System.out.print(met);
            // 콤마 끝에거 못지움 나중에 깃허브 참고

        }
        System.out.println(meeting);

    }
}
