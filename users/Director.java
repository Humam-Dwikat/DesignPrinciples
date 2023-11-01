package users;

import java.util.ArrayList;
import java.util.List;

public class Director extends Staff{
    private List<Manager> managers;

    public Director(int id, int age, String name, Double hourly_rate) {
        super(id, age, name, hourly_rate);
        this.managers = new ArrayList<Manager>();
    }
    public void add_manager(Manager manager) {
        managers.add(manager);

    }
    public List<Manager> list_of_manager(){
        return managers;
    }

}
