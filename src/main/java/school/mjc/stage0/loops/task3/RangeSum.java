package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum=0;
        int a=0;
        for (int i=firstBoarder;i<=secondBoarder;i++){
            sum=sum+i;

        }
        System.out.println(sum);
    }
}
