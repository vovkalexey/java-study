package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1;

public interface ProjectTeamFactory {

    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();

}
