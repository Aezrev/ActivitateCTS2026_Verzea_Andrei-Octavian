package ro.ase.cts.builder01;

public interface AbstractBuilder {
   Internare build();
   AbstractBuilder setNume(String nume);
   AbstractBuilder setPatRabatabil(boolean patRabatabil);
   AbstractBuilder setArePapuci(boolean papuci);
   AbstractBuilder setAreHalat(boolean halat);
   AbstractBuilder setMicDejun(boolean micDejun);
}
