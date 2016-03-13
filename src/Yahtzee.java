public class Yahtzee {


    public int ones(int d1, int d2, int d3, int d4, int d5){
        int total = 0;

        if(d1 == 1){
            total++;
        }
        if(d2 == 1){
            total++;
        }
        if(d3 == 1){
            total++;
        }
        if(d4 == 1){
            total++;
        }
        if(d5 == 1){
            total++;
        }

        return total;
    }
}
