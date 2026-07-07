package oop;
// showcasing implemntation of enums
public class New {

    public static void main(String[] args) {
       enums mEnums = enums.GOLD;
        System.out.println(mEnums);

        for (enums m : enums.values()){
            System.out.println(m + ": " + m.getPoints());
        }
    }
    
}