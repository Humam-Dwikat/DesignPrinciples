import data_base.FakeDataBase;
import report.Report;
import report.ReportListOfStaff;
import users.Director;
import users.Manager;
import users.Staff;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        staff
        Staff staff1 = new Staff(1,20,"ahmad",6.5);
        Staff staff2 = new Staff(2,30,"zef",6.5);
        Staff staff3 = new Staff(3,60,"lara",6.5);

//        manager
        Manager manager1 = new Manager(55,52,"lara",5.4);
        Manager manager2 = new Manager(5,22,"sara",5.4);

//        director
        Director director1 = new Director(32,23,"stef",2.4);

        Report report1 = new ReportListOfStaff();


        FakeDataBase database = FakeDataBase.get_instance();
//        add staff under manager1
        manager1.add_staff(staff1);

//        store all data in database
        database.add_staff(staff1);
        database.add_staff(staff2);
        database.add_staff(staff3);
        database.add_staff(manager1);

        System.out.println(report1.generate_report());


    }
}
