import java.util.*;

class camelcase
 {
    static String toCamelCase(String str) {
        int n = str.length();
        char ch[] = str.toCharArray();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0)
                ch[i] = Character.toUpperCase(ch[i]);
            if (ch[i] == ' ') {
                c++;
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
                continue;
            } else {
                ch[c++] = ch[i];
            }
        }
        return String.valueOf(ch, 0, c);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
   
        String str = sc.nextLine();
        System.out.println(toCamelCase(str));
        sc.close();
    }
}
