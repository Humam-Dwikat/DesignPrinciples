package report;
import data_base.FakeDataBase;

public class ReportListOfStaff implements Report{
    private FakeDataBase data_base = FakeDataBase.get_instance();
    @Override
    public String  generate_report() {
        return "the all staff in the company :"+this.data_base.list_of_staff();
    }
}
