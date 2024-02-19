public class GamesApp {
    public static void main(String[] args) {

        Games firstgame = new Games("Zelda",2000);
        Steam firstItem= new Steam(firstgame,2);
        System.out.println("Nama Product yang anda beli = " + firstItem.getGame().getGameGame() );
        System.out.println("Jumlah Barang yang anda beli = " + firstItem.getQuantity());
        System.out.println("Total harga game anda = "+ firstItem.totalPrice());
    }
}
