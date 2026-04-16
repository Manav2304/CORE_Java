package oops;

public class Encapsulation {
    public static void main(String [] args){
        Emp e1 = new Emp();
        Emp e2 = new Emp();



        e1.setEmpId(3);
        e1.setEmpName("Manav");
        e2.setEmpName("patel");
        e2.setEmpId(1);
        System.out.println(e1.getEmpName()+" "+ e2.getEmpName());
        System.out.println(e1.getEmpId()+" " +  e2.getEmpId());

    }
}

class Emp{
   private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}