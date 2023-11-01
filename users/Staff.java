package users;

import java.util.HashMap;
import java.util.Map;

public class Staff {
    private int id;
    private int age;
    private String name;
    private Double hourly_rate;
    private Map<String, Integer> completed_hours_per_Month;
    public Staff(int id, int age, String name,Double hourly_rate){
        this.id = id;
        this.age = age;
        this.name = name;
        this.hourly_rate = hourly_rate;
        this.completed_hours_per_Month = new HashMap<>();
    }

    public int get_id() {
        return this.id;
    }
    public void set_id(int id){
        this.id = id;
    }

    public String get_name() {
        return this.name;
    }
    public void set_name(String name){
        this.name = name;
    }

    public int get_age() {
        return this.age;
    }
    public void set_age(int age){
        this.age = age;
    }

    public double get_hourly_rate() {
        return this.hourly_rate;
    }
    public void set_hourly_rate(Double hourly_rate){
        this.hourly_rate = hourly_rate;
    }

    public Map<String, Integer> get_completed_hours_per_month() {
        return this.completed_hours_per_Month;
    }
    public void set_completed_hours_per_Month(String month, Integer hours){
        this.completed_hours_per_Month.put(month, hours);
    }
    @Override
    public String toString(){
        return  "-id: "+this.id + " -age: "+ this.age+ " -name: "+
                this.name+ " -hourly_rate: " +this.hourly_rate +
                " -completed_hours_per_month: " + this.completed_hours_per_Month+"\n";
    }
}
