package factorial_capsa_negra;

public class Factorial_capsa_negra {

    private static int factorial(int n){
    	
    	int res = 1;
    	
        if(n == 0 || n == 1){
            return 1;
        }
        
        for (int i = 2; i <= n; i++){
        	res = res + i;
        }
        
        return res;
        
    }

    public static void main(String[] args){
        System.out.println(factorial(15));
    }
}
