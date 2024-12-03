package br.edu.unifei.ecot12.xmen97;

import java.util.HashMap;

public class RoboticSentinelFabric {

    private HashMap<Integer, RoboticSentinel> robots = new HashMap<Integer, RoboticSentinel>();

    public RoboticSentinel getRoboticSentinel(int model){
            if(robots.get(model) != null)
                return robots.get(model);
            else{
                RoboticSentinel r = new RoboticSentinel();
                r.setModel(model);
                robots.put(model,r);
                return r;
            }
    }

    public HashMap<Integer, RoboticSentinel> getRobots() {
        return robots;
    }

    public void setRobots(HashMap<Integer, RoboticSentinel> robots) {
        this.robots = robots;
    }

    
}
