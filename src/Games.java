public class Games {

    private String GameGame;
    private double price;

    public Games(String gameGame, double price) {
        GameGame = gameGame;
        this.price = price;
    }

    public String getGameGame() {
        return GameGame;
    }

    public void setGameGame(String gameGame) {
        GameGame = gameGame;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

