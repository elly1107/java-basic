package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문 수량: ");
        int number=scanner.nextInt(); // 1만 받아들이고 /n은 다음 scanner에 남는다. 따라서 밑에 입력
        scanner.nextLine();
        ProductOrder[] orders = new ProductOrder[number];

        for(int i=0; i<number; i++){
            System.out.println(i+1+"번째 주문 정보를 입하세요.");
            System.out.print("상품명: ");
            String ProductName=scanner.nextLine();
            System.out.print("가격: ");
            int price=scanner.nextInt();
            System.out.print("수량: ");
            int quantity=scanner.nextInt();
            scanner.nextLine(); //입력 버퍼를 비우기 위해.
            orders[i]=createOrder(ProductName, price, quantity);
        }
        printOrders(orders);
        getTotalAmount(orders);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.ProductName=productName;
        order.price=price;
        order.quantity=quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for(ProductOrder o: orders){
            System.out.println(o.ProductName+" "+o.price+" "+o.quantity);
        }
    }

    static void getTotalAmount(ProductOrder[] orders){
        int totalAmount=0;
        for(ProductOrder o: orders){
            totalAmount+=o.price*o.quantity;
        }
        System.out.println("sum: "+totalAmount);
    }


}
