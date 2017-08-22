import java.awt.*;
import java.util.HashMap;


public class RectFactory {

     private static final HashMap<Color, MyRecg>  rectByColor = new HashMap<>();

     public static MyRecg getRect(Color color){

         MyRecg rect = rectByColor.get(color);

         if(rect == null){
            rect = new MyRecg(color);
            rectByColor.put(color, rect);

         }
         return rect;
     }
}
