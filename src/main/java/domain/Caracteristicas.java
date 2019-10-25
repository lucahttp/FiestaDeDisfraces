package domain;

public abstract class Caracteristicas {
    protected int puntaje;
    Caracteristicas(){

    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return this.puntaje;
    }
}
