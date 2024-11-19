package baekCoding.before_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * SHA-256 해시값 출력
 *
 * -> 해시값은 byte 배열로 생성되며, 16진수 문자열로 변환해야 읽을수 있는 형태로 출력할 수 있다.
 * -> 해시값을 16진수로 표현하는것이 일반적인 관례이다.
 * -> 16진수 문자열 길이가 1인 경우 "0" 을 추가하여 항상 2자리로 표현하도록 한다.
 *      -> 2자리로 표현하지 않으면 해시값이 왜곡될 수 있다. (ex. 0x0A -> 0xA)
 *      -> 일관성 있는 출력을 위해 2자리로 표현하는것이 좋다.
 */
public class Sha256_10930 {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        // SHA-256
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        byte[] digest = instance.digest(s.getBytes(StandardCharsets.UTF_8)); // SHA-256 해시알고리즘으로 해시값 계산
        StringBuffer sb = new StringBuffer();

        // 해시값을 16진수 문자열로 변환
        for (int i = 0; i < digest.length; i++) {
            String hex = Integer.toHexString(0xff & digest[i]); // 정수를 16진수 문자열로 변환
            if(hex.length() == 1) sb.append('0');
            sb.append(hex);
        }

        System.out.println(sb.toString());
    }
}
