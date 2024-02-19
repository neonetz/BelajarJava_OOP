public class MainKecoakHunter {
    //Di misalkan ini adalah game benama KecoakHunter
    //Disini player ingin membeli pedang sword of Baygon
    public static void main(String[] args) {
        //Membuat object item
        Item sword = new Item("Sword of Baygon",30.0);
        //Membuat object Purchase
        Purchase swordPurchase = new Purchase(sword,1);
        //Membuat object player
        Player player1 = new Player("Asep",100);
        //Melakukan pembelian
        player1.purchaseItem(swordPurchase);
        System.out.println("Remaining Balance = $" + player1.getBalance());
    }
}
