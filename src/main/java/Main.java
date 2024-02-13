// tabuada de um numero usando scanner e recursividade
// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número para ver sua tabuada: ");
    int multiplicando = scanner.nextInt();
    // imprimindo a tabuada
    imprimirTabuada(multiplicando, 0);
  }

  static void imprimirTabuada(int multiplicando, int multiplicador) {
    // tabuada apenas até 10
    if (multiplicador <= 10) {
      System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));
      imprimirTabuada(multiplicando, multiplicador + 1);
    }

  }
}