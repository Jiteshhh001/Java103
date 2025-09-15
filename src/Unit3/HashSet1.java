package Unit3;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<>();
        HashSet<String> hs2 = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("n: ");
        int n = sc.nextInt();
        System.out.println("m: ");
        int m = sc.nextInt();

        System.out.println("hs1: ");
        for (int i = 0; i < n; i++) {
            hs1.add(sc.next());
        }
        System.out.println("hs2: ");
        for(int i=0;i<m;i++){
            hs2.add(sc.next());
        }

        hs1.remove(hs2);
        System.out.println(hs1);
        hs1.removeIf(str->str.contains("aa"));
        System.out.println(hs1);
    }
}
