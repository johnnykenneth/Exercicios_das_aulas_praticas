public class exe3 {
    public static boolean elementoExiste(String[] itens, String busca){
        for (String item : itens) {
            if (item.equals(busca)) {
                return true;        
            }   
        }
        return false;
    }
    public static void main(String[] args) 
    {
        
        String[] itens= {"ferramenta", "maca", "caderno", "lapis"};

System.out.println(elementoExiste(itens,"lapis"));
    }
}
