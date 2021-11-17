package AtividadeAM;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questao2 {

    public static void main(String args[]) throws IOException {
        FileInputStream arq = new FileInputStream("C:\\Users\\rapha\\Desktop\\Atividade AM\\AtividadeAM\\input2.txt");
        InputStreamReader leri = new InputStreamReader(arq);
        BufferedReader buffer = new BufferedReader(leri);
        String l = buffer.readLine();
        String input1 = l;
        l = buffer.readLine();
        String[] inp1sep = input1.split(" ");
        String[] input = new String[Integer.parseInt(inp1sep[1])];
        int i = -1;
        while (l != null) {
            i = i + 1;
            input[i] = l;
            l = buffer.readLine();
        }

        int[] Vendedores = new int[Integer.parseInt(inp1sep[0])];
        int[] Desempenho = new int[Integer.parseInt(inp1sep[0])];
        int fim = 1;
        for (int j = 0; j < Vendedores.length; j++) {
            try {
                Vendedores[j] = Integer.parseInt(input[j]);
                input[j] = "0";
            } catch (Exception v) {
                System.out.println("Faltam ligações");
            }
        }
        while (fim == 1) {
            fim = 0;
            for (int j = 0; j < Vendedores.length; j++) {
                Vendedores[j] = Vendedores[j] - 1;
                if (Vendedores[j] == 0) {
                    Desempenho[j] = Desempenho[j] + 1;
                }
            }
            for (int j = 0; j < Vendedores.length; j++) {
                for (int k = 0; k < input.length; k++) {
                    if (Vendedores[j] == 0 && Integer.parseInt(input[k]) != 0) {
                        try {
                            Vendedores[j] = Integer.parseInt(input[k]);
                            input[k] = "0";
                        } catch (Exception v) {
                            System.out.println("Faltam ligações");
                        }
                    }
                }
            }
            for (int j = 0; j < Vendedores.length; j++) {
                if (Vendedores[j] > 0) {
                    fim = 1;
                }
            }
        }
        for (int j = 0; j < Vendedores.length; j++) {
            System.out.println(j + 1 + " " + Desempenho[j]);
        }
    }
}