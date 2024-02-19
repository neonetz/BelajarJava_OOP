public class Player {
    //Kelas player untuk merepresentasikan pemain dalam game KecoakHunter
    private String name;
    private double balance;

    //Konstruktor otomatis menggunakan Intelij IDEA (alt+insert)
    public Player(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    //Getter and setter untuk name secara otomatis
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Getter and setter untuk balance secara otomatis
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Method untuk melakukan pembelian dalam game
    public void purchaseItem(Purchase purchase){
        //Mengambil harga item
        double totalPrice = purchase.totalPrice();
        //Perkondisian jika balance cukup atau tidak
        if(balance >= totalPrice){
            balance -= totalPrice;
            System.out.println(name  + " has purchased " + purchase.getAmount() + " " + purchase.getItem().getRune() + "= (s) for $" + totalPrice );
        } else{
            System.out.println("Insufficient balance to purchase" + purchase.getAmount() + " " + purchase.getItem().getRune() + "(s)");
        }

    }
}
