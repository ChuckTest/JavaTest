package hw01;

public class Task1 {
    public static void buyChick() {
    for(int i=0;i<=100/5;i++)
    {
        for(int j=0;j<=100/3;j++){
            int k=100-5*i-3*j;
            if(i+j+k==100&&(k%3)==0){
                System.out.println(String.format("买%d只公鸡,买%d只母鸡,买%d只小鸡",i,j,k));
            }
            else
            {
                System.out.println(String.format("失败 买%d只公鸡,买%d只母鸡,买%d只小鸡",i,j,k));
            }
        }
    }
    }
}
