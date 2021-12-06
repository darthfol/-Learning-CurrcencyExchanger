package Shared;

import Enums.Decisions;

public class Communicats {
    private final String unexpectedErrorMsg = " Somthing goes wrong. Unexpected error";
    private final String optionsMsg = "If you want to EXIT, type '"+ Decisions.EXIT +"'" +
            " \nIf you want to convert type '"+Decisions.CONVERT +"'";
    private final String unknowOptionMsg = "Option is unknow, please try again";
    private final String goodbyeMsg = "Thank you, have a nice day good bye";


    public String getOptionsMsg(){return optionsMsg;}
    public String getUnknowOptionMsg(){return unknowOptionMsg;}
    public String getUnexpectedErrorMsg(){return unexpectedErrorMsg;}
    public String getGoodbyeMsg(){return goodbyeMsg;}
}
