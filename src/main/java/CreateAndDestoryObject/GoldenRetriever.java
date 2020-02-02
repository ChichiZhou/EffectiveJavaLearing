package CreateAndDestoryObject;

public class GoldenRetriever extends Dog{
    private GoldenRetriever(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static GoldenRetriever createGoldenRetriever(String name, int age){
        return new GoldenRetriever(name, age);
    }

    void makenoise() {
        System.out.println("WANGWANG" + " " + "I AM GOLDEN RETRIEVER!!!!");
    }
}
