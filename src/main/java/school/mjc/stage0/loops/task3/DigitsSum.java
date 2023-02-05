package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
       int sum=0;
       if (t>0) {
           for (int i = 10; i < t; i = i * 10) {
               int a = t / i % 10;
               sum = sum + a;
           }
           System.out.println(sum + 1);
       }
       else {
           for (int i = 1; i > t; i = i * 10) {
               int a = -(t / i % 10);
               sum=sum+a;
               if (a==0){
                   break;
               }
           }
           System.out.println(sum);



       }
    }
}
