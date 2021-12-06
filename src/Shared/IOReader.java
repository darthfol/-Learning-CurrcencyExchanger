package Shared;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOReader {
    public String ReadFromInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
