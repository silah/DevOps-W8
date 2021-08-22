package revolut;

public class PaymentService {
    private String serviceName;
    private boolean acceptOrReject;


    public PaymentService(String name){

        this.serviceName = name;
    }

    public void setAcceptance(boolean b) {
        this.acceptOrReject = b;
    }
    public boolean getAcceptance() {
        return acceptOrReject;
    }

    public String getType() {
        return serviceName;
    }

}
