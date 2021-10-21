package edu.parinya.softarchdesign.structural;

import java.util.ArrayList;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    ArrayList<HealthcareServiceable>  healthcareWorkers;

    public HealthcareWorkerTeam() {
        this.healthcareWorkers = new ArrayList();
    }

    public void addMember(HealthcareServiceable worker) {
        this.healthcareWorkers.add(worker);
    }

    public void removeMember(HealthcareWorker worker) {
        this.healthcareWorkers.remove(worker);
    }

    public void service() {
        for (HealthcareServiceable member : this.healthcareWorkers){
            member.service();
        }
    }

    public double getPrice() {
        double totalPrice = 0;
        for (HealthcareServiceable member : this.healthcareWorkers){
            totalPrice += member.getPrice();
        }
        return totalPrice;
    }

}
