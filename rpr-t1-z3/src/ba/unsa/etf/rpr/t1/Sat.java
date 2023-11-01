package ba.unsa.etf.rpr.t1;

public class Sat {
    int sati,minute,sekunde;
    Sat(int sati, int minute, int sekunde) {
        Postavi(sati,minute,sekunde);
    }
    void Postavi(int h, int m, int s) { sati=h;minute=m;sekunde=s; }
    void Sljedeci() {
        sekunde=sekunde+1;
        if (sekunde==60) { sekunde=0; minute=minute+1; }
        if (minute==60) { minute=0; sati=sati+1; }
        if (sati==24) sati=0;
    }
    void Prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute=minute-1; }
        if (minute==-1) { minute=59; sati=sati-1; }
        if (sati==-1) sati=23;
    }
    void PomjeriZa(int pomak) {
        if (pomak>0) for (int i=0; i<pomak; i++) Sljedeci();
        else for (int i=0; i<-pomak; i++) Prethodni();
    }

    int DajSate()  { return sati; }
    int DajMinute()  { return minute; }
    int DajSekunde()  { return sekunde; }
    void Ispisi()  { System.out.println(sati+":"+minute+":"+sekunde);}

}
