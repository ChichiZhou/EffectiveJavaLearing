package CreateAndDestoryObject;

public class Dog extends Animal{
    String name;
    int age;

    Dog(){}    // 这个是必须写的，这里牵扯到继承和构造函数

    private Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    void makenoise() {
        System.out.println("WANGWANG");
    }

    public static Dog createNewDog(String type, String name, int age){
        if (type.equals("Dog")){
            return new Dog(name, age);
        }
        else{
            return GoldenRetriever.createGoldenRetriever(name, age);
        }
    }

}
