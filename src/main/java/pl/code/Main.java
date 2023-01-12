package pl.code;

import org.jsoup.Jsoup;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String variable = "nowy";
        System.out.println(Jsoup.connect("https://app.zajavka.pl").get().title());

    }
}
