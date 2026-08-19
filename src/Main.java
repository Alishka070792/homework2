package skypro;

import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
var dog = 8.0;
System.out.println(dog);
var cat = 3.6;
System.out.println(cat);
var paper = 763789;
System.out.println(paper);

var Dog = dog + 4;
System.out.println(Dog);
cat += 4;
System.out.println(cat);
paper +=4;
System.out.println(paper);

Dog -= 3.5;
System.out.println(Dog);
var Cat = cat - 1.6;
System.out.println(Cat);
var Paper = paper - 7639;
System.out.println(Paper);

var friend = 19;
System.out.println(friend);
friend = friend + 2;
System.out.println(friend);
friend = friend / 7;
System.out.println(friend);


var liftingCapapcity = 50;
var stuffWeight = 20;
var capacityLeft = liftingCapapcity - stuffWeight;
System.out.println("Еше можно положить вешей " + capacityLeft + " кг вещей. ");

var applesWeight = 2;
var orangesWeight = 3;
var fruitsWeight = applesWeight + orangesWeight;
System.out.println("Общий вес фруктов составляет " + fruitsWeight + " кг. ");


    }
}
