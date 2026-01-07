package ch13_abstraction.abstract_classes;

public class Main {
    public static void main(String[] args) {
        TableFactory tableFactory1 = new TableFactory();
        tableFactory1.upgrade("아이패드 프로 13인치 8세대");
        tableFactory1.setName("애플 태블릿 공장");
        tableFactory1.setName("구글 태블릿 공장");
        System.out.println("현재 공장은 "+ tableFactory1.getName() +"으로 변경되었습니다.");
        tableFactory1.produce("구글 태블릿");
        tableFactory1.manage();
        tableFactory1.upgrade("구글  태블릿  10인치 2세대");
        Factory factory2 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(model + "컴퓨터를 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("컴퓨터 공장을 관리합니다.");
            }
        };
        factory2.setName("삼성 컴퓨터 공장");
        factory2.showInfo();


    }
}
