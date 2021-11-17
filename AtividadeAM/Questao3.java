package AtividadeAM;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questao3 {
    public static void main(String args[]) throws IOException {
        FileInputStream arq = new FileInputStream("C:\\Users\\rapha\\Desktop\\Atividade AM\\AtividadeAM\\input3.txt");
        InputStreamReader leri = new InputStreamReader(arq);
        BufferedReader buffer = new BufferedReader(leri);
        String l = buffer.readLine();
        String[] input = new String[3];
        int i = -1;
        while (l != null) {
            i = i + 1;
            input[i] = l;
            l = buffer.readLine();
        }
        String[] inp1 = input[0].split(" ");
        String[] inp2 = input[1].split(" ");
        int[] inp11 = new int[inp1.length];
        int[] inp22 = new int[inp2.length];
        for (int j = 0; j < inp1.length; j++) {
            inp11[j] = Integer.parseInt(inp1[j]);
            inp22[j] = Integer.parseInt(inp2[j]);
        }
        if (inp22[0] >= inp11[0] && inp22[0] <= inp11[2] && inp22[1] >= inp11[1] && inp22[1] <= inp11[3]) {
            System.out.println("1");
        } else {
            if (inp22[2] >= inp11[0] && inp22[2] <= inp11[2] && inp22[3] >= inp11[1] && inp22[3] <= inp11[3]) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
