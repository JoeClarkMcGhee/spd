package cs.sdp.prototype;

public class Oak implements Tree{
    Integer height;
    Boolean isEvergreen;
    String description;

    public Oak(Integer height, Boolean isEvergreen, String description) {
        this.height = height;
        this.isEvergreen = isEvergreen;
        this.description = description;
    }

    @Override
    public Tree clone() {
        return new Oak(this.height, this.isEvergreen, this.description);
    }
}
