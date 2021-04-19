package listas;

import java.util.LinkedList;
import java.util.List;

public class ListaDeContatos {
    public static void main(String args[]){

        List<Contato> contatos = new LinkedList<>();

        Contato contato = new Contato("José","ze@gmail.com","999912345");
        Contato contato1 = new Contato("Ana","ana@gmail.com","888812345");
        Contato contato2 = new Contato("Bia","bia@hotmail.com", "777712345");

        contatos.add(contato);
        contatos.add(contato1);
        contatos.add(contato2);

        System.out.println("Os contatos da lista são :");

        for (Contato contatinhos : contatos){
            System.out.println(contatinhos);
        }

        System.out.println("O total de elementos na lista é: " +contatos.size());
        System.out.println("Existe o ítem contato1 nesta lista ? : " + contatos.contains(contato1));
        contatos.remove(contato);
        System.out.println("Existe o ítem contato na lista? : "+ contatos.contains(contato));


    }
}
