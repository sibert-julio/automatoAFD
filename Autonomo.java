
package autonomo;

import java.util.Scanner;

public class Autonomo {
    static int Cont;
    static char Palavra[];

    public static void main(String[] args) {
        Autonomo Aut = new Autonomo();
        String Sentenca;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Digite aqui: ");
        Sentenca = Entrada.nextLine();
        Autonomo.Palavra = Sentenca.toCharArray();
        Aut.Iniciar();

    }

    public static void Iniciar() {
        Cont = 0;
        q0();
    }

    public static void q0() {
        if (Cont < Palavra.length) {
            if (Palavra[Cont] == 'a') {
                Cont++;
                q1();

            } else {
                qerro();
            }
        }
    }

    public static void q1() {
        if (Cont < Palavra.length) {
            if (Palavra[Cont] == 'b') {
                Cont++;
                qf();

            } else {
                qerro();
            }
        }
    }

    public static void qf() {
        if (Cont < Palavra.length) {
            if (Palavra[Cont] == 'c') {
                Cont++;
                qf();
            } else if (Palavra[Cont] == 'b') {
                Cont++;
                qf();
            }
        } else {
            System.out.println("Aceito Com Sucesso , Arigato!");
        }
    }

    public static void qerro() {
        System.err.println("Não Aceito!");
    }
}
