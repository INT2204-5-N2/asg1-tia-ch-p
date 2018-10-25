/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 *
 * @author Tu Nguyen
 */
public class Translator {
    /**
     * API Online của Google, nguồn stackoverflow
     * @param langFrom ngôn ngữ đến
     * @param langTo ngôn ngữ đi
     * @param text câu cần dịch
     * @return chuỗi sau khi dịch
     * @throws IOException 
     */
    public static String translate(String langFrom, String langTo, String text) throws IOException {
        // INSERT YOU URL HERE
    	
        String urlStr = "https://script.google.com/macros/s/AKfycbygkst-kly4nZfV_4HBSQhHahDuAI0O488S4LIHxFAYLPtFLDJk/exec" +
                "?q=" + URLEncoder.encode(text, "UTF-8") +
                "&target=" + langTo +
                "&source=" + langFrom;
        URL url = new URL(urlStr);
        StringBuilder response = new StringBuilder();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
        }
        return response.toString();
    }
}
