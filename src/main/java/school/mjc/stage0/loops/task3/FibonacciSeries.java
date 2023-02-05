package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f1=0,f2=1;
        for (int i=0;i<lastFibonacci;i++){
            System.out.println(f1);
            int f3=f1+f2;
            f1=f2;
            f2=f3;
        }
    }
}
