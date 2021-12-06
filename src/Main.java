import Shared.Communicats;

import java.io.IOException;

public class Main {

    public static void main(String []args) throws IOException {
       CurrencyReader currencyReader = new CurrencyReader();
       CurrencyConverter currencyConverter = new CurrencyConverter();
        Communicats communicats = new Communicats();
       System.out.println("Welcome in this ");
       while(currencyReader.runProgram){
           currencyReader.AskForDecision();
           currencyConverter.Convert(currencyReader.DoConversion());
       }
       System.out.println(communicats.getGoodbyeMsg());
    }
}
