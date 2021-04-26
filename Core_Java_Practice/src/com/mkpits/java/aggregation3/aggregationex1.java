package com.mkpits.java.aggregation3;

public class aggregationex1 {
    public static void main(String[] arg) {
        Employee emp = new Employee();
        Address adr = new Address();
        adr.city = "nagpur";
        adr.state = "maharashtra";
        adr.pincode = 4444;
        emp.getdata(11, "ekta", adr);
        emp.showdata();

    }

}
