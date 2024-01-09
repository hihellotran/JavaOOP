public class Round {
    int calibre;
    String roundType;

    public Round(){}

    public Round(int caliber, String round_type){
        this.calibre = caliber;
        this.roundType = round_type;
        System.out.println("checking a tank gun round " + calibre + " mm");
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public String getRoundType() {
        return roundType;
    }

    public void setRoundType(String roundTypeype) {
        this.roundType = roundType;
    }

    protected void fired(){
        System.out.println("===> Fire a tank gun round " + roundType + " " + calibre + " mm");
    }
}
