package me.damiankaras.ev3cubesolver.brick;

import lejos.hardware.Button;
import me.damiankaras.ev3cubesolver.brick.Motors.ArmMotor;
import me.damiankaras.ev3cubesolver.brick.Motors.BasketMotor;
import me.damiankaras.ev3cubesolver.brick.Motors.MotorManager;
import me.damiankaras.ev3cubesolver.brick.Motors.SensorMotor;

public class Main {

//    static MotorManager motorManager;
//    static BasketMotor basketMotor;
//    static ArmMotor armMotor;
//    static SensorMotor sensorMotor;

    public static void main(String[] args) {



        System.out.println("Hi");

        Controller controller = Controller.getInstance();
        Network net = Network.getInstance();




//        motorManager = MotorManager.getInstance();
//
//        basketMotor = motorManager.getBasketMotor();
//        armMotor = motorManager.getArmMotor();
//        sensorMotor = motorManager.getSensorMotor();
//
//        sensorMotor.resetPosition();
//        armMotor.resetPosition();
//        basketMotor.resetPosition();

//        Cube cube = new Cube();


//
//        basketMotor.setSpeed(360);
//        System.out.println("Speed: " + basketMotor.getSpeed());
//        long t = System.currentTimeMillis();
//        basketMotor.rotate(BasketMotor.CW, 360, true);
//        new Timer().scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println(basketMotor.getPos());
//            }
//        }, 0, 375);
//
//
//        System.out.println("Time: " + (System.currentTimeMillis() - t));
//
//
//        for(int i=0; i<10000; i++) {
//            System.out.println(basketMotor.getTacho());
//        }
//
//
//
//
//
//        Button.LEFT.addKeyListener(new KeyListener() {
//            @Override
//            public void keyPressed(Key key) {
//                Motor.C.forward();
//            }
//
//            @Override
//            public void keyReleased(Key key) {
//                Motor.C.stop();
//                System.out.println(Motor.C.getTachoCount());
//
//            }
//        });
//        Button.RIGHT.addKeyListener(new KeyListener() {
//            @Override
//            public void keyPressed(Key key) {
//                Motor.C.backward();
//            }
//
//            @Override
//            public void keyReleased(Key key) {
//                Motor.C.stop();
//                System.out.println(Motor.C.getTachoCount());
//            }
//        });
//        Button.RIGHT.addKeyListener(new KeyListener() {
//            @Override
//            public void keyPressed(Key key) {
//
//                sensorMotor.setPosition(SensorMotor.CENTER, false);
//            }
//
//            @Override
//            public void keyReleased(Key key) {
//
//            }
//        });
//
//
//        Button.ENTER.addKeyListener(new KeyListener() {
//            @Override
//            public void keyPressed(Key key) {
//                sensorMotor.setPosition(SensorMotor.BACKED_OFF, false);
//            }
//            @Override
//            public void keyReleased(Key key) {
//
//            }
//        });
//        Button.UP.addKeyListener(new KeyListener() {
//            @Override
//            public void keyPressed(Key key) {
//                sensorMotor.setPosition(SensorMotor.CORNER, false);
//            }
//            @Override
//            public void keyReleased(Key key) {
//
//            }
//        });
//
//        Button.DOWN.addKeyListener(new KeyListener() {
//            @Override
//            public void keyPressed(Key key) {
//                sensorMotor.setPosition(SensorMotor.EDGE, false);
//            }
//            @Override
//            public void keyReleased(Key key) {
//
//            }
//        });
//
//        Button.ESCAPE.addKeyListener(new KeyListener() {
//            @Override
//            public void keyPressed(Key key) {
////              colorScanner.scan();
//                sensorMotor.setPosition(SensorMotor.IDLE, false);
//            }
//            @Override
//            public void keyReleased(Key key) {
//            }
//        });
//
//
//            Button.ENTER.addKeyListener(new KeyListener() {
//            @Override
//            public void keyPressed(Key key) {
//
//                Cube cube = new Cube();
//                cube.scan();
//                cube.solve();
//
//            }
//            @Override
//            public void keyReleased(Key key) {
//
//            }
//        });
//
//
//            Button.LEFT.addKeyListener(new KeyListener() {
//            @Override
//            public void keyPressed(Key key) {
//                Logger.logAndSend("RR");
//            }
//            @Override
//            public void keyReleased(Key key) {
//
//            }
//        });

        Button.ESCAPE.waitForPress();
    }






}
