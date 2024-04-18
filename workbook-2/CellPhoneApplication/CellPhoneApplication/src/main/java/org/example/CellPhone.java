package org.example;

public class CellPhone {
    int serialNumber;
    String model;
    String carrier;
    String phoneNumber;
    String owner;

    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }
    public CellPhone(int SerialNumber, String Model, String Carrier, String PhoneNumber, String Owner){
       this.serialNumber = SerialNumber;
       this.model = Model;
       this.carrier = Carrier;
       this.phoneNumber = PhoneNumber;
       this.owner = Owner;

    }
    public void setSerialNumber(int SerialNumber) {
      SerialNumber = serialNumber;

    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String dial(String PhoneNumber){
        return owner + "'s phone is calling " + PhoneNumber;
    }

    public static String display(CellPhone ownersPhone){
        return STR."Serial Number :  \{ownersPhone.serialNumber}\nModel : \{ownersPhone.model}\nCarrier : \{ownersPhone.carrier}\nPhone Number : \{ownersPhone.phoneNumber}\nOwner : \{ownersPhone.owner}";

    }
}
