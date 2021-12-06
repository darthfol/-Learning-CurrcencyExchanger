import Enums.Decisions;
import Shared.Communicats;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CurrencyReader {
    public boolean runProgram = true;
    private boolean enumFind = false;

    private BufferedReader reader;
    private String text;
    private Communicats communicats;
    private CurrencyConverter currencyConverter;

    public CurrencyReader(){
        communicats= new Communicats();
        currencyConverter = new CurrencyConverter();
    }

    public void AskForDecision() throws IOException{
        System.out.println(communicats.getOptionsMsg());
        reader = new BufferedReader(new InputStreamReader(System.in));
        text = reader.readLine();
        ChooseOption(text);
    }
    private void ChooseOption(String text){
        try{
            Decisions enText = Decisions.valueOf(text);
            switch (enText){
                case EXIT:
                    runProgram = false;
                    enumFind = true;
                    break;
                case CONVERT:
                    runProgram = true;
                    enumFind = true;
                    break;

                default:
                    runProgram = true;
                    enumFind = false;
                    System.out.println(communicats.getUnknowOptionMsg());
                    break;
            }
        } catch (IllegalArgumentException e){
            runProgram = true;
            enumFind = false;
            System.out.println(communicats.getUnknowOptionMsg());
        }


    }
    public String ReturnText(){ return text;}

    public boolean DoConversion() {
        return runProgram && enumFind;
    }
}
