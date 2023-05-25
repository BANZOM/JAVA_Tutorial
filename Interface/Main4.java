package Interface;

@FunctionalInterface
interface FI{
    void development();
    // void show(); Functional interface only have one method
}
// class FA implements FI {
//     public void development(){
//         System.out.println("functional interface...");
//     }
// }
public class Main4 {
    public static void main(String[] args) {
        FI x = new FI(){
            @Override
            public void development() {
                System.out.println("functional interface through anonymous method...");
            }
        };
        x.development();
    }
}
