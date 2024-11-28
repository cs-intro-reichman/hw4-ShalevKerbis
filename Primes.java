public class Primes {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[input + 1];
        isPrime[0] = false;
        isPrime[1] = false;
        int j = 2;
        int sumOfPrime = 0;
        System.out.println("Prime numbers up to " + input + ":");

        //setting all elements with index > 1 to true
        for (int x = 2 ; x <= input ; x++){
            isPrime[x] = true;
        }
        while (j * j <= input){
            if (isPrime[j]){
                int i = j * j;
                while (i <= input){
                    isPrime[i] = false;
                    i = i + j;
                }
            }
            j++;
        }

        for (int i = 0 ; i <= input ; i++){
            if (isPrime[i] == true){
                System.out.println(i);
                sumOfPrime++;
            }
        }
        System.out.println("There are " + sumOfPrime + " primes between 2 and " + input + " (" +  (int) (100 * (((double) sumOfPrime / input))) + "% are primes)");
    }
}