package cidade;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cidade {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        p1.nome = "Maria";
        p1.altura = 1.60;
        p1.idade = 32;
        p1.sexo = 'F';
        System.out.println("Os dados da pessoa 1 foram: \n" +
                "\n Nome: " + p1.nome + 
                "\n Idade: " + p1.idade + 
                "\n Altura: " + p1.altura + 
                "\n Sexo: " + p1.sexo);
        
        //Entrada de dados com JOptionPane
        p2.nome = JOptionPane.showInputDialog(null, 
                "Digite seu nome: ", 
                "Informações", 
                JOptionPane.DEFAULT_OPTION);
        
        String dataTemp = JOptionPane.showInputDialog(null, 
                "Digite sua idade: ", 
                "Informações", 
                JOptionPane.DEFAULT_OPTION);
        p2.idade = Byte.parseByte(dataTemp);
        
        dataTemp = JOptionPane.showInputDialog(null, 
                "Digite sua altura: ", 
                "Informações", 
                JOptionPane.DEFAULT_OPTION);
        p2.altura = Double.parseDouble(dataTemp);
        
        dataTemp = JOptionPane.showInputDialog(null, 
                "Digite seu sexo: ", 
                "Informações", 
                JOptionPane.DEFAULT_OPTION);
        p2.sexo = dataTemp.charAt(0);
        
        JOptionPane.showMessageDialog(null, 
                "\n Os dados da pessoa 2 foram: " + 
                "\n Nome: " + p2.nome + 
                "\n Idade: " + p2.idade + 
                "\n Altura: " + p2.altura +
                "\n Sexo: " + p2.sexo,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
        
        //Entrada de dados com Scanner
        Scanner ler = new Scanner(System.in);
        System.out.println("\n Informe seu nome: ");
        p3.nome = ler.nextLine();
        System.out.println("Informe sua idade: ");
        p3.idade = ler.nextByte();
        System.out.println("Informe sua altura: ");
        p3.altura = ler.nextDouble();
        System.out.println("Informe seu sexo: ");
        p3.sexo = ler.next() .charAt (0);
        
        System.out.println("\n Os dados da pessoa 3 foram: \n" + 
                "\n Nome: " + p3.nome + 
                "\n Idade: " + p3.idade + 
                "\n Altura: " + p3.altura +
                "\n Sexo: " + p3.sexo);
        
    }
      
}
