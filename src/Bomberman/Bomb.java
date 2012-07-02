package Bomberman;

import java.util.ArrayList;
import java.util.Iterator;

public class Bomb extends Sprite {
	private int fc=0;
	private int maxticks=3;
	private int tick=0;
	private int radius=1;

	Bomb(TileMap map, int tile_posX, int tile_posY) {
		super(map, tile_posX, tile_posY);
		posX = map.X_TileToPixel(tile_posX);
		posY = map.Y_TileToPixel(tile_posY);
		System.out.println(this.toString() + " " + this.posX + " " + this.posY);
		// TODO Auto-generated constructor stub
	}
	
	public void update(){
		System.out.println(posX); //debug
		int s = 1; //test,debug
			
			if (fc == 0/s) setImage(ImageLoader.getImage("bomb_1"));
			if (fc == 32/s) setImage(ImageLoader.getImage("bomb_2"));		
			
			fc++;
			if (fc == (63/s)){
				tick++;
				fc=0;
			}
		//destroy
			if (tick == maxticks){
				detonate();
				destroy();			
			}
	}

	
	public void detonate(){
		/*
		Sprite sprite;
		ArrayList<Sprite> sprites;
		sprites = map.spritearray[posX/16][posY/16];
		Iterator<Sprite> itr = sprites.iterator();
		
		int i;
		for(i=0; i<radius; i++){
			
		}
		*/
	}
	
}

