package hash;
public class EstruturaHashTable implements EstruturaDeDados{

    private Integer tabela[];

    public EstruturaHashTable() {
        tabela = new Integer[10];
    }

    public void showTable(){
        System.out.print("[");
        int i=0;
        while( i<tabela.length-1 ){
            System.out.print(tabela[i]+", ");
            i++;
        }
        if(i==tabela.length-1){
            System.out.print(tabela[i]);
        }
        System.out.print("]");
    }

    public int hash(int chave){
        int index = chave % tabela.length;
        return index;
    }

    public boolean isEmpty(Integer[] list,int index){
        if(list[index] == null){
            return true;
        }
        return false;
    }

    @Override
    public boolean insert(int chave) {
        // TODO quando inserir, se a posição estiver ocupada, o elemento NÃO é inserido e retorna false. Caso contrário, o elemento é inserido na posição calculada e retorna true.
        if(isEmpty(tabela, hash(chave))){
            tabela[hash(chave)] = chave;
            return true;
        }
        return false;
        
    }

    @Override
    public boolean delete(int chave) {
        // TODO quando inserir, se a posição estiver ocupada, torna o elemento da posição como null e retorna true. Caso contrário, retorna false.
        if(!isEmpty(tabela, hash(chave))){
            tabela[hash(chave)] = null;
            return true;
        }
        return false;
        
    }

    @Override
    public boolean search(int chave) {
        // TODO se a posição estiver ocupada e valor é o mesmo (ou seja, tem que ser ambos), retorna true. Caso contrário, retorna true.
        if(!isEmpty(tabela, hash(chave)) && tabela[hash(chave)] == chave){
            return true;
        }
        return false;
    }

    public Integer[] getTabela() {
        return tabela;
    }

    public void setTabela(Integer[] tabela) {
        this.tabela = tabela;
    }
    
    
}
