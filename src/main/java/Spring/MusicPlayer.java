package Spring;

import org.springframework.stereotype.Component;


public class MusicPlayer {
    Music music;

    public void setMusic(Music music) {
        this.music = music;
    }


    public void playMusic(){
        System.out.println("Is playing: "+music.getName());
    }


}
