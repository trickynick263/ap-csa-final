package res.objects;

import javax.imageio.ImageIO;

public class OBJ_Chest extends SuperObject {//a chest object that can be opened to find items inside
    public OBJ_Chest() {
    name = "Chest";//sets name to Chest as it is a chest object
    try {
        image = ImageIO.read(getClass().getResourceAsStream("/res/objects/chest.png"));
    } catch (java.io.IOException e) {
        e.printStackTrace();


    }
    }
}
