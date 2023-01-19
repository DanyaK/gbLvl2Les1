package lvl2les1;

public class Main {
    public static void main(String[] args) {

        // Сделал массив через интерфейс. Прокатывает ли это под условия "не наследуются от одного класса"?
        Participant[] participants = {new Human(1, 10), new Cat(3, 20), new Robot(10, 50)};

//        for (Participant participant : participants) {
//            participant.jump();
//            participant.run();
//        }

        Obstacle[] obstcls = {new Wall(), new Wall(2), new Treadmill(2), new Treadmill(10), new Wall(5)};

        System.out.println("=======================");
        for (Participant participant : participants) {

            participant.myName();

            for (Obstacle obs : obstcls) {
                if (participant.getStatus()) {
                    obs.showName();
                    System.out.println("Limit of obstacle: " + obs.getLimit());

                    if (obs instanceof Wall) {
                        if (((Wall) obs).height <= participant.getHeightLimit() && participant.getStatus()) {
                            participant.jump();
//                            System.out.println(participant.getStatus());
                        } else {
                            participant.setStatus(false);
//                            System.out.println(participant.getStatus());
                            System.out.println("THIS ONE HAS FINISHED W");
                        }
                    }

                    if (obs instanceof Treadmill) {
                        if (((Treadmill) obs).length <= participant.getLengthLimit() && participant.getStatus()) {
                            participant.run();
//                            System.out.println(participant.getStatus());

                        } else {
                            participant.setStatus(false);
//                            System.out.println(participant.getStatus());
                            System.out.println("THIS ONE HAS FINISHED T");
                        }
                    }
                }

            }
            System.out.println("=======================");
        }


    }
}
