public class Reduce {
    public static void main(String[] args) {
        // starting with a number n, if n is even divide it by 2. If n is odd, subtract 1. Repeat.

        int start = 100;
        int steps = 0;

        while(start > 0){
            if(start % 2 == 0){
                start = start / 2;
            }
            else{
                start -= 1;
            }
            steps += 1;
        }

        System.out.println(steps);
    }
}
