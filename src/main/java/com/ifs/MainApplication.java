package com.ifs;

public class MainApplication {
    public static void main(String[] args) {
        Verifier verifier = new Verifier();
        ZipCodeProcessor processor = new ZipCodeProcessor(verifier);

        processor.process("80302");  // => "Thank you!  Your package will arrive soon."
        processor.process("2345678"); // => "The zip code you entered was the wrong length."
        processor.process("321");    // => "The zip code you entered was the wrong length."
        processor.process("12234");   // => "We're sorry, but the zip code you entered is out of our range."
    }
}
