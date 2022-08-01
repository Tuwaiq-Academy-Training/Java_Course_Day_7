public class Staff extends Person{
private double pay;
private String school;

public Staff(String name,String address,double pay,String school){
    super(name,address);
    this.pay=pay;
    this.school=school;
}
public Staff(){
    super();
}

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    public double increasePay(double increase){
    return this.pay=(increase*pay/100);
    }

    @Override
    public String toString() {
        return super.toString()+ "pay=" + pay +
                ", school='" + school;
    }
}
