package Serialization;
import java.io.Serializable;
public class TestSerialization implements Serializable {
    int a = 14;
    transient int b = 15;  // transient are not serialized
    Test2Serialization c = new Test2Serialization(16);
}
