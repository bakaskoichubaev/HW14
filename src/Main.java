public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Tashmat","Kod jasat","apple");
        Dancer dancer = new Dancer("Eshmat","Biyleit","minkyal");
        Singer singer = new Singer("Shermat","Yrdait","Torpoktor");
        System.out.println("Aty "+programmer.getName());
        System.out.println(programmer.getDesignation());
        System.out.println("Ishtegen coppaniasy "+programmer.getCompanyName());
        programmer.eat();
        programmer.learn();
        programmer.walk();
        programmer.coding();
        System.out.println();

        System.out.println("Aty "+dancer.getName());
        System.out.println(dancer.getDesignation());
        System.out.println("Biilegen gruppasy "+dancer.getGroupName());
        dancer.eat();
        dancer.learn();
        dancer.walk();
        dancer.dancing();
        System.out.println();

        System.out.println("Aty "+singer.getName());
        System.out.println(singer.getDesignation());
        System.out.println("Bandasynyn aty "+ singer.getBandName());
        singer.eat();
        singer.learn();
        singer.walk();
        singer.singing();
        singer.playGitar();





    }
}