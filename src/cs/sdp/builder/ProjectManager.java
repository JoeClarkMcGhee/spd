package cs.sdp.builder;

public class ProjectManager {

    AbstractCarBuilder builder;

    ProjectManager(AbstractCarBuilder builder){
        this.builder = builder;
    }

    void constructSportCar(){
        builder.setDoors(2);
        builder.setEngine("Racing car engine");
        builder.setRoof("Drop top");
    };
    ;

}
