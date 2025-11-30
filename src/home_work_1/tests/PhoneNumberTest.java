package home_work_1.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneNumberTest {
    @Test
    public void createPhoneNumber(){
        Assertions.assertEquals("(123) 456-7890", home_work_1.PhoneNumber.createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
        Assertions.assertEquals("(555) 555-5555", home_work_1.PhoneNumber.createPhoneNumber(new int[]{5,5,5,5,5,5,5,5,5,5}));
        Assertions.assertEquals("(098) 765-4321", home_work_1.PhoneNumber.createPhoneNumber(new int[]{0,9,8,7,6,5,4,3,2,1}));
        Assertions.assertEquals("ERROR", home_work_1.PhoneNumber.createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0,1}));//
        Assertions.assertEquals("ERROR", home_work_1.PhoneNumber.createPhoneNumber(new int[]{}));//

    }
}
