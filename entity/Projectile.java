package entity;

import main.GamePanel;

public class Projectile extends Entity{
    public String name;
    public int maxLife;
    public int life;          // how long it has existed
    public boolean alive;     // should we keep updating/drawing it?
    public Projectile(GamePanel gp){
        super(gp);
        this.gp = gp;
    }
    public void set(Entity user,int worldX,int worldY, String direction){
       this.worldX = worldX;
        this.worldY = worldY;
        this.direction = direction;
        this.life = 0;
        this.alive = true;
    }
    public void update(){
        if(alive){
        switch(direction){
                case "up":
                    worldY -= speed;//upper left corner is 0,0 so to go up we decrease y value
                    break;
                case "down":
                    worldY += speed;
                    break;
                case "left":
                    worldX -= speed;
                    break;
                case "right":
                    worldX += speed;
                    break;
            }
        spriteCounter++;
        if(spriteCounter > 12){//changes sprite every 12 frames
            if(spriteNum == 1){
                spriteNum = 2;//changes sprite images to swap between them
            }//remember this gets called 60 times per second and the counter is increased
            //a total of 60 times per second and which switch between images very often
            else if(spriteNum == 2){
                spriteNum = 1;
            }
            spriteCounter = 0;//this line right here resets the counter
            //  so we can count to 12 again
        }
    }
        

    }
}
