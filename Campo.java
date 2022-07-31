package JogoDaVelha;

public class Campo {
    private char símbolo;
    public Campo(){
        this.símbolo=' ';

    }
    public char getSímbolo(){
        return this.símbolo;
    }
    public void setSímbolo(char símbolo){
       if(this.símbolo== ' '){
           this.símbolo=símbolo;
        }else{
            System.out.print("Campo já usado");
            
        } 

    }

}
