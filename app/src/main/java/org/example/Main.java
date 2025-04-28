
package org.example;

public class Main {
    public static void main(String[] args) {
        DishStack stack = new DishStack(8);
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");
        
        int stackSize = stack.size();
        
        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        stack.push(blueDish);
        
        int sizeAfterPushes = stack.size();
        
        Dish peekedDish = stack.peek();
        
        Dish poppedDish = stack.pop();
        
        Dish anotherPoppedDish = stack.pop();
        
        int finalSize = stack.size();

        stack.clear();

        int finalFinalSize = stack.size();

    }
}