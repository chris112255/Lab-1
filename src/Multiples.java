public class Multiples {
    public static void main(String[] args) {
        // multiples of 3 and 5 under 1000
        int biggest_value = 999;
        int multiple1 = 3;
        int multiple2 = 5;
        int multiples = 0;

        while(biggest_value > 0){
            if(biggest_value % multiple1 == 0 || biggest_value % multiple2 == 0){
                multiples += 1;
            }
            biggest_value -= 1;
        }
        System.out.println(multiples);
    }
}
