public class FireControlSystem2 extends FireControlSystem1 {
    public FireControlSystem2(){}

    @Override
    public void fireOneRound(Round gunRound) {
        if ((gunRound.getRoundType().equals("APDS")) || (gunRound.getRoundType().equals("HE"))) {
            gunRound.fired();
        } else {
            System.out.println("Invalide round type!");
        }
    }
}
