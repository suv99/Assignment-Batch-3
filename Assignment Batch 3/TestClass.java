
import java.util.Objects;


class Bird {
    
    private int id;
    public static float height;
    private double price;
    private boolean isRed;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isIsRed() {
        return isRed;
    }

    public void setIsRed(boolean isRed) {
        this.isRed = isRed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird{" + "id=" + id + ", height=" + height + ", price=" + price + ", isRed=" + isRed + ", name=" + name + '}';
    }
    
    public void fly(){
        System.out.println("Bird " +name+" is flying...");
    }

 // This method returns the hash code value 
// for the object on which this method is invoked.
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 97 * hash + (this.isRed ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

// This method checks if some other Object
// passed to it as an argument is equal to 
// the Object on which it is invoked.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bird other = (Bird) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (this.isRed != other.isRed) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}


class TestClass{
    
    public static Bird bird;

    public static void initBird() {
        bird = new Bird();
        bird.setId(1);
        bird.setIsRed(true);
        bird.setName("Cardinal");
        bird.setPrice(5000.00);
        Bird.height = (float)12.2;
               
    }
    
    
    
    public static void main(String[] args) {
        initBird();
        System.out.println(bird);
        bird.fly();
        System.err.println(add(1,2,3));
        System.out.println(add(1l,2l,3l));
    }
    
    public static int add(int... num) {
        int sum = 0;
        for (int i = 0; i < num.length; ++i) {
            sum += num[i];
        }
        return sum;
    }
    
    public static String add(long... num) {
        String sum = "";
        for (int i = 0; i < num.length; ++i) {
            sum += num[i];
        }
        return sum;
    }
    
}