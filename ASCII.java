import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ASCII
{
    static final String RED = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String BLUE = "\u001B[34m";
    static final String PURPLE = "\u001B[35m";
    static final String CYAN = "\u001B[36m";
    static final String WHITE = "\u001B[0m";
    static Scanner sc = new Scanner(System.in);
    static Map<Character, String[]> letters = new LinkedHashMap<>();
    static Map<String, String> colors = new LinkedHashMap<>();

    static {
        colors.put("RED", RED);
        colors.put("GREEN", GREEN);
        colors.put("BLUE", BLUE);
        colors.put("YELLOW", YELLOW);
        colors.put("PURPLE", PURPLE);
        colors.put("WHITE", WHITE);
        colors.put("CYAN", CYAN);

        letters.put('A', new String[]{"  █  ", " █ █ ", "█████", "█   █", "█   █"});
        letters.put('B', new String[]{"████ ", "█   █", "████ ", "█   █", "████ "});
        letters.put('C', new String[]{" ████", "█    ", "█    ", "█    ", " ████"});
        letters.put('D', new String[]{"████ ", "█   █", "█   █", "█   █", "████ "});
        letters.put('E', new String[]{"█████", "█    ", "███  ", "█    ", "█████"});
        letters.put('F', new String[]{"█████", "█    ", "███  ", "█    ", "█    "});
        letters.put('G', new String[]{" ████", "█    ", "█ ███", "█   █", " ████"});
        letters.put('H', new String[]{"█   █", "█   █", "█████", "█   █", "█   █"});
        letters.put('I', new String[]{"█████", "  █  ", "  █  ", "  █  ", "█████"});
        letters.put('J', new String[]{"█████", "  █  ", "  █  ", "█ █  ", " █   "});
        letters.put('K', new String[]{"█   █", "█  █ ", "███  ", "█  █ ", "█   █"});
        letters.put('L', new String[]{"█    ", "█    ", "█    ", "█    ", "█████"});
        letters.put('M', new String[]{"█   █", "██ ██", "█ █ █", "█   █", "█   █"});
        letters.put('N', new String[]{"█   █", "██  █", "█ █ █", "█  ██", "█   █"});
        letters.put('O', new String[]{" ███ ", "█   █", "█   █", "█   █", " ███ "});
        letters.put('P', new String[]{"████ ", "█   █", "████ ", "█    ", "█    "});
        letters.put('Q', new String[]{" ███ ", "█   █", "█   █", "█  █ ", " ██ █"});
        letters.put('R', new String[]{"████ ", "█   █", "████ ", "█ █  ", "█  ██"});
        letters.put('S', new String[]{" ████", "█    ", " ███ ", "    █", "████ "});
        letters.put('T', new String[]{"█████", "  █  ", "  █  ", "  █  ", "  █  "});
        letters.put('U', new String[]{"█   █", "█   █", "█   █", "█   █", " ███ "});
        letters.put('V', new String[]{"█   █", "█   █", "█   █", " █ █ ", "  █  "});
        letters.put('W', new String[]{"█   █", "█   █", "█ █ █", "██ ██", "█   █"});
        letters.put('X', new String[]{"█   █", " █ █ ", "  █  ", " █ █ ", "█   █"});
        letters.put('Y', new String[]{"█   █", " █ █ ", "  █  ", "  █  ", "  █  "});
        letters.put('Z', new String[]{"█████", "   █ ", "  █  ", " █   ", "█████"});
        letters.put('0', new String[]{" ███ ", "█   █", "█   █", "█   █", " ███ "});
        letters.put('1', new String[]{"  █  ", " ██  ", "  █  ", "  █  ", "█████"});
        letters.put('2', new String[]{" ███ ", "    █", " ███ ", "█    ", "█████"});
        letters.put('3', new String[]{"█████", "    █", " ███ ", "    █", "█████"});
        letters.put('4', new String[]{"█   █", "█   █", "█████", "    █", "    █"});
        letters.put('5', new String[]{"█████", "█    ", "████ ", "    █", "████ "});
        letters.put('6', new String[]{" ████", "█    ", "████ ", "█   █", " ████"});
        letters.put('7', new String[]{"█████", "    █", "   █ ", "  █  ", " █   "});
        letters.put('8', new String[]{" ███ ", "█   █", " ███ ", "█   █", " ███ "});
        letters.put('9', new String[]{" ███ ", "█   █", " ████", "    █", "████ "});
        letters.put('+', new String[]{"     ", "  █  ", " ███ ", "  █  ", "     "});
        letters.put('-', new String[]{"     ", "     ", " ███ ", "     ", "     "});
        letters.put('*', new String[]{"     ", " █ █ ", "  █  ", " █ █ ", "     "});
        letters.put('=', new String[]{"     ", "█████", "     ", "█████", "     "});
        letters.put('.', new String[]{"   ", "   ", "   ", "   ", " █ "});
        letters.put(',', new String[]{"   ", "   ", "   ", "  █", " █ "});
        letters.put('!', new String[]{"  █  ", "  █  ", "  █  ", "     ", "  █  "});
        letters.put('?', new String[]{" ███ ", "    █", "   █ ", "     ", "  █  "});
        letters.put('_', new String[]{"     ", "     ", "     ", "     ", "█████"});
        letters.put(':', new String[]{"     ", "  █  ", "     ", "  █  ", "     "});
        letters.put(';', new String[]{"     ", "  █  ", "     ", "  █  ", " █   "});
        letters.put('|', new String[]{"  █  ", "  █  ", "  █  ", "  █  ", "  █  "});
        letters.put('|', new String[]{"  █  ", "  █  ", "  █  ", "  █  ", "  █  "});
        letters.put('[', new String[]{"  ██ ", "  █  ", "  █  ", "  █  ", "  ██ "});
        letters.put(']', new String[]{" ██  ", "  █  ", "  █  ", "  █  ", " ██  "});
        letters.put('(', new String[]{"   █ ", "  █  ", "  █  ", "  █  ", "   █ "});
        letters.put(')', new String[]{" █   ", "  █  ", "  █  ", "  █  ", " █   "});
        letters.put('{', new String[]{"  ██ ", "  █  ", " ██  ", "  █  ", "  ██ "});
        letters.put('}', new String[]{" ██  ", "  █  ", "  ██ ", "  █  ", " ██  "});
        letters.put('<', new String[]{"     ", "  █  ", " █   ", "  █  ", "     "});
        letters.put('>', new String[]{"     ", "  █  ", "   █ ", "  █  ", "     "});
        letters.put('\'', new String[]{"  █  ", "     ", "     ", "     ", "     "});
        letters.put('\"', new String[]{" █ █ ", "     ", "     ", "     ", "     "});
        letters.put('`', new String[]{" █   ", "  █  ", "     ", "     ", "     "});
        letters.put('\\', new String[]{"█    ", " █   ", "  █  ", "   █ ", "    █"});
        letters.put('#', new String[]{" █ █ ", "█████", " █ █ ", "█████", " █ █ "});
        letters.put(' ', new String[]{"   ", "   ", "   ", "   ", "   "});
        // letters.put('', new String[]{"     ", "     ", "     ", "     ", "     "});
    }

    public static void print(String text, String color) 
    {
        text = text.toUpperCase();
        for (int row = 0; row < 5; row++) {
            StringBuilder lineResult = new StringBuilder();
            
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                
                if (letters.containsKey(c)) {
                    lineResult.append(letters.get(c)[row]).append(!(c==',' || c=='.') ? " " : ""); 
                }
            }
            System.out.println(color + lineResult + WHITE);
        }
        System.out.println();
    }

    public static void print(String text) 
    {
        text = text.toUpperCase();
        for (int row = 0; row < 5; row++) {
            StringBuilder lineResult = new StringBuilder();
            
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                
                if (letters.containsKey(c)) {
                    lineResult.append(letters.get(c)[row]).append(!(c==',' || c=='.') ? " " : ""); 
                }
            }
            System.out.println(lineResult);
        }
        System.out.println();
    }

    public static void guide() 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print(GREEN + "-SUPPORTED CHARACTERS: " + WHITE + "\n");
        boolean isFirst = true;
        for (Character c : letters.keySet()) {
            if (c == ' ') continue;
            System.out.print(isFirst ? "" : " ");
            System.out.print(c);
            isFirst = false;
        }
        System.out.println(GREEN + "\n-SUPPORTED COLORS: \n" + RED + "RED" + WHITE + ", " + GREEN + "GREEN" + WHITE + ", " + YELLOW + "YELLOW" + WHITE + ", " + BLUE + "BLUE" + WHITE +  ", " + PURPLE + "PURPLE" + WHITE + ", " + CYAN + "CYAN" + WHITE + ", WHITE <defaut>");

        System.out.println("\n[ENTER TO CONTINUE]");
        sc.nextLine();
        menu();
    }

    public static void clear()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void menu()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        print("PRINT_TEXT", GREEN);
        System.out.println("\nSYNTAX: [TEXT] / [COLOR]");
        System.out.println("\n-GUIDE: /help");
        System.out.println("-CLEAR: /clear");
        System.out.println("-EXIT:  /exit\n\n");
    }

    public static void main(String[] args) {
        // print("abcdefghijklmnopqrstuvwxyz", RED);
        // print("0123456789", BLUE);
        // print("+-*=.,!?_:;|[](){}<>\'\"`\\#", GREEN);
        // print("1+1=2");
        // print("2-1=1");
        // print("2*2=4");
        // print("2:1=2");
        // print("|-1|=1");
        // print("Hi! My name is Hao, I'm from Vietnam. How are you?");
        // print("snake_case");
        // print("(\'1\') [\"2\"] {`3`}");
        // print("(()) [[]] {{}} <<>>");


        menu();
        while(true)
        {
            System.out.print(">>> ");
            String input = sc.nextLine().trim();
            if(input.isEmpty()) continue;
            if(input.equalsIgnoreCase("/exit")) break;
            if(input.equalsIgnoreCase("/help")) 
            {
                guide(); 
                continue;
            }
            if(input.equalsIgnoreCase("/clear"))
            { 
                clear(); 
                continue; 
            }
            String text = input;
            String color = WHITE;
            if (input.contains("/")) {
                int slashIndex = input.indexOf('/');
                text = input.substring(0, slashIndex).trim();
                String colorName = input.substring(slashIndex + 1).toUpperCase().replaceAll(" ", "");
                color = colors.getOrDefault(colorName, WHITE);
            }
            if(text.isEmpty()) continue;
            print(text, color);        
        }
        System.out.println("\n\n>>> THANKS FOR USING <<<\n");
    }
}