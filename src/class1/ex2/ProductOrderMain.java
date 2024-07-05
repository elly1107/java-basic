package class1.ex2;

public class ProductOrderMain {
    public static void main(String[] args){
        ProductOrder[] orders = new ProductOrder[3];
        ProductOrder order1 = new ProductOrder();
        order1.productName="1";
        order1.price=1000;
        order1.quantity=1;
        orders[0]=order1;

        ProductOrder order2= new ProductOrder();
        order2.productName="2";
        order2.price=2000;
        order2.quantity=2;
        orders[1]=order2;

        ProductOrder order3= new ProductOrder();
        order3.productName="3";
        order3.price=2000;
        order3.quantity=2;
        orders[2]=order3;

        int sum=0;
        for(ProductOrder o : orders){
            System.out.println(o.productName + " "+ o.price + " " + o.quantity);
            sum+=o.price*o.quantity;
        }
        System.out.println(sum);
    }
}
