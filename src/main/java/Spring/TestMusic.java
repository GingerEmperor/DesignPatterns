package Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusic {
    public static void main(String[] args) {


        MusicPlayer musicPlayer = new MusicPlayer();
        Music music1=new ClassicalMusic();
        Music music2=new RockMusic();

        musicPlayer.setMusic(music2);
        musicPlayer.playMusic();

        System.out.println("----------");
        System.out.println();
        System.out.println();

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appCont.xml");
        MusicPlayer musicPlayerSpring=context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayerSpring.playMusic();


    }
}
