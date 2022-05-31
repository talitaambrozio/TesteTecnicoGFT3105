package Desafio04;
/*
Crie uma agenda que armazena: código da pessoa,
número do telefone, idade. Sua agenda deve possibilitar:
(1) – inserir um contato
(2) – Remover um contato
(3) – Editar um

 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Agenda> agendaList = new ArrayList<>(){{
            add(new Agenda(1,11112222,18));
            add(new Agenda(2,22223333,54));
            add(new Agenda(3,22225555,24));

        }};
        agendaList.remove(1);
        System.out.println(agendaList);

        List<Agenda> agendaList1 = new ArrayList<>(){{
            add(new Agenda(1,11112222,18));
            add(new Agenda(3,22225555,24));
            add(new Agenda(4,99992222,19));
        }};
        System.out.println(agendaList1);

        List<Agenda> agendaList2 = new ArrayList<>(){{
            add(new Agenda(1,11112222,19));
            add(new Agenda(3,22225555,24));
            add(new Agenda(4,99992222,19));
        }};






    }

}


