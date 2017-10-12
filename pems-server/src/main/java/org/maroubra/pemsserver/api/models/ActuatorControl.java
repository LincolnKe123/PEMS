package org.maroubra.pemsserver.api.models;

public class ControlActuator{
    public void ControlActuator(){
        List<Actuator> actuators = new ArrayList<Actuator>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of actuators: ");
        int countActuators = input,nextInt();

        for(int i=0; i< countActuators; i++){
            Actuator actuator = new Actuator();

            System.out.println("Enter the actuator name: ")
            actuator.setActuatorName(input.next());
            actuator.activateActuator();
            System.out.println("State of the Actuator:" + actutor.getSate());

        }

    }
}