package clase;

import java.util.ArrayList;
import java.util.HashMap;

public class Salon {
    boolean paturi[] = new boolean[4];

    public Salon() {
        this.paturi[0] = true;
        this.paturi[1] = true;
        this.paturi[2] = false;
    }

    public int getPatLiber() {
        for(int i = 0; i < paturi.length; i++){
            if(paturi[i] == true){
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int index){
        paturi[index] = false;
    }

}
