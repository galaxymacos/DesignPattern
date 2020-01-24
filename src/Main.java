import template.GenerateReportTask;
import template.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {
        TransferMoneyTask task = new TransferMoneyTask();
//        task.execute();
        task.execute();

        GenerateReportTask task2 = new GenerateReportTask();
        task2.execute();

    }
}
