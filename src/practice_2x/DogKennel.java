package Practice_2X;
public class DogKennel
{
    public static Dog[] dogsArray = new Dog[0];
    public static void main(String[] args)
    {
        Dog[] dogsIncomingArray = {
                new Dog("Шарик",6),
                new Dog("Бобик",3),
                new Dog("Рома",19)
        };
        AddDog(dogsIncomingArray);
        Dog[] dogsIncomingArray2 = {
                new Dog("Шарик",6),
                new Dog("Бобик",3),
                new Dog("Рома",19)
        };
        AddDog(dogsIncomingArray2);
        for (Dog dog: dogsArray)
        {
            System.out.println(dog.ToString());
        }
    }
    public static void AddDog(Dog[] newDogs)
    {
        Dog[] newDogsArray = new Dog[dogsArray.length + newDogs.length];

        int counter = 0;

        for (Dog dog : dogsArray)
        {
            newDogsArray[counter] = dog;
            counter++;
        }
        for (Dog newDog : newDogs)
        {
            newDogsArray[counter] = newDog;
            counter++;
        }
        dogsArray = newDogsArray;
    }
}
