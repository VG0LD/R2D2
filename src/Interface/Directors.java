package Interface;

public class Directors{
    public void force(Counter counter, int i) {
        String report = counter.report(i);
        System.out.println(report);
    }


}
