package bai19.Optional.Crawl_tintuc;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CrawlNew {
    public static void main(String[] args) {
        try {
            URL url = new URL(" https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content  =scanner.next();
            scanner.close();
//            content = content.replaceAll("\\R+", "");
            System.out.println(content);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
