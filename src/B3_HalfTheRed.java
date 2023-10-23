public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.setColor(0, 0, 255);   // Sets the trail color Red, Green, Blue; max value of 255, min 0
        plane.teleport(100, 100);
        plane.showBackGround(); // makes image appear (line 12 in RunMyProgram

        // plane.fillCircle(100);           // Draws a circle of radius 100 and fills it in
        plane.pausetime=0;         // Sets how long the plane pauses each time it moves,
        System.out.println("asdfghjk");

        System.out.println(plane.howMuchRed());

        firstFilters();

        refshortsfilter();


        for (int row = 225; row < 470; row = row + 1) {
            for (int col = 229; col < 280; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);
                if (red >= 190 && green < 100) {
                    plane.setPixelColor(0, 0, 255);

                }

            }
        }
// for popcorn color change
        for (int row = 71; row < 120; row = row + 1) {
            for (int col = 209; col < 255; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);


//                if (red >= 0 && green < 0) {
//                    plane.setPixelColor(0, 0, 255);
//
//                }
                if (red > 200 && red < 260) {
                    plane.setPixelColor(0, 250, 0);

                }

            }
        }
        //sun
        plane.teleport(600, 100);
        plane.trailWidth = 4;
        plane.setColor(230,200,50);
        plane.circle(10);

        //sun rays
        plane.teleport(574,89);
        plane.startingAngle(180);
        plane.move(20);
        plane.teleport(580,143);
        plane.startingAngle(160);
        plane.move(20);
        plane.teleport(614,170);
        plane.startingAngle(127);
        plane.move(20);
        plane.teleport(658,182);
        plane.startingAngle(100);
        plane.move(20);

        //Score Board
        plane.teleport(220,73);
        plane.trailWidth = 10;
        plane.setColor(255,255,255);
        plane.startingAngle(0);
        plane.move(30);
        plane.startingAngle(90);
        plane.move(30);
        plane.startingAngle(180);
        plane.move(30);

        plane.isTrail=false;
        plane.startingAngle(0);
        plane.move(30);

        plane.isTrail=true;
        plane.startingAngle(90);
        plane.move(30);
        plane.startingAngle(180);
        plane.move(30);

        plane.teleport(298,109);
        plane.startingAngle(0);
        plane.move(30);

       plane.teleport(380,75);
      plane.startingAngle(0);
       plane.move(40);
     plane.startingAngle(90);
     plane.move(60);
     plane.startingAngle(180);
     plane.move(40);
     plane.startingAngle(270);
    plane.move(60);


    }

    public void firstFilters() {
        for (int row = 0; row < 800; row = row + 1) {
            for (int col = 0; col < 1000; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);
                //for ref jersey
                if (red >= 160 && green < 140 && blue <= 120 && col < 150 && row < 310 && row > 215) {
                    plane.setPixelColor(plane.random(0, 255), 10, 230);
                }

                //for color of grass
                if (red >= 97 && red <= 145 && green > 120 && green < 160 && blue > 56 && blue < 100) {
                    plane.setPixelColor(170, 230, 87);

                }//for Hayes jersey
                if (red >= 178 && green > 180 && blue > 186 && col < 525 && col > 310 && row < 600 ) {
                    plane.setPixelColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));

                }
            }
        }

    }
    public void refshortsfilter(){
        for (int row = 300; row < 450; row = row + 1) {
            for (int col = 45; col < 113; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);


                //for ref shorts
                if (red < 75 && green < 75 && blue <= 80 && col < 200 ) {
                    plane.setPixelColor(plane.random(0,255), 200, 230);

                }


            }
        }
    }

}


/* 

// Below is a list of the variables in plane and how to set them:

   plane.anglefacing=90 ;     // Sets the angle the plane is facing
	plane.xpos=100;            // Sets the xposition of the plane
	plane.ypos=100;            // Sets the yposition of the plane
   plane.isTrail=false;       // Sets if the plane has a trail
   plane.trailWidth=1;        // Sets the width of the trail from the plane
   plane.pausetime=1;         // Sets how long the plane pauses each time it moves, 
                                 make this bigger to watch the drawing happen
   
// Below are all the methods the plane can use:

   System.out.println("fun" + variable);  // Prints text to the window + the value of the variable
   plane.drawWords("this is fun");  // Prints text to the applet at the location of the plane
   plane.circle(10);                // Draws a circle of radius 10
   plane.square(50);                // Draws a square with side length 50, 
                                      the plane finishes in the same direction it starts  
   plane.house(100);                // Draws a house with a bottom edge of 100
   plane.fillCircle(100);           // Draws a circle of radius 100 and fills it in
   plane.move(100);                 // Moves the plane forward (the direction it is facing) 100 pixels
   plane.teleport(111, 222);        // Relocates the plan to the x position 111 and the y position 222, 
                                      there is no trail with teleport
   plane.turn(90);                  // Turns the plan 90 degrees counterclockwise
   plane.setColor(255, 255, 255);   // Sets the trail color Red, Green, Blue; max value of 255, min 0
   plane.setPixelColor(255, 255, 255);  // Sets the pixel color at the plane's location to Red, Green, Blue; max value of 255, min 0
   plane.howMuchBlue();             // Returns a number between 0 and 255 describing how much blue there is
   plane.howMuchGreen();            // Returns a number between 0 and 255 describing how much green there is
   plane.howMuchRed();              // Returns a number between 0 and 255 describing how much red there is
   plane.random(0, 100);            // Returns an integer on the interval 0 to 99
   
*/