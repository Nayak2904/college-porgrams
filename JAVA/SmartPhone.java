
interface Camera{
    void takePic();
}
interface Music{
    void ListneSongs();
}

class Display implements Camera,Music{
    void mutimedia(){
        System.out.println("Enjoy movies...");
    }
    void Camera(){
        System.out.println("you can take pictures using camera.");
    }
    void Music(){
        System.out.println("You can listne to music using your smartphone.");
    }
    @Override
    public void ListneSongs() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void takePic() {
        // TODO Auto-generated method stub
        
    }
}

public class SmartPhone {
    public static void main(String[] args) {
        Display d = new Display();
        d.Camera();
        d.Music();
    }
}
