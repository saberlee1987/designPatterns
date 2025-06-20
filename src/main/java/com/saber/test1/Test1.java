package com.saber.test1;

import java.io.File;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// IR 860170000000355025287000
public class Test1 {
    public static void main(String[] args) {
        System.out.println("Hello World @@@ ");
      //  downloadFiles();
//        var sorting = new BubbleSort();
//        var sorting = new SelectionSort();
//        var sorting = new InsertionSort();
//        var sorting = new MergeSort();
//        var sorting = new QuikSort();
//        int[] arrays = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        System.out.println("before sorting ===> "+ Arrays.toString(arrays));
//        sorting.sort(arrays);
//        System.out.println("after sorting ===> "+ Arrays.toString(arrays));

    }

    private static void downloadFiles() {
        List<String> downloadUrls = getDownloadUrls();
        System.out.println("start download files");
        int i = 26;
        for (String downloadUrl : downloadUrls) {
            downloadFile(downloadUrl,"python_"+i+".mp4");
            i=110;
        }
        System.out.println("end download files");
    }

    private static void downloadFile(String url, String fileName) {
        System.out.println("start download "+fileName);
        try {
            HttpClient httpClient = HttpClient.newBuilder()
                    .connectTimeout(Duration.ofMillis(30_000))
                    .build();
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(url))
                    .build();
            httpClient.send(request,
                    HttpResponse.BodyHandlers.ofFile(Path.of("python/".concat(fileName))));
        System.out.println("end download "+fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<String> getDownloadUrls() {
        List<String> downloadUrls = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("Toplearn_Course_Python.txt"))) {
            while (scanner.hasNext()) {
                downloadUrls.add(scanner.nextLine());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return downloadUrls;
    }
}