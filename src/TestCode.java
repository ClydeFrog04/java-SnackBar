public class TestCode {

    public static void main(String[] args) {
        feeder();
    }
    /*
    const functionFeeder = function(callback) {
  callback('Hello from the inside of Function Feeder');
};
     */

    private static void feeder(){
        callback("Hello from the inside of Function feeder");
    }

    private static void callback(String message){
        System.out.println(message);
    }

}
