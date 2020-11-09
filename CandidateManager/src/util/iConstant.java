package util;

public interface iConstant {

    // Special characters <([{\^-=$!|]})?*+.>
    // Refer: https://docs.oracle.com/javase/tutorial/essential/regex/literals.html

    String NAME = "^[A-Za-z ]+$";
    String PHONE = "^[0-9]{10,}$";
    String EMAIL = "^([\\w\\-\\.]+)@([\\w\\-\\.]+)\\.([a-zA-Z]{2,5})$";
    //String EMAIL = "([A-Za-z]+[0-9A-Za-z]+@[0-9A-Za-z]+(\\.[A-Za-z]+){1,3}$";
    String ADDRESS = "[A-Za-z0-9 ,\\-\\./]+$";
    String TEXT = "^[A-Za-z0-9 ,\\.]+$";
    String YES_NO = "^[yYnN]$";
}
