package lesson8;

public class Wall implements Pro {
    private int visota;

    public Wall(int visota) {
        this.visota = visota;
    }

    public int getVisota() {
        return visota;
    }


    public void tryjump(Fiz j) {
        j.jump(getVisota());
    }

    @Override
    public void tryrun(Fiz r) {

    }
}

