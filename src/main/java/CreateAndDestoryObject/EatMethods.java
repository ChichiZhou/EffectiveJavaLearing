package CreateAndDestoryObject;

public class EatMethods {

    public static EatWithHands eatWithHands(){
        return new EatWithHands();
    }

    public static EatWithFork eatWithFork(){
        return new EatWithFork();
    }

    private static class EatWithHands implements Eat{
        public void eat(){
            System.out.println("EAT WITH HANDS");
        }
    }

    private static class EatWithFork implements Eat{
        public void eat(){
            System.out.println("EAT WITH FORK");
        }
    }
}
