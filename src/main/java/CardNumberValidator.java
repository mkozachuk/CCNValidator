public class CardNumberValidator implements Validator {

    private String validCardNumber;

    private int cardNumberSum;
    private char number;
    private int num;
    private int numberForSum;
    private boolean isValid;

    public boolean validate(String cardNumber) {
        for(int i = 0; i < cardNumber.length(); i++){
            number = cardNumber.charAt(i);
            num = number - '0';
            if(i % 2 != 0){
                numberForSum = num;
            }
            else {
                numberForSum = num * 2;
            }
            if(numberForSum > 9){
                numberForSum -= 9;
            }
            cardNumberSum += numberForSum;
        }
        isValid = (cardNumberSum % 10 == 0);

        if(isValid){
            validCardNumber = cardNumber;
        }
        return isValid;

    }
}
