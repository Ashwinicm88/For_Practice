package For_Practice.Day_23;

public class Max_Achiev {
    public int theMaximumAchievableX(int num, int t) {
        int x=0;
        for(int i=0;i<=t;i++){
             x=num++;

        }
        return x+t;
    }
}
