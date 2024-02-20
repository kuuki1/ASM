package PY00047.LAB6;
public class Data {
    public Boolean isEmail(String str) {
    String pattern = "\\w+@\\w+(\\.\\w+){1,2}";
    return str.matches(pattern);
}

public Boolean isPhone(String str) {
    String pattern = "0\\d{8}";
    return str.matches(pattern);
}

public Boolean isCMND(String str) {
    String pattern = "\\d{10}";
    return str.matches(pattern);
}
}
