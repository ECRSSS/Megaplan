package nnglebanov.megaplan.task;

public class WomansWay {
    private static double wayLength;
    private static boolean toWork;

    public static double calculate(double way,int iteration) {
        toWork=true;
        wayLength=way;
        double tempWay=way;
        for(int i=0;i<iteration;i++) {
            if (toWork) {
                tempWay=tempWay-wayLength/(i+1);
                toWork=!toWork;
            }else {
                tempWay=tempWay+wayLength/(i+1);
                toWork=!toWork;
            }
        }
        return wayLength-tempWay;
    }

}
