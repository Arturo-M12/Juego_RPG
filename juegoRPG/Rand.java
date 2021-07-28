import java.util.Random;

public class Rand {
    public static boolean enemyAtack() {
        Random rd = new Random();
        int randNum;
        for(int i = 0; i < 1; i++){
            randNum = rd.nextInt(100);
            if(randNum > 40 && randNum < 60) return true;
        }
        return false;
    }
}
