package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1.website;

import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1.ProjectManager;

public class WebsitePM implements ProjectManager {
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
