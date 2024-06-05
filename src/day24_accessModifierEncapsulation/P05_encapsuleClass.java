package day24_accessModifierEncapsulation;

public class P05_encapsuleClass {
    private String stuName="not assign ";
    private String schName="AKIL Koleji";
    public String schAdress;
    private String PhoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getSchName() {
        return schName;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }




}
