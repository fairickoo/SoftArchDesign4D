package edu.parinya.softarchdesign.structural;

public abstract class HealthcareWorkerDecorator extends HealthcareWorker {
    HealthcareWorker worker;

    public HealthcareWorkerDecorator(HealthcareWorker worker) {
        super(worker);
        System.out.print("Decorate "+worker.getName()+ " with ");
        this.worker = worker;
    }
    
    @Override
    public void service() {
        this.worker.service();
    }

    @Override
    public double getPrice() {
        return worker.getPrice();
    }
}
