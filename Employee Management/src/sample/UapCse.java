package sample;

import java.io.Serializable;
import java.util.ArrayList;

public class UapCse implements Serializable{
    ArrayList<Employee> employees=new ArrayList<>();
    private void addNewEmployee(Employee e){
        employees.add(e);
    }
    void SalariedEmployee(String n,String id,String deg,double sale){
        SalariedEmployee s=new SalariedEmployee(n,id,deg,sale);
        addNewEmployee(s);
    }
    void HourlyEmployee(String n,String id,String deg,double hr,int hw){
        HourlyEmployee h=new HourlyEmployee(n,id,deg,hr,hw);
        addNewEmployee(h);
    }
    void CommissionEmployee(String n,String id,String deg,double per,double s){
        CommissionEmployee c=new CommissionEmployee(n,id,deg,per,s);
        addNewEmployee(c);
    }
    Employee findEmployee(String id){
        for(int i=0;i<employees.size();i++){
            Employee e=employees.get(i);
            if(e.getId().equals(id)){
                return e;
            }

        }
        System.out.println("Not Found!");
        return null;
    }
    void increaseSalary(String id,double amt)throws InvalidSalaryException{
        Employee e=findEmployee(id);
        if(e!=null)
            e.increaseSalary(amt);
    }
    double  getSalary(String id){
        double a = findEmployee(id).getSalary();
        return a;
    }
    public void display(String id){
        Employee e=findEmployee(id);
        if(e!=null){
            e.display();
        }
    }
  public void display(){
        for(int i=0;i<employees.size();i++){
            Employee e=employees.get(i);
            e.display();
        }
  }
}
