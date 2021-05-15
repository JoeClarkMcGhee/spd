package ADT;

sealed interface Shape {

    record Square(int x, int y) implements Shape{}
    record Circle(int center) implements Shape{}
}
