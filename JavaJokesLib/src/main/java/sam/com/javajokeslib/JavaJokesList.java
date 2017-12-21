package sam.com.javajokeslib;

import java.util.ArrayList;

public class JavaJokesList {

    private ArrayList<String> list;


    public JavaJokesList() {
        this.list = new ArrayList<>();
        this.list.add(0, "1.What's the difference between snowmen and snowladies? Snowballs");
        this.list.add(0, "2.Why did the blonde get excited after finishing her puzzle in 6 months? -- The box said 2-4 years!");
        this.list.add(0, "3.What do you call a fat psychic? A four chin teller.");
        this.list.add(0, "4.I am a nobody, nobody is perfect, therefore I am perfect.");
        this.list.add(0, "5.What do you call a bear with no teeth? -- A gummy bear!");
        this.list.add(0, "6.I wondered why the frisbee was getting bigger, and then it hit me.");
        this.list.add(0, "7.If con is the opposite of pro, it must mean Congress is the opposite of progress?");
        this.list.add(0, "8.If 4 out of 5 people SUFFER from diarrhea; does that mean that one enjoys it?");
        this.list.add(0, "9.For anyone who think a woman's place is in the kitchen, remember that's where the knives are kept.");
        this.list.add(0, "10.I used to like my neighbors, until they put a password on their Wi-Fi.");
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
}
