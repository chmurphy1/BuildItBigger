package murphy.christopher.javajokelibrary;

import java.util.ArrayList;

public class Joke {

    private static ArrayList<String> jokes = new ArrayList<>();
    static{
        jokes.add("Why did the tree go to the dentist? To get a root canal");
        jokes.add("How did the telephone propose to its girlfriend? He gave her a ring.");
        jokes.add(" I quit my job at the helium factory today. I refuse to be spoken to in that tone of voice.");
        jokes.add("Corny jokes are a-maize-ing.");
        jokes.add("What type of market should you NEVER take your dog? A flea market!");
        jokes.add("Today at the bank, an old lady asked me to help check her balance. So I pushed her over.");
        jokes.add("My wife told me I had to stop acting like a flamingo. So I had to put my foot down.");
    }
    public static String getJoke(){
        return jokes.get((int)(Math.random() * jokes.size()));
    }
}
