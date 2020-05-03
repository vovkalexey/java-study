package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1.website;

import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1.Developer;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1.ProjectManager;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1.ProjectTeamFactory;
import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    public Tester getTester() {
        return new ManualTester();
    }

    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
