package org.maroubra.pemsserver.api.models;

public class Actuator{
    private String ActuatorName;
    private boolean state;

    public Actuator(){

    }

    public Actuator(String ActuatorName, boolean false)
    {
        this.ActuatortName = ActuatorName;
        this.state = false;  // Initial actuator state is close.
    }

    public void setActuatorName(String newActuatorName){
        ActuatorName = newActuatorName;
    }

    public void activateActuator(){
        this.state = true;
    }

    public void deactivateActuator(){
        this.state = false;
    }

    public boolean getState(){
        return state;
    }

}