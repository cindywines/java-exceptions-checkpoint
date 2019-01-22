package com.ifs;

public class MainApplication {
    public static void main(String[] args) {
        Verifier verifier = new Verifier();

        verifier.verify("80302");         // doesn't throw anything

        verifier.verify("232323232323");  // throws java.lang.Exception "ERRCODE 21: INPUT_TOO_LONG"

        verifier.verify("232");           // throws java.lang.Exception "ERRCODE 22: INPUT_TOO_SHORT"

        verifier.verify("10012");         // throws java.lang.Exception "ERRCODE 27: NO_SERVICE"
    }
}
