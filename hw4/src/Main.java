import ibadts.Queue;

public class Main {
    public static void main(String[] args) {
        Queue <String> bus_c = new Queue<>();
        Queue <String> econ_c = new Queue<>();


        String [] business = {"Sir A", "Madame B", "Rick_C"};
        for (String x:business){
            bus_c.enqueue(x);
        }
        String [] economy = {"Sara A", "John B", "Wendy C"};
        for (String x:economy){
            econ_c.enqueue(x);
        }

        while (!econ_c.isEmpty()&&!bus_c.isEmpty()){
            
            System.out.println(bus_c.dequeue());
            System.out.println(bus_c.dequeue());
            System.out.println(econ_c.dequeue());
        }


    }
}