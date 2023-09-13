package creational.prototypeAndRegistry;

public interface Prototype <T>{

    T clone() throws CloneNotSupportedException;

}
