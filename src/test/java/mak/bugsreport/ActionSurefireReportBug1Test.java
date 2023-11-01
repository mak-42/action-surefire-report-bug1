package mak.bugsreport;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActionSurefireReportBug1Test {

    @Test
    public void test1(){
        String expectedString =  "value";  
        assertEquals(expectedString, "value"); 
    }
}
