package Interface;

public class MyCounter implements Counter{
    @Override
    public String report(int countOfMonths) {
        return "Report for " + countOfMonths + " months";
    }
}
