package despat.engine;

public class Fire implements Engine {
    private final int displacement;
    private final int cylinders = 4;

    public Fire(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public int GetCylinders() {
        return cylinders;
    }

    @Override
    public int GetDisplacement() {
        return displacement;
    }

    @Override
    public String toString() {
        return "Fire [displacement=" + displacement + ", cylinders=" + cylinders + "]";
    }
}
