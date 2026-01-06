package ch12_inheritance.product;

public class ProductMain {
    public static void main(String[] args) {
        Item item = new Item("일반 상품", "일반 카테고리");
        System.out.println("이 상품은 " + item.getName() + "입니다");

        Product product1 = new Product("전자제품","가전제품",10000  ,10);
        System.out.println("------------------");
        product1.setCategory("백색 가전 제품");
        System.out.println("해당 제품은 " + product1.getCategory() + "입니다.");
    }
}
