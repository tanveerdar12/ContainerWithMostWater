public class WaterTankProblem {
    public static void main(String[] args) {

        int d = 0;
        int temp = 0;
        int[] height = {7,4,3,9,6,8};
        int n = height.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
               // d = (height[j] - height[i]) * (j - i);
                if(height[i]<height[j]){
                    d =height[i]*(j-i);
                }else{
                    d= height[j]*(j-i);
                }

                    if (d > temp) {
                       temp = d;
                }
            }
        }
        System.out.println(temp);
    }
}
