/*
write a java program to implement the multi level inheritance conecpt

create a class called as wood and write its characteristics such as

weight = 500  kgs, type of wood = teek wood, price of log = 2500

create another class called furniture which takes the property as type of furniture = chair, bed etc, and noo of wood required =  75 kg and type of wood

create another class called showroom, which has the property of product - chair, type of product - dinning/ sofa set ,price of product - 45000/


Report of a product

product name = sofaset

price of product - 45000

type of wood - teak wood

amount of wood used - 800 kg

cost of wood - 35000

*/
class wood{
    int weight=500;
    String typeOfWood = "Teak";
    float priceOfLog=2300.50f;
}

class furniture extends wood{
    String type = "Dining Table";
    int numOfWood = 3;
}

class showroom extends furniture{
    String propOfProd = "6-Table Set";
    float priceOfProd = 4500.00f;
}   

class multi{
    public static void main(String ar[]){
        showroom s =new showroom();
        System.out.println(s.priceOfLog);
        System.out.println(s.type);
        System.out.println(s.propOfProd);
        System.out.println(s.priceOfProd);
    }
}