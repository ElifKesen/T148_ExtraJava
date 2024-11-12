package day01;

public class R10_11 {

    public static void main(String[] args) {

    /*50-----
    Youtube video sayfasının urlsinde yer alan video id'sini
    return eden bir method yazınız :

     ÖRNEKLER
    youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg")
    ID : XPEr1cArWRg

    youtubeId("https://youtu.be/BCDEDi5gDPo")
    ID : BCDEDi5gDPo

    youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4")
    ID : vxP3bY-XxY4
    */

        // Test URL'leri
        System.out.println("ID: " + youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg"));
        System.out.println("ID: " + youtubeId("https://youtu.be/BCDEDi5gDPo"));
        System.out.println("ID: " + youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4"));

    }

    public static String youtubeId(String url) {
        String videoId = ""; // ID’yi burada saklayacağız

        // 1. URL, "youtube.com/watch?v=" içeriyorsa
        if (url.contains("youtube.com/watch?v=")) {
            // "v=" ifadesinden sonraki kısmı alalım
            int videobaslangic = url.indexOf("v=") + 2; // "v=" den sonra başlar
            videoId = url.substring(videobaslangic, videobaslangic + 11); // 11 karakter alıyoruz
        }
        // 2. URL, "youtu.be/" içeriyorsa
        else if (url.contains("youtu.be/")) {
            // ".be/" ifadesinden sonraki kısmı alalım
            int videobaslangic = url.indexOf(".be/") + 4; // ".be/" den sonra başlar
            videoId = url.substring(videobaslangic, videobaslangic + 11); // 11 karakter alıyoruz
        }
        // 3. URL, "youtube.com/watch?" ve "&v=" içeriyorsa
        else if (url.contains("youtube.com/watch?") && url.contains("&v=")) {
            // "&v=" ifadesinden sonraki kısmı alalım
            int videobaslangic = url.indexOf("&v=") + 3; // "&v=" den sonra başlar
            videoId = url.substring(videobaslangic, videobaslangic + 11); // 11 karakter alıyoruz
        }

        return videoId; // Sonucu döndürüyoruz
    }

  /*
    public static String youtubeId(String url) {
        String videoId = null;

        // Farklı URL yapılarına göre regex desenleri
        String[] patterns = {
                "v=([a-zA-Z0-9_-]+)",       // youtube.com/watch?v=videoId
                "youtu.be/([a-zA-Z0-9_-]+)", // youtu.be/videoId
                "&v=([a-zA-Z0-9_-]+)"        // youtube.com/watch?t=4m40s&v=videoId
        };

        // Her bir deseni sırayla deneyelim
        for (String pattern : patterns) {
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(pattern).matcher(url);
            if (matcher.find()) {
                videoId = matcher.group(1); // Eşleşen ilk grubu al
                break; // İlk eşleşmede döngüden çık
            }
        }
        return videoId;
    }



    public static String youtubeId(String url) {
        String videoId = null;

        // Eğer URL "youtube.com/watch?v=" içeriyorsa
        if (url.contains("youtube.com/watch?v=")) {
            int start = url.indexOf("v=") + 2; // "v=" sonrası başlar
            videoId = url.substring(start, start + 11); // 11 karakter uzunluğunda alırız
        }
        // Eğer URL "youtu.be/" içeriyorsa
        else if (url.contains("youtu.be/")) {
            int start = url.indexOf(".be/") + 4; // ".be/" sonrası başlar
            videoId = url.substring(start, start + 11); // 11 karakter uzunluğunda alırız
        }
        // Eğer URL "youtube.com/watch?" ve "&v=" içeriyorsa
        else if (url.contains("youtube.com/watch?") && url.contains("&v=")) {
            int start = url.indexOf("&v=") + 3; // "&v=" sonrası başlar
            videoId = url.substring(start, start + 11); // 11 karakter uzunluğunda alırız
        }

        return videoId;
    }

     */
}
