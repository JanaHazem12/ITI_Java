package package6;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Mapping{
    public final SortedMap<Character,SortedMap<String, String>> letterMap = new TreeMap<>();
    public final SortedMap<String, String> wordMap = new TreeMap<>();
        public void displayAll(){
            wordMap.put("Aim", "point or direct (a weapon or camera) at a target");
            wordMap.put("Alarm", "A warning sound or device signaling danger or urgency.");
            wordMap.put("Apple", "A round fruit with red, green, or yellow skin and a firm white interior.");
            wordMap.put("Art", "The expression or application of human creative skill and imagination.");
            wordMap.put("Ant", "A small insect that lives in a complex social colony.");
            wordMap.put("Anchor", "A heavy object used to moor a vessel to the sea bottom.");
            letterMap.put('A', wordMap);
            //wordMap=new TreeMap<String, String>();

            letterMap.put('B', wordMap);
            wordMap.put("Buy", "Obtain something in exchange for payment.");
            wordMap.put("Book", "A set of written, printed, or blank pages fastened together within covers.");
            wordMap.put("Ball", "A round object used in various games and sports.");
            wordMap.put("Bat", "An implement with a handle used for hitting a ball in sports.");
            wordMap.put("Boat", "A small vessel for traveling on water.");
            wordMap.put("Bird", "A warm-blooded egg-laying vertebrate animal distinguished by feathers.");
            //wordMap=new TreeMap<String, String>();

            letterMap.put('C', wordMap);
            wordMap.put("Care", "The provision of what is necessary for the health or welfare of someone.");
            wordMap.put("Car", "A road vehicle, typically with four wheels, powered by an engine.");
            wordMap.put("Cat", "A small domesticated carnivorous mammal with soft fur.");
            wordMap.put("Cup", "A small, bowl-shaped container for drinking liquids.");
            wordMap.put("Cake", "A sweet baked food made from flour, sugar, and other ingredients.");
            wordMap.put("Chair", "A piece of furniture for sitting, typically with a back and four legs.");
            //wordMap=new TreeMap<String, String>();
        
            letterMap.put('D', wordMap);
            wordMap.put("Drive", "Operate and control the direction and speed of a motor vehicle.");
            wordMap.put("Dog", "A domesticated carnivorous mammal often kept as a pet.");
            wordMap.put("Drum", "A percussion instrument consisting of a hollow cylinder with a membrane stretched across its ends.");
            wordMap.put("Dance", "Move rhythmically to music, typically following a set sequence of steps.");
            wordMap.put("Door", "A hinged, sliding, or revolving barrier for entry to or exit from a building.");
            wordMap.put("Dice", "Small cubes with spots on each face, used in games.");
            //wordMap=new TreeMap<String, String>();

            letterMap.put('E', wordMap);
            wordMap.put("Eat", "Put food into the mouth, chew, and swallow.");
            wordMap.put("Eraser", "An object used to remove pencil or ink marks.");
            wordMap.put("Eagle", "A large bird of prey with a massive hooked bill and long broad wings.");
            wordMap.put("Earth", "The planet on which humans and other animals live.");
            wordMap.put("Egg", "An oval or round object laid by a female bird, reptile, or fish.");
            wordMap.put("Engine", "A machine designed to convert energy into useful mechanical motion.");
            letterMap.put('E', wordMap);
            //wordMap=new TreeMap<String, String>();
        
            letterMap.put('F', wordMap);
            wordMap.put("Fry", "Cook (food) in hot fat or oil, typically in a shallow pan.");
            wordMap.put("Food", "Any nutritious substance consumed to sustain life.");
            wordMap.put("Fish", "A limbless cold-blooded vertebrate animal with gills and fins, living in water.");
            wordMap.put("Fan", "A device with rotating blades that creates a current of air.");
            wordMap.put("Flag", "A piece of fabric with a distinctive design used as a symbol or emblem.");
            wordMap.put("Flower", "The seed-bearing part of a plant, often colorful and fragrant.");
            //wordMap=new TreeMap<String, String>();

            for(Character letter : letterMap.keySet()){
                System.out.println(" Letter "+letter+": ");
                for(String word : wordMap.keySet()){
                    if(letter==word.charAt(0)){
                    System.out.println(" Word => "+word+": "+wordMap.get(word));
                    }
                }
            }
        }   
    public void displayByLetter(Character c){
        wordMap.put("Aim", "point or direct (a weapon or camera) at a target");
        wordMap.put("Alarm", "A warning sound or device signaling danger or urgency.");
        wordMap.put("Apple", "A round fruit with red, green, or yellow skin and a firm white interior.");
        wordMap.put("Art", "The expression or application of human creative skill and imagination.");
        wordMap.put("Ant", "A small insect that lives in a complex social colony.");
        wordMap.put("Anchor", "A heavy object used to moor a vessel to the sea bottom.");
        letterMap.put('A', wordMap);
        //wordMap=new TreeMap<String, String>();

        letterMap.put('B', wordMap);
        wordMap.put("Buy", "Obtain something in exchange for payment.");
        wordMap.put("Book", "A set of written, printed, or blank pages fastened together within covers.");
        wordMap.put("Ball", "A round object used in various games and sports.");
        wordMap.put("Bat", "An implement with a handle used for hitting a ball in sports.");
        wordMap.put("Boat", "A small vessel for traveling on water.");
        wordMap.put("Bird", "A warm-blooded egg-laying vertebrate animal distinguished by feathers.");

        //wordMap=new TreeMap<String, String>();

        letterMap.put('C', wordMap);
        wordMap.put("Care", "The provision of what is necessary for the health or welfare of someone.");
        wordMap.put("Car", "A road vehicle, typically with four wheels, powered by an engine.");
        wordMap.put("Cat", "A small domesticated carnivorous mammal with soft fur.");
        wordMap.put("Cup", "A small, bowl-shaped container for drinking liquids.");
        wordMap.put("Cake", "A sweet baked food made from flour, sugar, and other ingredients.");
        wordMap.put("Chair", "A piece of furniture for sitting, typically with a back and four legs.");
        //wordMap=new TreeMap<String, String>();
    
        letterMap.put('D', wordMap);
        wordMap.put("Drive", "Operate and control the direction and speed of a motor vehicle.");
        wordMap.put("Dog", "A domesticated carnivorous mammal often kept as a pet.");
        wordMap.put("Drum", "A percussion instrument consisting of a hollow cylinder with a membrane stretched across its ends.");
        wordMap.put("Dance", "Move rhythmically to music, typically following a set sequence of steps.");
        wordMap.put("Door", "A hinged, sliding, or revolving barrier for entry to or exit from a building.");
        wordMap.put("Dice", "Small cubes with spots on each face, used in games.");
        //wordMap=new TreeMap<String, String>();

        letterMap.put('E', wordMap);
        wordMap.put("Eat", "Put food into the mouth, chew, and swallow.");
        wordMap.put("Eraser", "An object used to remove pencil or ink marks.");
        wordMap.put("Eagle", "A large bird of prey with a massive hooked bill and long broad wings.");
        wordMap.put("Earth", "The planet on which humans and other animals live.");
        wordMap.put("Egg", "An oval or round object laid by a female bird, reptile, or fish.");
        wordMap.put("Engine", "A machine designed to convert energy into useful mechanical motion.");
        letterMap.put('E', wordMap);
        //wordMap=new TreeMap<String, String>();
    
        letterMap.put('F', wordMap);
        wordMap.put("Fry", "Cook (food) in hot fat or oil, typically in a shallow pan.");
        wordMap.put("Food", "Any nutritious substance consumed to sustain life.");
        wordMap.put("Fish", "A limbless cold-blooded vertebrate animal with gills and fins, living in water.");
        wordMap.put("Fan", "A device with rotating blades that creates a current of air.");
        wordMap.put("Flag", "A piece of fabric with a distinctive design used as a symbol or emblem.");
        wordMap.put("Flower", "The seed-bearing part of a plant, often colorful and fragrant.");

        // for(Character letter : letterMap.keySet()){
        //     if(letter==c){
        //     System.out.println(" Letter "+letter+": ");
        //     }
            int ff = 0;
            int f = 0;
            for(String word : wordMap.keySet()){
                if(c==word.charAt(0)){
                    if(ff==0){
                    ff = 1;
                    System.out.println("WORDS OF LETTER "+"'"+c+"'"+" : ");
                    }
                }
                if(c==word.charAt(0)){
                f=1;
                System.out.println(word+": "+wordMap.get(word));
                }
                }
                if(f==0)
                    System.out.println("LETTER UNAVAILABLE");
            }
        }



        // INSERTION //
        // user-input is a word & its definition + insert the word and its definition in the map //
        /*String wordd = "boat";
        String definition = "A boat is a small to medium-sized watercraft designed for traveling on water.";*/

        // insert in the innerMap when I'm in the outerMap