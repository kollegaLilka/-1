package popo;


public class Gum extends Food {

    private String flavour;

 
    public Gum(String flavour) {
   
    super("Жевательная резинка");
   
    this.flavour = flavour;
    }
  
    public void consume() {
    System.out.println(this + " съедено");
    }
  
    public String getFlavour() {
    return flavour;
    }
    
    public void setFlavour(String flavour) {
    this.flavour = flavour;
    }
    
    public boolean equals(Object arg0) {
    if (super.equals(arg0)) { 
    if (!(arg0 instanceof Gum)) return false; 
    return flavour.equals(((Gum)arg0).flavour); 
    } else
    return false;
    }
 
    public String toString() {
    return super.toString() + " вкуса '" + flavour.toUpperCase() + "'";
    }
}


