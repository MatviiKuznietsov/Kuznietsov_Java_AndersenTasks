package Task2;

public class InputName {
    public String getAddSign() {
        return addSign;
    }

    public void setAddSign(String addSign) {
        this.addSign = addSign;
    }

    public String getNegativeSign() {
        return negativeSign;
    }

    public void setNegativeSign(String negativeSign) {
        this.negativeSign = negativeSign;
    }

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        setInputName(inputName);
    }

    private String addSign = "Hello, ";
    private String negativeSign = "There is no such name";

    private String inputName;

    public InputName(String inputName) {
        this.inputName = inputName;
    }

    public void returnSign (){
        if(getInputName().equals("Vecheslav")){
            System.out.println(getAddSign().concat(inputName));
        }else {
            System.out.println(getNegativeSign());
        }
    }
}
