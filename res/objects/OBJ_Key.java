package res.objects;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Key extends SuperObject {//a key object that the player can pick up

    public OBJ_Key(){
        name = "Key";//sets name to Key as it is a key object
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/key.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
