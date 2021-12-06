import Enums.Decisions;
import Shared.Communicats;
import Shared.IOReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CurrencyReader {
    public boolean runProgram = true;
    private boolean enumFind = false;

    private String text;
    private final Communicats communicats;
    private final IOReader ioReader;
    public CurrencyReader(){
        communicats= new Communicats();
        ioReader = new IOReader();
    }

    public void AskForDecision() throws IOException{
        System.out.println(communicats.getOptionsMsg());

        text = ioReader.ReadFromInput();
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
    public boolean DoConversion() {
        return runProgram && enumFind;
    }
}
