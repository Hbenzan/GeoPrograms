public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        plane.pausetime=0;
        plane.trailWidth=3;

        //write a for loop that does something 70 times
//        for(int h=0;h<=800;h=h+10) {
//            System.out.println(h);
//            rowOfSquares(h);
//        }

        practiceLoops();

    }//end of go method

    public void practiceLoops(){

        for(int x=2;x<=10;x=x+2){
            System.out.println(x);
        }

        for(int x=150;x<=162;x=x+3){
            System.out.println(x);


            for (int h=200; h>=100;h=h-10){
                System.out.println(h);
            ;

            }
        }


    }//end of practiceLoops

    public void rowOfSquares(int yCoord) {

        int squareSize = 10;
        for(int x=0;x<=1000/squareSize;x=x+1)
        {
            System.out.println(x);


            plane.teleport(x*squareSize,yCoord);
            plane.square(squareSize);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));


        }
    } ///end of rowOfSquares

} //end of class
