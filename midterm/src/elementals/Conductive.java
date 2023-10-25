package elementals;

public interface Conductive {
    float percent_conductive();
}

interface Magnetic {
    int magnetic_strength();
    String magnetic_type(); //Ferromagnetic or Paramagnetic
}

interface Radioactive{
    int half_life();//ambot unsaon ka oi
}