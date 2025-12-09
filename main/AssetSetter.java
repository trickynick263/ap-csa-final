package main;



public class AssetSetter {
    GamePanel gp;
    public AssetSetter(GamePanel gp){
        this.gp = gp;
        setObject();
    }

    public void setObject(){
        gp.obj[0] = new res.objects.OBJ_Key();
        gp.obj[0].worldX = gp.tileSize * 18;
        gp.obj[0].worldY = gp.tileSize * 18;

        gp.obj[1] = new res.objects.OBJ_Door();
        gp.obj[1].worldX = gp.tileSize * 23;
        gp.obj[1].worldY = gp.tileSize * 24;

        gp.obj[2] = new res.objects.OBJ_Chest();
        gp.obj[2].worldX = gp.tileSize * 23;
        gp.obj[2].worldY = gp.tileSize * 25;


        gp.obj[3] = new res.objects.OBJ_Boots();
        gp.obj[3].worldX = gp.tileSize * 21;
        gp.obj[3].worldY = gp.tileSize * 21;



        
    }

    
}
