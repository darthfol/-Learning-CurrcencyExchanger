package Shared;

import Enums.Currency;
import Enums.Decisions;

public class Communicats {
    private final String unexpectedErrorMsg = " Somthing goes wrong. Unexpected error";
    private final String optionsMsg = "If you want to EXIT, type '"+ Decisions.EXIT +"'" +
            " \nIf you want to convert type '"+Decisions.CONVERT +"'";
    private final String unknowOptionMsg = "Option is unknow, please try again";
    private final String goodbyeMsg = "Thank you, have a nice day good bye";
    private final String ammount0Msg = "Amount cannot be 0, please type correct amount";
    private final String ammountMsg = "Please type amount of currency you want to calculate:";
    private final String currencyMsg = "Please select currency you used "
            + Currency.ZLOTY+" "
            + Currency.DOLAR+" "
            + Currency.EURO+" "
            + Currency.FUNT;


    public String getOptionsMsg(){return optionsMsg;}
    public String getUnknowOptionMsg(){return unknowOptionMsg;}
    public String getUnexpectedErrorMsg(){return unexpectedErrorMsg;}
    public String getGoodbyeMsg(){return goodbyeMsg;}

    public String getAmmout0Msg() {return ammount0Msg;}

    public String getAmountMsg() {return ammountMsg; }

    public String getCurrencyMsg() {return currencyMsg;}
}
