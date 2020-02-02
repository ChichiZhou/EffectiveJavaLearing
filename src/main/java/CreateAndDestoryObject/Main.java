package CreateAndDestoryObject;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = Dog.createNewDog("Golden","时琳", 29);
        dog1.makenoise();

        /**
         * 使用静态工厂还可以将接口进行包装
         */
        Eat eatmethods = EatMethods.eatWithHands();
        eatmethods.eat();

        /**
         * 使用构建器
         * 这里的构建器等于使用 lombok 中的 Buider
         */

        NutritionFacts nutritionFacts = new NutritionFacts.Builder(20, 30).calories(1).carbohydrate(2).fat(3).sodium(4).build();

    }
}
