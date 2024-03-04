import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String pal = br.readLine();
        boolean result = true;

        for (int i = 0; i < pal.length() / 2; i++) {
            if (pal.charAt(i) != pal.charAt(pal.length() - 1 - i)) {
                result = false;
                break;
            }
        }

        if (result == false) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
        }
    }

