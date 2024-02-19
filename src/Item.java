public class Item {
    //Kelas untuk mereprsentasikan item
    private String rune;
    private double battlePoint;


    //Konstruktor yang dibuat secara otomatis
    public Item(String rune, double battlePoint) {
        this.rune = rune;
        this.battlePoint = battlePoint;
    }

    //Getter and setter rune
    public String getRune() {
        return rune;
    }

    public void setRune(String rune) {
        this.rune = rune;
    }

    //Getter and setter battlePoint
    public double getBattlePoint() {
        return battlePoint;
    }

    public void setBattlePoint(double battlePoint) {
        this.battlePoint = battlePoint;
    }
}
