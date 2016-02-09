/**
 * Created by Root on 09.02.2016.
 */
public class Main {

    public static void main(String[] args) {
        MyArrayList myarray = new MyArrayList();


        myarray.Add(0, 100500);
        myarray.Add(1,"Good bye World");
        myarray.Add(2,new Human("John",35, Human.Gender.MALE));
        myarray.Add(3,new Human("Jack",40, Human.Gender.MALE));
        myarray.Add(4,new Human("Sofie",25, Human.Gender.FEMALE));
        myarray.Add(5,new Car(Car.Model.Mercedes,555,"2010"));
        myarray.Add(6,new Car(Car.Model.BMW,333,"2015"));
        myarray.Add(7,new Car(Car.Model.TOYOTA,555,"2010"));
        myarray.Add(8, new Smartphone(Smartphone.Manufacturer.SAMSUNG,4,2,"Sigma"));
        myarray.Add(9, new Smartphone(Smartphone.Manufacturer.APPLE,5,1,"A9"));



        while (myarray.hasNext()) {
            System.out.println(myarray.Next());
        }
    }
}
