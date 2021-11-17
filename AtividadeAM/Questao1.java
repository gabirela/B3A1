package AtividadeAM;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questao1 {

    public static void main(String args[]) throws IOException {
        FileInputStream arq = new FileInputStream("C:\\Users\\rapha\\Desktop\\Atividade AM\\AtividadeAM\\input.txt");
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
        String[] fatp = input[2].split(" ");
        int Tmedio = 0;
        int Tfatia = 0;
        for (int k = 0; k < fatp.length; k++) {
            Tmedio += Integer.parseInt(fatp[k]);
        }
        Tmedio = Tmedio / Integer.parseInt(input[0]);

        while (Tmedio > 0) {
            for (int k = 0; k < fatp.length; k++) {
                Tfatia += Integer.parseInt(fatp[k]) / Tmedio;
            }
            if (Tfatia == Integer.parseInt(input[0])) {
                System.out.println(Tmedio);
                break;
            } else {
                Tmedio = Tmedio - 1;
                Tfatia = 0;
            }
        }
    }
}
