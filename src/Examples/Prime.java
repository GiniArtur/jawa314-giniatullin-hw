package Examples;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    public static void main(String[] args) {

    }


        public List<Integer> getFirstPrimes ( int count){
            List<Integer> primes = new ArrayList<>();
            if (count > 0) {
                primes.add(2);
            }
            for (var i = 3; primes.size() < count; i += 2) {
                if (isPrime(i, primes)) {
                    primes.add(i);
                }
            }
            return primes;
        }

        private boolean isPrime ( int n, List<Integer > primes){
            for (var i = 0; i < primes.size(); i++) {
                var prime = primes.get(i);
                if (prime * prime > n) {
                    return true;
                }
                if (n % prime == 0) {
                    return false;
                }
            }
            return true;
        }

}
