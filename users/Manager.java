package users;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Staff{
    private List<Staff> staff;
    public Manager(int id, int age, String name, Double hourly_rate) {
        super(id, age, name, hourly_rate);
        this.staff = new ArrayList<Staff>();
    }
    public void add_staff(Staff staff) {
        this.staff.add(staff);
    }
    public List<Staff> list_of_staff(){
        return staff;
    }
}
