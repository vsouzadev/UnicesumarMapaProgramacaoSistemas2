public class Main {
    public static void main(String[] args) {
        Suite suite1 = new Suite(520, "simples", 5, 500.00);
        Suite suite2 = new Suite(370, "Luxo", 10, 5500.00);
        Suite suite3 = new Suite(650, "Luxo", 5, 2500.00);
        
        Hospede hospede1 =  new Hospede("Carlos", "Centro", 50);
        Hospede hospede2 =  new Hospede("Maria", "Jardim Europa", 30);
        Hospede hospede3 =  new Hospede("João", "Vila Aparecida", 20 );
        
        Reserva reserva1 = new Reserva();
        
        System.out.println("Reserva 01\n");
        reserva1.Cadastrar(3, 3, suite3, hospede3);
        
        Reserva reserva2 = new Reserva();
        
        System.out.println("\n\nReserva 02\n");
        reserva1.Cadastrar(10, 23, suite2, hospede1);
        
        Reserva reserva3 = new Reserva();
        
        System.out.println("\n\nReserva 03\n");
        reserva1.Cadastrar(15, 5, suite1, hospede2);
    }
    
}
