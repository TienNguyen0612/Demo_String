package codegym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoJavaApplication {
    static String str1 = "rik";
    static String str2 = "xxxkriaaa";
    static String str3 = "xxxkrai";

    public static void main(String[] args) {
        SpringApplication.run(DemoJavaApplication.class, args);
        System.out.println(checkString(str1, str2));
        System.out.println(checkString(str1, str3));


//        System.out.println(compareString(str1, str4));
    }
    public static boolean checkString(String str1, String str2) {
//        int count = 0;
//        for (int i = 0; i < str2.length(); i++) {
//            boolean flag = false;
//            for (int j = 0; j < str1.length(); j++) {
//                if (str2.charAt(i) == str1.charAt(j)) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag) {
//                count++;
//            } else {
//                count = 0;
//            }
//            if (count == str1.length()) {
//                return true;
//            }
//        }
//        return false;

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                if (str2.charAt(i) == str1.charAt(j)) {
                    str1 = str1.replace(str1.charAt(j), '1');
                    str2 = str2.replace(str2.charAt(i), '1');
                }
            }
        }
        return str2.contains(str1);
    }

//    public static boolean compareString(String str1, String str2) {
//        for (int i = 0; i < str1.length(); i++) {
//            for (int j = 0; j < str2.length(); j++) {
//                if (str1.charAt(i) == str2.charAt(j)) {
//                    str1 = str1.replace(str1.charAt(i), '1');
//                    str2 = str2.replace(str2.charAt(j), '1');
//                }
//            }
//        }
//        return str2.equals(str1);
//    }

}
