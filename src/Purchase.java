public class Purchase {
    //Kelas purchase untuk merepresentasikan pembelian product dalam game
    private Item item;
    private int amount;

    //Konstruktor yang dibuat secara otomatis
    public Purchase(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    //Getter and setter item
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    //Getter and setter amount
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    //Menghitung harga dari item jika dibeli lebih dari sama dengan 1
    public double totalPrice(){
        return item.getBattlePoint()* amount;
    }
}
