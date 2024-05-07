import java.util.Arrays;
public class Application
{
    public static void main(String[] args)
    {
        int soldierNumberOne[]={3,1,4,6,2,4};
        int soldierNumberTwo[]={3,1,4,88,2,1};
        int soldierNumberThree[]={0,7,4,6,8,4};
        Army armyOne=new Army();
        armyOne.setStrategy(new StrategyA());
        armyOne.lineUp(soldierNumberOne);
        System.out.println("从小到大");
        System.out.println(Arrays.toString(soldierNumberOne));
        armyOne.setStrategy(new StrategyB());
        armyOne.lineUp(soldierNumberTwo);
        System.out.println("从大到小");
        System.out.println(Arrays.toString(soldierNumberTwo));
        armyOne.setStrategy(new StrategyC());
        armyOne.lineUp(soldierNumberThree);
        System.out.println("奇偶");
        System.out.println(Arrays.toString(soldierNumberThree));
    }
}