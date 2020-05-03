package ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1;

import ua.dp.vovkalexey.java.Go4.DesignPatterns.Creational.AbstractFactory.ex1.website.WebsiteTeamFactory;

public class AuctionSiteProject {

    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new WebsiteTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        System.out.println("Create Auction website");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
