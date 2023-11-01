package data_base;


import users.Staff;

import java.util.ArrayList;
import java.util.List;

public class FakeDataBase {
    private String type ;
    private static FakeDataBase instance = null;
    private static List<Staff> list_of_staff = null;


    public FakeDataBase(String type){
        this.type = type;
    }

    public static FakeDataBase get_instance(){
        if (instance == null) {
            //Double check locking
            synchronized (FakeDataBase.class) {
                if (instance == null) {
                    list_of_staff= new ArrayList<Staff>();
                    instance = new FakeDataBase("elastics-each");
                }
            }
        }
        return instance;
    }

    public void add_staff (Staff staff){
            list_of_staff.add(staff);
    }

    public List<Staff> list_of_staff(){
        return list_of_staff;
    }

    }
