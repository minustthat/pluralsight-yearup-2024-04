package org.example;
import java.util.*;

import static org.example.CellPhone.display;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {





    public static  void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
CellPhone iphone = new CellPhone();
iphone.setSerialNumber(332445);
iphone.setModel("XR");
iphone.setCarrier("T-Mobile");
iphone.setOwner("Lil SweatPants");
iphone.setPhoneNumber("323-655-4780");

CellPhone customerPhone = new CellPhone();
customerPhone.setPhoneNumber("3234056676");
Scanner scanner = new Scanner(System.in);

        System.out.println(display(iphone));
        System.out.println(iphone.dial(customerPhone.phoneNumber));
 CellPhone flipPhone = new CellPhone(1111, "Flip", "Sprint", "1800-GotMail", "Yours Truly");
 System.out.println(display(flipPhone));





    }

}