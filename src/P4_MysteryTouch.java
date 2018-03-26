/*
	ISYS 320
	Name(s): Matthew Shelby
	Date: 3/25/2018
*/

/*
 4. Your output prediction:
  touch your eye to your head
  touch your head to your eye
  touch your shoulders to your elbow
  touch your eyes and ears to your eyes and ears
  touch your toes to your Toes
  touch your shoulders to your knees toes  
 */

/*
 6. Were you correct? Explain if you were not (what did you learn?)
 My prediction was correct.
 */

public class P4_MysteryTouch {
	public static void main(String[] args) {
        String head = "shoulders";
        String knees = "toes"; 
        String elbow = "head";
        String eye = "eyes and ears";
        String ear = "eye"; 
        
        touch(ear, elbow);
        touch(elbow, ear); 
        touch(head, "elbow"); 
        touch(eye, eye);
        touch(knees, "Toes"); 
        touch(head, "knees " + knees );
    }
    
    public static void touch(String elbow, String ear) { 
        System.out.println( "touch your " + elbow + " to your " + ear );
    }


}
