
package view.reuniao;

import model.Reuniao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CadastrarReuniaoView {
    
    public Reuniao telaDeCadastro(){

        Scanner s = new Scanner(System.in);
        Date data = null;
        Integer numero = null;

        while (data == null) {
            System.out.print("Digite a data da reunião: (dia/mês/ano) ");
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                data = sdf.parse(s.nextLine());
            } catch (NumberFormatException | ParseException e) {
                System.out.println("Data inválida");
            }
        }

        System.out.print("Digite o numero da reunião: ");
        try{
            numero = Integer.parseInt(s.nextLine());
        } catch (NumberFormatException e) {
            numero = -1;
        }

        return new Reuniao(data, numero);
    }

    public void sucesso() {
        System.out.println("Reunião cadastrada com sucesso!");
    }
}
