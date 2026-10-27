package new_hospital;

abstract class MedicalService {
    String serviceId;
    String serviceName;
    double baseCost;

    MedicalService(String serviceId, String serviceName, double baseCost) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.baseCost = baseCost;
    }

    abstract double calculateTotalCost();

    public void displayServiceInfo() {
        System.out.println("Service ID: " + serviceId);
        System.out.println("Service: " + serviceName);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

// Consultation
class Consultation extends MedicalService {
    double doctorFee;

    Consultation(String serviceId, String serviceName, double baseCost, double doctorFee) {
        super(serviceId, serviceName, baseCost);
        this.doctorFee = doctorFee;
    }

    @Override
    double calculateTotalCost() {
        return baseCost + doctorFee;
    }
}

// Laboratory Test
class LaboratoryTest extends MedicalService {
    double testCharge;

    LaboratoryTest(String serviceId, String serviceName, double baseCost, double testCharge) {
        super(serviceId, serviceName, baseCost);
        this.testCharge = testCharge;
    }

    @Override
    double calculateTotalCost() {
        return baseCost + testCharge;
    }
}

// Ultrasound
class Ultrasound extends MedicalService {
    double additionalFee;

    Ultrasound(String serviceId, String serviceName, double baseCost, double additionalFee) {
        super(serviceId, serviceName, baseCost);
        this.additionalFee = additionalFee;
    }

    @Override
    double calculateTotalCost() {
        return baseCost + additionalFee;
    }

    static void main() {

        Consultation c1 = new Consultation("S001", "Consultation", 15, 10);
        LaboratoryTest l1 = new LaboratoryTest("S002", "Laboratory Test", 10, 8);
        Ultrasound u1 = new Ultrasound("S003", "Ultrasound", 30, 10);

        double totalBill = c1.calculateTotalCost()
                + l1.calculateTotalCost()
                + u1.calculateTotalCost();

        System.out.println("===== HOSPITAL BILLING SYSTEM =====");
        System.out.println();

        c1.displayServiceInfo();
        System.out.println();

        l1.displayServiceInfo();
        System.out.println();

        u1.displayServiceInfo();
        System.out.println();

        System.out.println("------------------------------");
        System.out.println("Total Hospital Bill: $" + totalBill + "0");
    }
}







