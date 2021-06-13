
public class Classes1 {
    public static void main(String[] args) {
        
    }
}

public class Manager
{
    String name;
    String shift;
    double salary;
    int mid;
    
    public Manager() {
    }// default constructor;

    public Manager(String name, String shift, double salary, int mid) {
        this.name = name;
        this.shift = shift;
        this.salary = salary;
        this.mid = mid;
    }// parametised constructor

    public String getName() {
        return name;
    }

    public String getShift() {
        return shift;
    }

    public double getSalary() {
        return salary;
    }

    public int getMid() {
        return mid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }
    
    
    
}// ebd of manager class

public class Corder
{
    int orderid;
    String cname,phone,address,itemid;
    int qty;
    double total;
    String date;
    
    public Corder() 
    {
    } 
    
    public Corder(int orderid, String cname, String phone, String address, String itemid, int qty, double total, String date) {
        this.orderid = orderid;
        this.cname = cname;
        this.phone = phone;
        this.address = address;
        this.itemid = itemid;
        this.qty = qty;
        this.total = total;
        this.date = date;
    }

    public int getOrderid() {
        return orderid;
    }

    public String getCname() {
        return cname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getItemid() {
        return itemid;
    }

    public int getQty() {
        return qty;
    }

    public double getTotal() {
        return total;
    }

    public String getDate() {
        return date;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDate(String date) {
        this.date = date;
    }

   
    
}// ebd of Corder class

public class Item
{
    String itemid,dish,category;
    double price;

    public Item() {
    }

    public Item(String itemid, String dish, String category, double price) {
        this.itemid = itemid;
        this.dish = dish;
        this.category = category;
        this.price = price;
    }

    public String getItemid() {
        return itemid;
    }

    public String getDish() {
        return dish;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}// ebd of item class