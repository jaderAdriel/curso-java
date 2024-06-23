package heranca.aplication;

import heranca.entities.Account;
import heranca.entities.BusinessAccount;
import heranca.entities.SavingsAccount;

// classes com final não podem ser extendidas e metodos com final não podem ser sobrepostos

public final class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Jader Adriel");
        BusinessAccount bcc = new BusinessAccount(1002, "Ana Morena", 15000);

        // UPCASTING = TRANSFORMA O OBJETO DA SUB-CLASSE PARA A CLASSE PAI
        Account acc1 = bcc;
        Account acc2 = new BusinessAccount(1003, "Teste", 100);
        Account acc3 = new SavingsAccount(1005, "Teste", 100.0);

        // DOWNCASTING = TRANSFORMA O OBJETO DA CLASSE PAI EM SUB-CLASSE
        BusinessAccount acc4 = (BusinessAccount) acc2;
        BusinessAccount acc5 = new BusinessAccount();

        if (acc3 instanceof BusinessAccount) {
            acc5 = (BusinessAccount) acc3;
        }
    }
}
