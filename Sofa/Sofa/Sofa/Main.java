package Sofa;

public class Main {
    public static void main(String[] args) throws Exception {
        CircleList firstList = new CircleList("D:\\IdeaProjects\\src\\Sofa\\input.txt");
        firstList.show();
        System.out.println(firstList.count);
        firstList.delete("Liza");
        System.out.println(firstList.count);
        firstList.show();
        firstList.delete("");

    }
}