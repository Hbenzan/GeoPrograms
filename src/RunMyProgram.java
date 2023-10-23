

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new B3_HalfTheRed()   );
        run.planeIcon = "/Users/hayesbenzan/Documents/CS 1/GeoPrograms 3/src/finalSoccerball copy.tiff";
        run.pictureFileName="/Users/hayesbenzan/Documents/CS 1/GeoPrograms 3/src/Milton academy soccer copy.jpg"; //exact file name including extendtion
        run.HEIGHT=800;
        run.WIDTH=1000;
        run.Refresh();

        //new Thread(run).start();
    }
}
