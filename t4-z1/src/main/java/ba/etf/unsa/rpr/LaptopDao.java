package ba.etf.unsa.rpr;

import java.util.ArrayList;

public interface LaptopDao {
    void dodajLaptopUlistu(Laptop laptop);
    void dodajLaptopUFile(Laptop laptop);
    Laptop getLaptop(String procesor);
    void napuniListu(ArrayList<Laptop> laptopi);
    void vratiPodatkeIzDatoteke();
}
