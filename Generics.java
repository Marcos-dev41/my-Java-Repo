// they allow you to write classes intefaces and methodss that work withdifferent data tyoes without having to specify the exact type in advance
// making the code flexible reusbble and type-safe
// they were introduced to specifically eliminate runtime-cast-exception

class Box<T>{
private T item;
public void set(T item){
    this.item = item;
}
public T get(){
    return item;
}
}
public class Generics {
    
    public static void main(String[] args) {
       Box<String> stringBox = new Box<>();
       stringBox.set("book");
    }
    
}
