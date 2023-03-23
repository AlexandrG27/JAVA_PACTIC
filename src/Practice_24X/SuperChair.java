package Practice_24X;
public abstract class SuperChair
{
    public abstract String getMaterial();
    public abstract String getLegs();
    public abstract String chairBack();
    @Override
    public String toString() {
        return "Материал: "+ this.getMaterial()+", Ножки: "+ this.getLegs()+
                ", Спинка: " + this.chairBack();
    }
}