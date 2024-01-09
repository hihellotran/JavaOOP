public class RoundLoader {
    private final Round [] tray = new Round[20];//khay chứa đạn
    private int numRounds = 0; // số lượng đạn có trong khay đạn

    public RoundLoader(){
        System.out.println("Auto Round Loader is activated!");
    }

    public void chargeRounds(Round[] tankRounds){ //Nạp đạn từ ngoài vào khay đạn

        for (int i = numRounds; i<tray.length; i++){
            this.tray[i] = tankRounds[i];
            System.out.println("* Charging a round " + tankRounds[i].getRoundType()+ " " + tankRounds[i].getCalibre() + " mm");
        }
        numRounds+= tankRounds.length;
        System.out.println(numRounds + " tank rounds are charged!");
    }

    public Round loadOneRound(){
        numRounds--;
        System.out.println("A round " + tray[numRounds].roundType + " " +
               tray[numRounds].getCalibre() + " mm" + " is loaded. There are " + numRounds + " round(s)." )  ;
        // Nạp một viên đạn trong khay đạn lên nòng đại bác
        return tray[numRounds];
    }

}
