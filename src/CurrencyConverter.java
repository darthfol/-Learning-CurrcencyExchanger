import Enums.Currency;
import Shared.Communicats;
import Shared.IOReader;

import java.io.IOException;

public class CurrencyConverter {

    private Double moneyAmountA;
    private Currency moneyCurrencyA;
    private Double moneyAmountB;
    private Currency moneyCurrencyB;

    private final IOReader ioReader;
    private final Communicats communicats;
    public CurrencyConverter(){
        ioReader = new IOReader();
        communicats = new Communicats();
    }

    public void Convert(Boolean doConvert){
        if(doConvert){
            // wybierasz pierwszą walutę
            try {
                getValue(moneyAmountA,moneyCurrencyA);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                getValue(moneyAmountB,moneyCurrencyB);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    private boolean getValue(Double moneyAmount, Currency moneyCurrency)throws IOException {
        try{
            System.out.println(communicats.getAmountMsg());
            moneyAmount = Double.parseDouble(ioReader.ReadFromInput());
            while(moneyAmount == 0){
                System.out.println(communicats.getAmmout0Msg());
                moneyAmount = Double.parseDouble(ioReader.ReadFromInput());
            }
        } catch (IOException e){
            System.out.println(communicats.getUnknowOptionMsg());
            return false;
        }

        try {
            System.out.println(communicats.getCurrencyMsg());
            moneyCurrency = Currency.valueOf(ioReader.ReadFromInput());
        } catch (IllegalArgumentException e){
            System.out.println(communicats.getUnknowOptionMsg());
            return false;
        }
        return true;
    }
    // wyświwietl conwersje
    // zatwierdzenie
    // wykonaj konwersje
    // wyświetl wynik

}
