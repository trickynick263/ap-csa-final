package res.objects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Projectile;
import main.GamePanel;

public class OBJ_Fireball extends Projectile{
    
    
    public OBJ_Fireball(GamePanel gp){
        super(gp);
        name = "Fireball";
        speed = 5;
        maxLife = 300;
        getImage();
        
    }

    public void getImage(){
           try{
            //this is how we load images from our folders into our program, we put the file pathway in the
            //last arguement of the getResourceAsStream method
            up1 = ImageIO.read(getClass().getResourceAsStream("/res/fireball/fireball_up_1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/res/fireball/fireball_up_2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/res/fireball/fireball_down_1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/res/fireball/fireball_down_2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/res/fireball/fireball_left_1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/res/fireball/fireball_left_2.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/res/fireball/fireball_right_1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/res/fireball/fireball_right_2.png"));

        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    
    public void draw(Graphics2D g2){
        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;//copy from tilemanager draw method

        //draw object only if it is in the visible area of the screen
        if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
           worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
           worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
           worldY - gp.tileSize < gp.player.worldY + gp.player.screenY){
        
            BufferedImage image = null;
            switch(direction){//these are the buffered images we loaded earlier
        case "up"://based on direction we pick a differnt image to draw
            if(spriteNum == 1){
                image = up1;
            }
            if(spriteNum == 2){
                image = up2;
            }
            break;
        case "down":
            if(spriteNum == 1){
                image = down1;
            }
            if(spriteNum == 2){
                image = down2;
            }
            break;
        case "left":
            if(spriteNum == 1){
                image = left1;
            }
            if(spriteNum == 2){
                image = left2;
            }
            break;
        case "right":
            if(spriteNum == 1){
                image = right1;
            }
            if(spriteNum == 2){
                image = right2;
            }
            break;//                                                    image observer,js type null
        }//                                                            ^^^^
        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);//draws the image at the x and y position with the tile size width and height
        //the image above is drawn at a certain x and y position with an image corresponding to direction
        }
        

    }
}
