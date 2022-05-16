package Arrays.Intro;

public class ReferenceValueTypes {
    public static void main(String[] args){
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        anotherIntValue++;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

    }
}
