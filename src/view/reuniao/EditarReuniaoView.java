package view.reuniao;

import model.Reuniao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EditarReuniaoView {
    public Reuniao editar(Reuniao reuniao){
        Scanner s = new Scanner(System.in);
        Date data = reuniao.getData();
        Integer numero = reuniao.getNumero();

        System.out.print("Digite a nova data da reunião: (" + data.toString() + ")  dia/mês/ano ");
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            data = sdf.parse(s.nextLine());
        } catch (NumberFormatException | ParseException e) {}
        if(data == null){
            data = reuniao.getData();
        }

        System.out.print("Digite o novo numero da reunião: (" + numero + ") ");
        try{
            numero = Integer.parseInt(s.nextLine());
        } catch (NumberFormatException e) {}
        if(numero == null){
            numero = reuniao.getNumero();
        }

        return new Reuniao(reuniao.getId(), data, numero);
    }

    public int digitarId(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 0 para cancelar a opção de edição.");
        System.out.println("Digite o ID do registro que deseja modificar.");
        System.out.print("Id: ");

        return sc.nextInt();
    }
}
