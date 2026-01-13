package ch19_collections;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.Scanner;
@Data
public class FieldTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 명의 학생이 수학 여행지를 입력하시겠습니까?");
        int a = sc.nextInt();
        String[] arr = new String[a];
        List<String> fieldTrips = new ArrayList<>();
        Set<String> finalFieldTrips = new HashSet<>();
        sc.nextLine();
        for(int i = 0; i < a; i++){
            System.out.print((i+1) + " 번 학생의 수학 여행지를 입력하세요 >>> ");
//          String b = sc.next();
            String b = sc.nextLine();
            fieldTrips.add(b);
        }
        System.out.println();
        for(int i = 0; i < a; i++){
            System.out.println((i+1) + " 번 학생의 후보지 : " + fieldTrips.get(i));
        }
        System.out.println();
//      System.out.println(fieldTrips);
        finalFieldTrips.addAll(fieldTrips);
//      System.out.println(finalFieldTrips);
        System.out.println("수학 여행 후보지는");
        for (String arr3 : finalFieldTrips){
            System.out.println(arr3);
        }
        System.out.println("입니다.");

        }
    }

