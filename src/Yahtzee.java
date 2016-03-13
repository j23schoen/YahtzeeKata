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

    public Yahtzee(){

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

    public int pairs(){
        int highTotal = 0;

        for(int i = 0; i < inputDie.length; i++){

            for(int m = i + 1; m < inputDie.length; m++){

                if(inputDie[i] == inputDie[m]){

                    if(inputDie[i] + inputDie[m] > highTotal){
                        highTotal = inputDie[i] + inputDie[m];
                    }
                }
            }
        }

        return highTotal;
    }

    public int twoPairs(){
        int total = 0;
        int count = 0;

        for(int i = 0; i < inputDie.length; i++){

            for(int m = i + 1; m < inputDie.length; m++){

                if(inputDie[i] == inputDie[m]){
                    total += inputDie[i] + inputDie[m];
                    count++;
                }
            }
        }

        if(count > 1){
            return total;
        }
        else {
            return 0;
        }
    }

    public int threeOfAKind(int d1, int d2, int d3, int d4, int d5){
        int total = 0;
        int[] array = new int[6];
        array[d1-1]++;
        array[d2-1]++;
        array[d3-1]++;
        array[d4-1]++;
        array[d5-1]++;

        for(int i = 0; i != 6; i++){
            if(array[i] >= 3){
                total = (i+1) * 3;
            }
        }

        return total;
    }

    public int fourOfAKind(int d1, int d2, int d3, int d4, int d5){
        int total = 0;
        int[] array = new int[6];
        array[d1-1]++;
        array[d2-1]++;
        array[d3-1]++;
        array[d4-1]++;
        array[d5-1]++;

        for(int i = 0; i != 6; i++){
            if(array[i] >= 4){
                total = (i+1) * 4;
            }
        }

        return total;
    }

}
