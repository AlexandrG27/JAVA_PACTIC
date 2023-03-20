package ex6.eldorado_in_console;
public class Computer extends Application
{
    private static String cpu;
    private static String Monitor;
    private static String Memory;

    public enum Brand{
        Asus{
            @Override
            public String getDescription() {return super.getDescription();}
        },

        Acer{
            @Override
            public String getDescription() {
                return super.getDescription();
            }
        },

        Msi{
            @Override
            public String getDescription() {
                return super.getDescription();
            }
        },

        Huawei{
            @Override
            public String getDescription() {
                return super.getDescription();
            }
        },

        Dell{
            @Override
            public String getDescription() {
                return super.getDescription();
            }
        };

        public String getDescription(){ return cpu + Memory + Monitor;}
    }



}
