import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardType {

    public String getCardType(String validCardNumber) {
        Pattern MasterCard = Pattern.compile("^5[1-5][0-9]{14}$");
        Matcher mastercard = MasterCard.matcher(validCardNumber);
        Pattern MasterCard1 = Pattern.compile("^2(22[1-9][0-9]{12}|2[3-9][0-9]{13}|[3-6][0-9]{14}|7[0-1][0-9]{13}|720[0-9]{12})$");
        Matcher mastercard1 = MasterCard1.matcher(validCardNumber);
        Pattern maestro = Pattern.compile("^(6759[0-9]{2})[0-9]{6,13}$");
        Matcher mstr = maestro.matcher(validCardNumber);
        Pattern maestro1 = Pattern.compile("^(50[0-9]{4})[0-9]{6,13}$");
        Matcher mstr1 = maestro1.matcher(validCardNumber);
        Pattern maestro2 = Pattern.compile("^5[6-9][0-9]{10,17}$");
        Matcher mstr2 = maestro2.matcher(validCardNumber);
        Pattern maestro3 = Pattern.compile("^6[0-9]{11,18}$");
        Matcher mstr3 = maestro3.matcher(validCardNumber);
        Pattern visa = Pattern.compile("^4([0-9]{12}|[0-9]{15})$");
        Matcher vsa = visa.matcher(validCardNumber);
        Pattern chinaUnionpay = Pattern.compile("^62[0-9]{14,17}$");
        Matcher unionpay = chinaUnionpay.matcher(validCardNumber);

        if (mastercard.matches() | mastercard1.matches()) {
            return validCardNumber + " Mastercard";
        } else if (mstr.matches() | mstr1.matches() | mstr2.matches() | mstr3.matches()) {
            return validCardNumber + " Maestro";
        } else if (vsa.matches()) {
            return validCardNumber + " Visa";
        } else if (unionpay.matches()) {
            return validCardNumber + " UnionPay";
        } else {
            return validCardNumber + " Unpopular card type";
        }

    }


}
