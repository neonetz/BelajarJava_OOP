public class Steam {
    private Games Game;
    private int Quantity;

    public Steam(Games game, int quantity) {
        Game = game;
        Quantity = quantity;
    }

    public Games getGame() {
        return Game;
    }

    public void setGame(Games game) {
        Game = game;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double totalPrice(){
        return Game.getPrice() * getQuantity();
    }
}
