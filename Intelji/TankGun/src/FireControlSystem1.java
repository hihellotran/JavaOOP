public class FireControlSystem1 {
    public FireControlSystem1(){}

    public void fireOneRound(Round gunRound){
        if (gunRound.getRoundType().equals("ADPS")){
            gunRound.fired();
        }
        else {
            System.out.println("Invalid round type");
        }

    }
}
