package logic;

public class Q11ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxarea=0, firstPointer=0, secondPointer=height.length-1;
        while (firstPointer<secondPointer){
            if(height[firstPointer]<height[secondPointer]){
                maxarea=Math.max(maxarea, height[firstPointer]*(secondPointer-firstPointer));
                firstPointer++;
            }
           else{
                maxarea=Math.max(maxarea, height[secondPointer]*(secondPointer-firstPointer));
                secondPointer--;
            }
        }
        return maxarea;
    }
}
