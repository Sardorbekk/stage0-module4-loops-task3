package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber){
//(10-1)+(100-1)+(1000-1)
      int sum=0;
        for (int i=0;i<=lengthOfLastNumber;i++){
           sum= (int) (sum+ (Math.pow(10,i)-1));

        }
        System.out.println(sum);
}

}
