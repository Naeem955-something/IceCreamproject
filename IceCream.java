
package IceCreamProject;
public class IceCream {
    private String IceCreamType;
    private String IceCreamCompany;
    private double IceCreamPrice;

    public IceCream(String IceCreamType, String IceCreamCompany, double IceCreamPrice) {
        this.IceCreamType = IceCreamType;
        this.IceCreamCompany = IceCreamCompany;
        this.IceCreamPrice = IceCreamPrice;
    }
    public String getIceCreamType(){
        return this.IceCreamType;
    }
    public String getIceCreamCompany(){
        return this.IceCreamCompany;
    }
    public double getIceCreamPrice(){
        return this.IceCreamPrice;
    }
    public void setIceCreamType(String IceCreamType){
        this.IceCreamType = IceCreamType;
    }
    public void setIceCreamCompany(String IceCreamCompany){
        this.IceCreamCompany = IceCreamCompany;
    }
    public void setIceCreamPrice(double IceCreamPrice){
        this.IceCreamPrice = IceCreamPrice;
    }

    public boolean equals(IceCream I){
        if(this.IceCreamType.equals(I.IceCreamType)
        && this.IceCreamCompany.equals(I.IceCreamCompany)
        && this.IceCreamPrice == I.IceCreamPrice){
            return true;
        }
        else{
            return false;
        }
    }
    public int comapareTo(IceCream I){
        if(this.IceCreamPrice > I.IceCreamPrice) return 1;
        else if(this.IceCreamPrice == I.IceCreamPrice) return 0;
        else return -1;
    }
    public String toString(){
        return this.IceCreamType + " " + this.IceCreamCompany + " " + this.IceCreamPrice;
    }
}