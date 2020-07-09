package com.codedifferently.stayready;
public class Main {
    public static Double fromUSToEuro(Double USDollars){
        return USDollars * (0.88/1.0);
    }
    public static Double fromEuroToUS(Double euros){
        return euros * (1.13/1.0);
    }
    public static Double fromEuroToPound(Double euros){
        return euros * (0.9/1.0);
    }
    public static Double fromPoundToRupee(Double pounds){
        return pounds * (94.57/1.0);
    }
    public static Double fromRupeeToCanadianDollar(Double rupee){
        return rupee * (0.018/1.0);
    }
    public static Double fromCanadianDollarToSingaporeDollar(Double canDollars){
        return canDollars * (1.03/1.0);
    }
    public static Double fromSingaporeDollarToFranc(Double singDollars){
        return singDollars * (0.67/1.0);
    }
    public static Double fromFrancToRinggit(Double francs){
        return francs * (4.55/1.0);
    }
    public static Double fromRinggitToYen(Double ringgits){
        return ringgits * (25.22/1.0);
    }
    public static Double fromYenToRenminbi(Double yens){
        return yens * (0.065/1.0);
    }
}