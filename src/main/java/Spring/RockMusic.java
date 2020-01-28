package Spring;

import org.springframework.stereotype.Component;

//@Component
public class RockMusic extends Music{
    private static final String ROCK_MUSIC_NAME="We will rock you";
    public RockMusic() {
        super(ROCK_MUSIC_NAME);
    }
}
