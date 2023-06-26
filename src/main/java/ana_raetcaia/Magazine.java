package ana_raetcaia;

 class Magazine implements Printable{
   private final String name;
   private  final String street;
   private final   String owner;

   public Magazine(String name, String street, String owner){
       this.name = name;
       this.street = street;
       this.owner = owner;
   }
     @Override
     public String toString() {
         return "Name of magazine: " + name + ". " + "Name of street: " + street + ". " + "Owner: " + owner;
     }

 }
