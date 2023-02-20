public class programm {
        public static void main(String[] args) throws Exception {
            Car car = new Car("volvo", 2015, 1150000, "grey", 1.9, 6);
            Car car2 = new Car("honda", 2047, 1000000, "blue" 1.7, 7);
            car.getinfo();
            car2.getinfo();
            System.out.println("Приветствую вас на гонках двух машин: volvo и honda!");
            System.out.println("---------------------------------------------------");
  
            VendingMachine vendingMachine = new VendingMachine(20);
            vendingMachine.add(new Product("apple", 13));
            vendingMachine.add(new Product("orange", 10));
            vendingMachine.add(new Product("pear", 15));
            vendingMachine.add(new Product("grape", 40));
            vendingMachine.add(new Product("banana", 12));
            System.out.println(vendingMachine.getProductByName("apple"));
            System.out.println(vendingMachine.getProductCost(13)); 
    
        }
        static void races(int dist, Car car, Car car2) {
            int s = dist;
            int s2 = dist;
            int count = 0;
            int count2 = 0;
            if (car.queue() == 0) {
                while (s >= 0 & s2 >= 0) {
                    s = s - car.speed();
                    count += 1;
                    s2 = s2 - car2.speed();
                    count2 += 1;
    
                }
                if (s > s2) {
                    System.out.println("Победу одержала машина" + " " + car2.getModel() + "," + " " + "Расстояние пройдено за"
                            + " " + count + " " + "секунд");
    
                } else {
                    System.out.println("Победу одержала машина" + " " + car.getModel() + "," + " " + "Расстояние пройдено за"
                            + " " + count2 + " " + "секунд");
    
                }
            }else {
                while (s >= 0 & s2 >= 0) {
                    s2 = s2 - car.speed();
                    count += 1;
                    s = s - car2.speed();
                    count2 += 1;
    
                }
                if (s > s2) {
                    System.out.println("Победу одержала машина" + " " + car2.getModel() + "," + " " + "Расстояние пройдено за"
                            + " " + count + " " + "секунд");
    
                } else {
                    System.out.println("Победу одержала машина" + " " + car.getModel() + "," + " " + "Расстояние пройдено за"
                            + " " + count2 + " " + "секунд");
    
                }
    
            }
    
        }
    }   
}
