package com.codedifferently.stayready;
import org.junit.Assert;
import org.junit.Test;
public class MainTest {
    //
    // Exchange rates gotten from google conversion calculator
    // Not Tariq's rates
    //
    @Test
    public void usToEuroTest(){
        // Given
        Double input = 1.00; // representing number of US Dollars
        Double expected = 0.88; // representing number of euros
        // When
        Double actual = Main.fromUSToEuro(input);
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void euroToUSTest(){
        // Given
        Double input = 1.00; // // representing number of euros
        Double expected = 1.13; // representing number of US Dollars
        // When
        Double actual = Main.fromEuroToUS(input);
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void euroToPoundTest(){
        // Given
        Double input = 1.00; // representing number of euros
        Double expected = 0.9; // representing number of pounds
        // When
        Double actual = Main.fromEuroToPound(input);
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void poundToRupeeTest(){
        // Given
        Double input = 1.00; // representing number of pounds
        Double expected = 94.57; // representing number of rupees
        // When
        Double actual = Main.fromPoundToRupee(input);
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void rupeeToCanDollarsTest(){
        // Given
        Double input = 1.00; // representing number of rupees
        Double expected = 0.018; // representing number of Canadian Dollars
        // When
        Double actual = Main.fromRupeeToCanadianDollar(input);
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void canDollarsToSingDollarsTest(){
        // Given
        Double input = 1.00; // representing number of Canadian Dollars
        Double expected = 1.03; // representing number of Singapore Dollars
        // When
        Double actual = Main.fromCanadianDollarToSingaporeDollar(input);
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void singDollarsToFrancsTest(){
        // Given
        Double input = 1.00; // representing number of Singapore Dollars
        Double expected = 0.67; // representing number of Swiss Francs
        // When
        Double actual = Main.fromSingaporeDollarToFranc(input);
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void francsToRinggitTest(){
        // Given
        Double input = 1.00; // representing number of Swiss Francs
        Double expected = 4.55; // representing number of Malaysian Ringgit
        // When
        Double actual = Main.fromFrancToRinggit(input);
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void ringgitToYenTest(){
        // Given
        Double input = 1.00; // representing number of Malaysian Ringgit
        Double expected = 25.22; // representing number of Japanese Yen
        // When
        Double actual = Main.fromRinggitToYen(input);
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void yenToYuanRenminbiTest(){
        // Given
        Double input = 1.00; // representing number of Japanese Yen
        Double expected = 0.065; // representing number of Chinese Yuan Renminbi
        // When
        Double actual = Main.fromYenToRenminbi(input);
        // Then
        Assert.assertEquals(expected, actual);
    }
}