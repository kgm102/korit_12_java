package ch19_collections.testitem;

import java.util.*;

public class BookMapTeacher2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> bookInventory = new HashMap<>();
        bookInventory.put("Java프로그래밍 입문",2);
        boolean endOfProgram = false;
        boolean stockOption = false;
        String bookTitle;
        while(!endOfProgram) {
            System.out.println("--- 도서 재고 관리프로그램  ---");
            System.out.println("1. 도서추가\n2. 재고 수정\n3. 재고 목록\n4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1 :
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    bookTitle = sc.nextLine();
                    // 근데 기존에 있는 책인지 고려해야한다.
                    if(bookInventory.containsKey(bookTitle)) {  // true면 이미 있는 책
                        System.out.println("이미 재고에 있는 도서입니다.");
                    }else { // 일치하는 책이 없을때
                        System.out.println("재고 수량을 입력하세요 >>> ");
                        int stock = sc.nextInt();
                        bookInventory.put(bookTitle, stock);
                        System.out.println(bookTitle + " 도서가 " + stock + " 권 추가되었습니다.");
                    }
                    break;
                case 2 :
                    System.out.print("수량을 변경할 도서명을 입력하세요 >>> ");
                    bookTitle = sc.nextLine();
                    if(bookInventory.containsKey(bookTitle)) {  // true면 이미 있는 책
                        System.out.print("--- 옵션을 선택해주세요---\n1. 입고\n2. 출고\n옵션을 선택하세요 >>> ");
                        while (!stockOption){
                            int option2 = sc.nextInt();
                            switch (option2) {
                                case 1 :
                                    System.out.println("입고 수량을 입력해주세요 >>> ");
                                    int temp = sc.nextInt();
                                    int stock = bookInventory.get(bookTitle) + temp;
                                    System.out.println(bookTitle + " 도서가 " + temp + " 권 추가되어 " + stock + " 권으로 변경되었습니다.");
                                    bookInventory.put(bookTitle, stock);
                                    stockOption = true;
                                    break;
                                case 2:
                                    System.out.println("출고 수량을 입력해주세요 >>> ");
                                    while (true) {
                                        int temp2 = sc.nextInt();
                                        if (bookInventory.get(bookTitle) - temp2 >= 0) {
                                            System.out.print("잘못된 수량입니다 출고 수량을 다시 입력해주세요. : ");
                                        } else {
                                            int stock2 = bookInventory.get(bookTitle) - temp2;
                                            System.out.println(bookTitle + " 도서가 " + temp2 + " 권 출고되어 " + stock2 + " 권으로 변경되었습니다.");
                                            bookInventory.put(bookTitle, stock2);
                                            stockOption = true;
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }   // 이상의 코드에서의 추가 수정 사항 : 책이 팔리면 내가 -1 로 입력해야 함.
                    }else {
                        System.out.println("해당 도서가 재고에 없습니다.");
                    }
                    break;
                case 3 :
                    Set<String> bookTitleSet = bookInventory.keySet();  // 책 제목들만 모아서 Set으로 만들었습니다.
                    List<String> bookTitles = new ArrayList<>();    // 근데 Set은 .get()이 안되니까 list 선언하고
                    bookTitles.addAll(bookTitleSet);                // Set의 element들을 list로 옮겼습니다.
                    for(String book : bookTitles) {
                        System.out.println("도서명 : " + book + ", 현재 재고 : " + bookInventory.get(book));
                    }
                    break;
                case 4 :
                    System.out.println("프로그램을 종료합니다.");
                    endOfProgram = true;
                    break;      // case의 break;는 switch 문만 빠져나오고 while문을 빠져나오지 않기 때문에
//                  return;     // 65, 66 번 라인이 둘 다 있어야 합니다.
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}