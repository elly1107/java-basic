package ref.ex;

import java.awt.color.ICC_ColorSpace;

public class ProductOrderMain2 {
    public static void main(String[] args){
        ProductOrder[] orders = new ProductOrder[2];
        orders[0]=createOrder("1",1000,1);

        orders[1]=createOrder("2",2000,2);

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
