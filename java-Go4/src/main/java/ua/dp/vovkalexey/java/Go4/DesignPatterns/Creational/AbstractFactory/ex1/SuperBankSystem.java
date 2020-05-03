package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1;

import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1.banking.BankingTeamFactory;

public class SuperBankSystem {

    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new BankingTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        System.out.println("Create bank system");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }

}
