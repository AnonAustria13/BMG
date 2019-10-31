package app;

import app.datatypes.XAD;

public class test{
    public static void main(String [] args){
        XAD x = new XAD("An der Olsa^^Neumarkt^Steiermark^8820^AUT^H", "^");
        System.out.println(x.parseToHL7("^"));
    }
}