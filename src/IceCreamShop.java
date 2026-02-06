public class IceCreamShop {

    public static void main(String[] args) {
        IceCreamShop creamery = new IceCreamShop();
        System.out.println("Hello World! Good luck on your exams!");

    }


    public IceCreamShop() {
        String name;
        boolean isOpen;
        int numberOfFlavors;
        name = "Scoops & Loops: The Code Creamery";
        isOpen = false;
        numberOfFlavors = 32;
        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open. We have " + numberOfFlavors + " Flavors!");
        numberOfFlavors = 67;
        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open. We have " + numberOfFlavors + " Flavors!");

        specialOfTheDay("vanilla");
        countScoops();
        chefsChoice();
        randomDiscount();

    }

    public void randomDiscount() {
        int randomInt;
        randomInt = (int) (Math.random() * 31);
        System.out.println("We spun the discount wheel and you get " + randomInt + " percent off your order!");

    }

    public void specialOfTheDay(String flavor) {
        System.out.println("Today’s special is " + flavor + ".");
    }

    public void countScoops() {
        for (int x = 1; x < 6; x++) {
            System.out.println(x);
        }
        for (int y = 2; y < 12; y = y + 3) {
            System.out.println(y);
        }
        for (int z = 8; z >= 0; z = z - 1) {
            System.out.print(z + ", ");
        }
    }

    public void chefsChoice() {
        double randomNum;
        randomNum = (Math.random());
        if (randomNum < .25) {
            System.out.println("The chef recommends a Banana Split.");
        }
        else if (randomNum > .25 & randomNum < .5) {
            System.out.println("The chef recommends a Turtle Sundae.");
        }
        else if (randomNum > .5 & randomNum < .75) {
            System.out.println("The chef recommends a Hot Fudge Sundae.");
        }
        else{
                System.out.println("The chef recommends The Vermonster.");
            }
        }
    }
