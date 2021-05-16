package cs.sdp.prototype;

public class Balluta implements Tree{
    Integer height;
    Boolean isEvergreen;
    String description;

    public Balluta(Integer height, Boolean isEvergreen, String description) {
        this.height = height;
        this.isEvergreen = isEvergreen;
        this.description = description;
    }

    @Override
    public Tree clone() {
        return new Balluta(this.height, this.isEvergreen, this.description);
    }
}
