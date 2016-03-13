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

        for(int i = 0; i < inputDie.length; i++){
            if(inputDie[i] == 1){
                total++;
            }
        }

        return total;
    }

    public int twos(){
        int total = 0;

        return total;
    }
}
