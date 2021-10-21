package edu.parinya.softarchdesign.structural;

public class TaxPayingHealthcareWorker  extends HealthcareWorkerDecorator {

    public TaxPayingHealthcareWorker(HealthcareWorkerDecorator worker) {
        super(worker);
        System.out.println("TaxPaying");
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.1;
    }
}
