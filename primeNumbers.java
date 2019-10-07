public class primeNumbers {
    public void primeNumbersValue(int n){
        int flag=0;
        if(n==1||n==2){
            System.out.println("Not A prime Number");
        }
        if(n%2==0){
            System.out.println("Not a prime Number");
        }
        for(int i=0;i<=Math.sqrt(n);i+=2 ){
            if(n%i==0){
                System.out.println();
            }
        }
    }
    public static void main(String args[]){

    }
}
