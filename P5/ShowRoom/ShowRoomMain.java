package P5.ShowRoom;

public class ShowRoomMain {
    public static void main(String[] args) {
        String[][] carDetails = {
            {"BMW", "M2 Coupe", "2016"},
            {"Ford", "Fiesta ST", "2014"},
            {"Nissan", "370Z", "2009"},
            {"Subaru", "BRZ", "2014"},
            {"Subaru", "Impreza WRX STI", "2013"},
            {"Toyota", "AE86 Trueno", "1986"},
            {"Toyota", "86/GT86", "2014"},
            {"Volkswagen", "Golf GTI", "2014"}
        };
        int [][] top = {
            {6816,728},
            {3921,575},
            {4360,657},
            {4058,609},
            {6255,703},
            {3700,553},
            {4180,609},
            {4180,631}
        };
        ShowRoom10 car = new ShowRoom10();

        System.out.println("Top Acceleration tertinggi adalah: "+ car.TopAcc(top, 0,0,top.length-1));
        System.out.println("Top Acceleration terendah adalah: "+ car.MinAcc(top, 0,0,top.length-1));
        System.out.println("Rata rata Top Power : "+ car.Rata(top,1));
    }
}
