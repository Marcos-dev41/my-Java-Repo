package oop;
// used to represent group of constants;
// you can access all the enum values using the .values() thus can loop through them ...check New.java for implementation
//  where enums containing data a constructor for them is explicitly required, also its private
public enum enums {
    GOLD(3),
    BRONZE(2),
    PLATINUM(1);
     
    private int points;

    private enums(int points){
        this.points  = points;
    }
    public int getPoints(){
        return points;
    }

}




