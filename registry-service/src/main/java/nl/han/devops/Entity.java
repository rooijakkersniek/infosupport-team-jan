package nl.han.devops;

public abstract class Entity {

    protected Entity() {
        id = availableId;
        ++availableId;
    }

    private static long availableId = 0;

	public final long id;

}
