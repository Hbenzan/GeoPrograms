public class A7_practiceMethods extends World{

    public void go(){
        plane.pausetime = 1;
        plane.isTrail = true;
        drawH();


    }

    public void drawH(){
        plane.trailWidth = plane.random(5,20);
        plane.setColor( plane.random(0,255),plane.random(0,255),plane.random(0,255));
       plane.teleport(plane.random(300,500), plane.random(300,350));
       plane.turn(180);
        plane.move(200);
        plane.turn(270);
        plane.move(50);
        plane.turn(270);
        plane.move(75);
        plane.startingAngle(0);
        plane.move(50);
        plane.turn(90);
        plane.move(75);
        plane.startingAngle(0);
        plane.move(50);
        plane.startingAngle(90);
        plane.move(200);
        plane.startingAngle(180);
        plane.move(50);
        plane.startingAngle(270);
        plane.move(75);
        plane.startingAngle(180);
        plane.move(50);
        plane.startingAngle(90);
        plane.move(75);
        plane.startingAngle(180);
        plane.move(50);
       plane.isTrail=false;
        plane.startingAngle(0);
        plane.move(200);

        plane.isTrail=true;
        plane.startingAngle(270);
        plane.move(200);
        plane.startingAngle(0);
        plane.move(125);
        plane.startingAngle(90);
        plane.move(200);
        plane.startingAngle(180);
        plane.move(125);
        plane.isTrail=false;
        plane.startingAngle(-90);
        plane.move(100);
       plane.isTrail=true;
        plane.startingAngle(0);
        plane.move(125);
       plane.isTrail=false;
        plane.startingAngle(180);
        plane.move(107);
        plane.startingAngle(-90);
        plane.move(30);

        plane.isTrail=true;
        plane.startingAngle(0);
        plane.move(90);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(90);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);

        plane.isTrail=false;
        plane.startingAngle(90);
        plane.move(110);
        plane.startingAngle(0);

       plane.isTrail=true;
       plane.startingAngle(0);
        plane.move(90);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(90);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);





    }

}
