public class MainClass {
    public static void main(String[] args) {
        CardNumberValidator validator = new CardNumberValidator();
        CardNumberReader reader = new CardNumberReader();
        CardType cardType = new CardType();
        if(validator.validate(reader.cardNymberRead())){
            System.out.println("VALID\n" + cardType.getCardType(reader.cardNumber));
        }
        else {
            System.out.println("Invalid");
        }
    }
}
