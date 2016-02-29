import java.util.concurrent.TimeUnit;

public class StoryText
{
    private static String dummyvalue = "";
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
    public static String level1()
    {
        
        dummyvalue = "";
        dummyvalue += "You emerge, scathed and scared...\n";
        dummyvalue += "Looking around, you see no other human life. Desperately adjusting your transmitter,\n";
        dummyvalue += " you are greeted with nothing but static and the sound of well cooked spaghetti.\n";
        dummyvalue += "Bored, you start to read your Database I textbook.\n";
        dummyvalue += "After 255 seconds, your vision goes blurry, and the once barren wasteland turns into a color\n";
        dummyvalue += "that no one has ever seen before, with DR. T in the foreground!\n";
        dummyvalue += "'" + Game.name + "!' says he. 'I know you are far away right now, but NEVER give up hope'\n";
        dummyvalue += "'We believe in you, " + Game.name + "!' He then stepped to the right revealing a vision of your family\n";
        dummyvalue += " happy and smiling. You're starting to tear up. 'Good Luck!' says Dr. T as he vanishes.\n";
        dummyvalue += "After collecting your thoughts, your sense of adventure is reinvigorated\n";
        dummyvalue += "despite the obstacles, you march forward confidently\n";
        return dummyvalue;
    }
    public static String level2()
    {
        dummyvalue = "It's unbelievably cold out here. So cold, in fact, that one could say it's \n"
            + "SUPER COLD. Luckily, your suit has internal heating, so you can't actualy feel it, but the \n"
            + "seemingly infinite plane of ice sort of gives it away. At this point, you realize two important things:"
            + "1. There's no way you can survive out in this landscape for more than 8-10 hours.\n"
            + "2. There's a high probability that you left your oven on at home.\n\n"
            + "The ship wreckage is thrown about the landscape.\n";
        return dummyvalue;
    }
    public static String level3()
    {
        dummyvalue = "";
        dummyvalue += "";
        dummyvalue += "";
        dummyvalue += "";
        dummyvalue += "";
        dummyvalue += "";
        dummyvalue += "";
        dummyvalue += "";
        dummyvalue += "";
        dummyvalue += "";
        dummyvalue += "";
        return dummyvalue;
    }
    public static String outro()
    {
        dummyvalue = "";
        dummyvalue += "'I never doubted you " + Game.name + "'\n";
        dummyvalue += "Yes... It was him, or at least a vision him\n";
        dummyvalue += "You run up to him to give him a handshake or even a hug if he would allow it\n";
        dummyvalue += "Though you know he isnt real, you hold onto him and cry as his hand phases\n";
        dummyvalue += "through you in an attempt to pat your back.\n";
        dummyvalue += "Wiping away the tears with your cosmonaut spetial edition hankerchief you\n";
        dummyvalue += "refocus and listen to what he has to say\n";
        dummyvalue += "'From the moment you got to this planet you have had a look in your eye,\n";
        dummyvalue += " you were scared' ... Dr. T looked down and paused with a grim look on his face\n";
        dummyvalue += "'But, you also had the determination and hope to continue your journey' \n";
        dummyvalue += "as he said this his face lit back up like the fourth of july and he had a smile\n";
        dummyvalue += "that could cure cancer\n";
        dummyvalue += "'It's not just because we belived in you' he started as your family stood next to\n";
        dummyvalue += "you, 'It's because you believed in yourself " + Game.name + "'\n";
        dummyvalue += "As you cry one last time on this planet, you walk towards the ship\n";
        dummyvalue += "And waving before you go home, Dr.T and your family hold hands and sing this ballad\n";
        dummyvalue += "...\n";
        dummyvalue += "...\n";
        dummyvalue += "...\n";
        dummyvalue += "SO TELL ME WHAT YOU WANT YOU REALLY REALLY WANT\n";
        dummyvalue += "ILL TELL YOU WHAT I WANT WHAT I REALLY REALLY WANT\n";
        dummyvalue += "TELL ME WHAT YOU WANT WHAT YOU REALLY REALLY WANT\n";
        dummyvalue += "ILL TELL YOU WHAT I WANT WHAT I REALLY REALLY WANT\n";
        dummyvalue += "and thus you went home safely with many memories and a lot of information on mars\n";
        return dummyvalue;
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
                    TimeUnit.MILLISECONDS.sleep(60);
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