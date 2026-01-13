package ch19_collections.testitem;

import java.util.*;

public class BookMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> bookMap1 = new HashMap<>();

        while (true){
            System.out.print("--- 도서 재고 관리 프로그램 ---\n1. 도서 추가 \n2. 재고 수정\n3. 재고 목록\n4. 종료\n");
            System.out.print("메뉴를 선택하세요 >>> ");
            int inputNum = sc.nextInt();

            switch (inputNum){

                case 1 :
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    sc.nextLine();
                    String addBook = sc.nextLine();
                    if(bookMap1.containsKey(addBook)){
                        System.out.println("이미 재고에 있는 도서입니다.");
                    }else{
                        System.out.print("재고 수량을 입력하세요 >>> ");
                        int bookNum = sc.nextInt();
                        bookMap1.put(addBook,bookNum);
                        System.out.println(addBook + " 도서가 " + bookNum + " 권으로 수정되었습니다..");
                    }
                    break;

                case 2 :
                    System.out.print("재고를 변경할 도서명을 입력하세요 >>> ");
                    sc.nextLine();
                    String changeBook = sc.nextLine();
                    if(!bookMap1.containsKey(changeBook)){
                        System.out.println("해당 도서가 재고에 없습니다.");
                    }else{
                        System.out.print("새로운 재고 수량을 입력하세요 >>> ");
                        int addBookNum = sc.nextInt();
                        bookMap1.put(changeBook,addBookNum);
                        System.out.println(changeBook + " 도서가 " + addBookNum + " 권 추가되었습니다.");
                    }
                    break;
                    case 3 :
                    System.out.println("--- 현재 재고 목록 ---");
                    if(bookMap1.isEmpty()){
                        System.out.println("재고가 없습니다.");
                    }else {
                        for(Map.Entry<String, Integer> entry : bookMap1.entrySet()) {
                            System.out.println(
                                    "도서명 : " + entry.getKey() +
                                            ", 재고 수량 : " + entry.getValue() + " 권"
                            );
                        }
                    }
                    break;
                case 4 :
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 메뉴입니다.");
                }
            }
        }
    }

