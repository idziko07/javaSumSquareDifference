package pl.suma.kwadratu;

public class Square {

    public int 	sumSquareDifference(int number){
        int sumSquare = 0 , sum = 0, difference;


        for (int i = 1; i <= number ; i++) {
            sumSquare += Math.pow(i,2);

            sum += i;
        }

        sum = (int) Math.pow(sum,2);

        difference = sum - sumSquare;

        return difference;
    }
}
