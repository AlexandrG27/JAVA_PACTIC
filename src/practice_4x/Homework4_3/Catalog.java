package Practice_4X.Homework4_3;
import java.util.ArrayList;
import java.util.*;
public enum Catalog
{
    TV, PHONE, COMPUTER;
    private Product[] catalog;

    public void setCatalog(Product[] catalog)
    {
        this.catalog = catalog;
    }
    public String ToString()
    {
        return ordinal() +" "+name();

    }
    public void printCatalog()
    {
        for (int i=0;i<catalog.length; i++)
        {
            System.out.println(i+" "+catalog[i].ToString());
        }
    }
}