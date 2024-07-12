package access.ex;

public class ShoppingCart {
    private Item[] items=new Item[10];
    private int itemCount=0;

    public void addItem(Item item){
        if(itemCount>=items.length){
            System.out.println("장바구니 가득 참");
            return;
        }
            items[itemCount]=item;
            itemCount++;
    }

    public void displayItems(){
        for(int i=0; i<itemCount; i++){
            Item item=items[i];
            System.out.println("상품명: "+item.getName()+", 가격: "+item.getTotalPrice());
        }
        System.out.println("전체 가격: "+calculateTotalPrice());
    }

    private int calculateTotalPrice(){
        int sum=0;
        for(int i=0; i<itemCount; i++){
            Item item=items[i];
            sum+=item.getTotalPrice();
        }
        return sum;
    }

}
