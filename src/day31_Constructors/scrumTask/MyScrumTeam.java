package day31_Constructors.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        // 4 tester objects
        Tester tester1 = new Tester("Layan", 11, "QA", 110000);
        Tester tester2 = new Tester("Ali", 43, "SDET", 142000);
        Tester tester3 = new Tester("Alex", 44, "SE", 135000);
        Tester tester4 = new Tester("Lala", 23, "SDET", 115000);

        Tester[] testers = {tester2, tester3, tester4};

        //4 developer objects
        Developer developer1 = new Developer("Olga", 22, "Java Developer", 125000);
        Developer developer2 = new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 28, "Software Developer", 135000);
        Developer developer4 = new Developer("Sinem", 13, "Senior Developer", 200000);

        Developer[] developers = {developer2, developer3, developer4};

        //ScrumTeam Object
        ScrumTeam scrumTeam = new ScrumTeam("Nigara", "Huseyin", "Neira", 14);

        //add tester and devop
        scrumTeam.addTester(tester1);
        scrumTeam.addDeveloper(developer1);

        //add testers and devops
        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(developers);

        System.out.println(scrumTeam);

        System.out.println("--------------");

        for (Tester tester : scrumTeam.testerList) {
            System.out.println(tester.name + " : " + tester.salary);
        }

        System.out.println("--------------");

        scrumTeam.removeTester(23);
        scrumTeam.removeDeveloper(22);

        System.out.println(scrumTeam);
    }


}
