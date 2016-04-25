import java.util.concurrent.TimeUnit;

public class StoryText
{
    private static String dummyvalue = "";
    private static final int TIME = 60;//Default value is 60
    public static void intro()
    { 
        dummyvalue += "[UNKNOWN VOICE]Hello? It's me, Thomas Lawing... But you may call me T-MONEY.\n";
        dummyvalue += "[T-MONEY]I've missed you so much... its been so long...\n";
        dummyvalue += "[T-MONEY]good luck on your space mission thing...\n";
        dummyvalue += "[T-MONEY]" + Game.name + ", if I don't see you again I...\n";
        dummyvalue += "*KerChow bam PACHING BOOOOOOOOOOOOM*\n";
        dummyvalue += "You wake up in a crashed spaceship, plz escape.\n";
        typerPrint(dummyvalue);
    }
    public static void level1()
    {
        
        dummyvalue = "";
        dummyvalue += "You emerge, scathed and scared...\n";
        dummyvalue += "Looking around, you see no other human life. Desperately adjusting your transmitter,\n";
        dummyvalue += " you are greeted with nothing but static and the sound of well cooked spaghetti.\n";
        dummyvalue += "Bored, you start to read your Database I textbook.\n";
        dummyvalue += "After 255 seconds, your vision goes blurry, and the once barren wasteland turns into a color\n";
        dummyvalue += "that no one has ever seen before, with DR. T in the foreground!\n";
        dummyvalue += "'" + Game.name + "!' says he. 'I know you are far away right now, but NEVER give up hope.'\n";
        dummyvalue += "'We believe in you, " + Game.name + "!' He then stepped to the right, revealing a vision of your family,\n";
        dummyvalue += " happy and smiling. You're starting to tear up. 'Good Luck!' says Dr. T as he vanishes.\n";
        dummyvalue += "After collecting your thoughts, your sense of adventure is reinvigorated.\n";
        dummyvalue += "Despite the obstacles, you march forward confidently into the icy tundra.\n";
        typerPrint(dummyvalue);
    }
    public static void level2()
    {
        dummyvalue = "You've made it. After days of climbing, you've finally reached the summit of the volcano.\n"
            + "All that's left is to descend the other side and you'll be... well, somewhere. There's a good chance that\n"
            + "anywhere is better than here. What you don't realize, though, is two things:\n"
            + "1. This volcano is home to one of the most viscious RABID MARTIANS on Mars\n"
            + "2. The ledge you're standing on is about to collapse and drop you right into their base.\n"
            + "I suggest you...\n"
            + "*KerChow bam PACHING BOOOOOOOOOOOOM*\n"
            + "\n\nWell, that could have gone better. You are now tied to the wall in a room full of\n"
            + "RABID MARTIANS. I suggest you act quickly.";
        typerPrint(dummyvalue);
    }
    public static void level3()
    {
        dummyvalue = "";
        dummyvalue += "As you emerge from the fires of the volcano, you look over yourself and the burns you've inevitably sustained.\n";
        dummyvalue += "There's a few minor burns on your arms and hands, but other than that, and a few singed hairs on your face, you've made it out alright.\n";
        dummyvalue += "You take a look around and begin to notice your surroundings.\nYou don't seem to recognize any of the landmarks that you used for direction just a few hours earlier.\n";
        dummyvalue += "The eruption has drastically changed the landscape around you.\nThe wreckage of your ship, usually visible from the peak of the volcano, is now covered in magma spewing from every crevice in the ground.\n";
        dummyvalue += "You make your way down the rest of the slope and gradually begin walking back out into the wasteland that you fear may soon become your grave.\n";
        dummyvalue += "You find a rock structure in the shape of a chair that looks comfortable enough to sit on and begin to contemplate your next plan of action.\n";
        dummyvalue += "As you look up, you see what must be a mirage of a ship breaking orbit and landing far away from you.\nIt must be the heat coming from the lava, paired with dehydration, playing tricks on your mind.\n";
        dummyvalue += "You recline back and take out your canteen, cherishing the last few drops of water that emerge from it.\nYou think of your home back on Earth, and realize you've forgotten many things you once held dear.\n";
        dummyvalue += "It makes you think of the Mount Doom scene in the third Lord of the Rings movie, after the ring is destroyed.\nAlthough you miss your home, survival is still on your mind, so you begin to think of your next action.\n";
        dummyvalue += "As you gather yourself and think of the past day's events, you see a hazy vision approaching on the horizon.\n";
        dummyvalue += "'Could it be?' you ask yourself.\nAs he comes closer and closer, you begin to realize, it is him.\n";
        typerPrint(dummyvalue);
    }
    public static void outro()
    {
        dummyvalue = "";
        dummyvalue += "'I never doubted you " + Game.name + "'\n";
        dummyvalue += "Yes... It was him, or at least a vision of him.\n";
        dummyvalue += "You run up to him to give him a handshake or even a hug if he would allow it.\n";
        dummyvalue += "Though you know he isn't real, you hold onto him and cry as his hand phases\n";
        dummyvalue += "through you in an attempt to pat your back.\n";
        dummyvalue += "Wiping away the tears with your cosmonaut special edition hankerchief, you\n";
        dummyvalue += "refocus and listen to what he has to say.\n";
        dummyvalue += "'From the moment you got to this planet, you have had a look in your eye.\n";
        dummyvalue += "You were scared' ... Dr. T looked down and paused with a grim look on his face.\n";
        dummyvalue += "'But, you also had the determination and hope to continue your journey'. \n";
        dummyvalue += "As he said this, his face lit back up like the Fourth of July, and he had a smile\n";
        dummyvalue += "that could cure cancer.\n";
        dummyvalue += "'It's not just because we belived in you' he started as your family stood next to\n";
        dummyvalue += "you. 'It's because you believed in yourself " + Game.name + "'\n";
        dummyvalue += "As you cry one last time on this planet, you walk towards the ship.\n";
        dummyvalue += "Waving before you go home, Dr.T and your family congratulate you on your achievement.\n";
        dummyvalue += "...\n";
        /*dummyvalue += "...\n";
        dummyvalue += "...\n";
        dummyvalue += "SO TELL ME WHAT YOU WANT YOU REALLY REALLY WANT\n";
        dummyvalue += "I'LL TELL YOU WHAT I WANT WHAT I REALLY REALLY WANT\n";
        dummyvalue += "TELL ME WHAT YOU WANT WHAT YOU REALLY REALLY WANT\n";
        dummyvalue += "I'LL TELL YOU WHAT I WANT WHAT I REALLY REALLY WANT\n";*/
        dummyvalue += "And thus you went home safely, with many memories and a lot of information on Mars.\n";
        typerPrint(dummyvalue);
    }
    public static String bonus()
    {
        dummyvalue = "";
        dummyvalue += "I MADE THIS FOR YOU";
        dummyvalue += "I GOTTA GET OUT OF HERE";
        dummyvalue += "STAMPEDE";
        dummyvalue += "DO IT";
        dummyvalue += "";
        dummyvalue += "";
        dummyvalue += "";
        dummyvalue += "";
        dummyvalue += "";
        dummyvalue += "";
        return dummyvalue;
    }
    /**
     * Prints the dialogue in a charismatic style.
     */
    public static void typerPrint(String s)
    {
        for(int i = 0; i < s.length(); i++)
        {
            try
            {
                if (s.charAt(i) == '[')
                {
                    int end = s.indexOf("]", i + 1);
                    System.out.print(s.substring(i, end + 1));
                    i = end;
                }
                else if (s.charAt(i) == '*')
                {
                    TimeUnit.MILLISECONDS.sleep(1000);
                    int end = s.indexOf("*", i + 1);
                    System.out.print(s.substring(i, end + 1));
                    i = end;
                    TimeUnit.MILLISECONDS.sleep(1000);
                }
                else if (s.charAt(i) == '\n')
                {
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.print(s.charAt(i));
                }
                else
                {
                    TimeUnit.MILLISECONDS.sleep(TIME);
                    System.out.print(s.charAt(i));
                }
            }
            catch (InterruptedException e)
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}
