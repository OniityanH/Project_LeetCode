/* import java.util.Base64;

public class Codec {
    
    String encodeUrl;
    String decodedUrl;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        encodeUrl = Base64.getUrlEncoder().encodeToString(longUrl.getBytes());
        System.out.println(encodeUrl);
        return encodeUrl;
    }

    
    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        byte[] decodedBytes = Base64.getUrlDecoder().decode(encodeUrl);
        decodedUrl = new String(decodedBytes);
        System.out.println(decodedUrl);
        return decodedUrl;
    }
}


// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
 */ 