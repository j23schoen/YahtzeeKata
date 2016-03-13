public class Yahtzee {


    int[] inputDie;
    public Yahtzee(int d1, int d2, int d3, int d4, int d5) {
        inputDie = new int[5];
        inputDie[0] = d1;
        inputDie[1] = d2;
        inputDie[2] = d3;
        inputDie[3] = d4;
        inputDie[4] = d5;
    }

    public int ones(){
        int total = 0;

        for (int dice : inputDie) {
            if (dice == 1) {
                total++;
            }
        }

        return total;
    }

    public int twos(){
        int total = 0;

        for (int dice : inputDie) {
            if (dice == 2) {
                total += 2;
            }
        }

        return total;
    }

    public int threes(){
        int total = 0;

        for(int dice : inputDie){
            if(dice == 3){
                total += 3;
            }
        }

        return total;
    }

    public int fours(){
        int total = 0;

        for(int dice : inputDie){
            if (dice == 4){
                total += 4;
            }
        }

        return total;
    }

    public int fives(){
        int total = 0;

        for(int dice : inputDie){
            if (dice == 5){
                total += 5;
            }
        }

        return total;
    }

    public int sixes(){
        int total = 0;

        for(int dice : inputDie){
            if (dice == 6){
                total += 6;
            }
        }

        return total;
    }
}
