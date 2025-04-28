
package org.example;

public class Main {
    public static void main(String[] args) {
        DishStack stack = new DishStack(8);
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");
        
        // The variable stack_size should equal zero.
        int stackSize = stack.size();
        
        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        stack.push(blueDish);
        
        // The variable sizeAfterPushes should equal four.
        int sizeAfterPushes = stack.size();
        
        // The variable peekedDish should have a description of "A dish with a blue fish pattern on it"
        Dish peekedDish = stack.peek();
        
        // The variable poppedDish should have a description of "A dish with a blue fish pattern on it"
        Dish poppedDish = stack.pop();
        
        // The variable anotherPoppedDish should have a description of "A dish with a red fish pattern on it"
        Dish anotherPoppedDish = stack.pop();
        
        // The variable finalSize should equal two.
        int finalSize = stack.size();

        stack.clear();

        //The variable finalFinalSize should equal zero.
        int finalFinalSize = stack.size();

    }
}