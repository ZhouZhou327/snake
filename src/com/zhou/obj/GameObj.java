package com.zhou.obj;

import com.zhou.GameWin;

import java.awt.*;

public class GameObj {
    //picture
    Image img;
    //local
    int x;
    int y;
    //size
    int width = 30;
    int height = 30;
    GameWin frame;

    public Image getImg(){
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public GameWin getFrame() {
        return frame;
    }

    public void setFrame(GameWin frame) {
        this.frame = frame;
    }

    public GameObj(){

    }

    public GameObj(Image img, int x, int y, int width, int height, GameWin frame) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.frame = frame;
    }

    //draw itself
    public void painSelf(Graphics g){
        g.drawImage(img,x,y,null);
    }
}
