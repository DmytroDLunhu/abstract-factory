package abstractFactory;

import abstractFactory.website.WebsiteTeamFactory;

public class TradeSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        System.out.println("Creating trade website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
