package Serialization;
import java.io.Serializable;
public class TestSerialization implements Serializable {
    int a = 14;
    transient int b = 15;  // transient are not serialized
    Test2Serialization c = new Test2Serialization(16); // this class needs to be serialized 
    Test3Serialization d = new Test3Serialization(17); // let suppose this cannot be serialized

}
