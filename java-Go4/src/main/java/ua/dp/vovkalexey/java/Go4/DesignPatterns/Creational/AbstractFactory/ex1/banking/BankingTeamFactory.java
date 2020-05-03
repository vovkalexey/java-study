package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1.banking;

import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1.Developer;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1.ProjectManager;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1.ProjectTeamFactory;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Tester getTester() {
        return new QATester();
    }

    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
