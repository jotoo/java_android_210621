package lesson8;

public class Road implements Pro {
    private int dlinna;

    public Road(int dlinna) {
        this.dlinna = dlinna;
    }

    public int getDlinna() {
        return dlinna;
    }


    @Override
    public void tryrun(Fiz r) {
        r.run(getDlinna());
    }

    @Override
    public void tryjump(Fiz j) {

    }
}
