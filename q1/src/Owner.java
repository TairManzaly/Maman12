public class Owner {
    private String name;
    private
    String telephone;

    Owner(String name, String telephone){
        this.name = name;
        this.telephone = telephone;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getTelephone(){
        return telephone;
    }
    public void setTelephone(String tel){
        this.telephone = tel;
    }
    @Override
    public String toString(){
        return  name+", "+ telephone;
    }

}
