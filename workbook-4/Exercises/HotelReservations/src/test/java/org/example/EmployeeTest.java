package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {



    @Test
    public void is_Total_Pay_Sum_Of_its_parts(){
        Employee jon = new Employee();
        jon.setPayRate(18.50);
        jon.setHoursWorked(1);
        jon.setTotalPay(18.50);
        assertEquals(jon.getTotalPay(), 18.50 );
    }

}