package GroomEdu;

public class PrimeSummary {
    //sol1 1차원적인 방식 - 약수를 활용해서 나누어 보기 - 숫자 커질 수록 연산 안됨.

    public static void main(String[]args){

        System.out.println(getPrime(4));
    }
    public static int getPrime(int n){
        int cnt =0;//소수의 갯수
        // 예를 들어 4를 나누어본다.
     for(int num =2; num<=n; num++){
         boolean isPrime = true;
          //2,3,4를 돌리며
         for(int i =2; i<num; i++){
             if(num % i==0){
                 isPrime = false;
             }
         }
         if(isPrime){
             cnt +=1;
         }
     }
    return cnt;
    }
    //sol 2

    //에라토스테네스 체의 방식으로
    //2,4,6,8....지우고 3,6,9,12...지우고 4,8,12...지우고

    public static int getPrimeE(int n){
        int cnt =0;
        boolean[] check = new boolean[n+1];

        for(int i=2; i<=n; i++){
            //지워지지 않았으면 소수니까
            if(check[i] ==false){
                cnt++;
            }
            for(int j=i*2; j<=n; j+=i){
                check[j]=true;
            }
        }
        return cnt ;

    }
}
