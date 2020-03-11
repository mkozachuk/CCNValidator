import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class CardNumberReader {
    String usersInputSting;
    String cardNumber = "";
    public String cardNymberRead(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (cardNumber.isEmpty()) {
            try {
                usersInputSting = reader.readLine();
                if(usersInputSting.length() != 16 || !usersInputSting.matches("\\d*")){
                    System.out.println("Incorrect Card Number");
                    System.out.println(usersInputSting);
                    usersInputSting = "";

                }
                else{
                    cardNumber = usersInputSting;
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                Logger.global.info("IOE in CardNumberReader");

            }
        }
        return cardNumber;
    }
}
