package atex.dev.spring.product.dto;

/**
 * Created by atex on 2020/5/15.
 */
public class ProductInfoDto {

    private int id;
    private String name;
    private double price;
    private int num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "{"+"\""+"id"+"\""+":"+id+","
                +"\""+"name"+"\""+":"+"\""+name+"\""+","
                +"\""+"price"+"\""+":"+price+"}";

    }
}
