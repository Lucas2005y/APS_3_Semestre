public class Respostas{

    //Perguntas
    private String PerguntaUm;
    private String PerguntaDois;
    private String PerguntaTres;
    private String PerguntaQuatro;
    private String PerguntaCinco;
    private String PerguntaSeis;

    //Respostas
    private String temaUm[] = new String[6];
    private String temaDois[] = new String[6];
    private String temaTres[] = new String[6];
    private String temaQuatro[] = new String[6];
    private String temaCinco[] = new String[6];
    private String temaSeis[] = new String[6];
    
    //Construtor atribui os temas na classe
   Respostas(){
    //Perguntas
    String pergunta = "Dentre as opções abaixo, qual é considerada como consequência do aquecimento global?";
    setPerguntaUm(pergunta);
    pergunta = "Qual é um dos principais poluentes aquáticos mencionados no texto sobre poluição da água?";
    setPerguntaDois(pergunta);
    pergunta = "Assinale a alternativa incorreta:";
    setPerguntaTres(pergunta);
    pergunta = "Qual das alternativas abaixo NÃO são consequências geradas pela poluição do ar?";
    setPerguntaQuatro(pergunta);
    pergunta = "É correto afirmar que a Gestão de Resíduos trata-se de: \n   I - Reciclagem.\n"+
    "   II - Descarte adequado de resíduos que são considerados tóxicos.\n"+
    "   III - Controle da disposição de aterros sanitários.\n"+
    "   IV - Compostagem.\n"+
    "   V - Conscientizar a população a respeito da importância dos cuidados necessários.";
    setPerguntaCinco(pergunta);
    pergunta = "Quais são os tipos de recursos naturais e suas respectivas características?";
    setPerguntaSeis(pergunta);
    
    //Respostas
    String textoUm[] = new String[6];
    textoUm[0]= "a) Aumento da camada de ozônio";
    textoUm[1]= "b) Derretimento das calotas polares";
    textoUm[2]= "c) Redução da frequência de eventos climáticos extremos";
    textoUm[3]= "d) Estabilização das temperaturas globais";
    textoUm[4]= "e) Diminuição na intensidade dos furacões";
    //aternativa correta
    textoUm[5]= "b";
    setTemaUm(textoUm);

    String textoDois[] = new String[6];
    textoDois[0]= "a) Dióxido de carbono";
    textoDois[1]= "b) Poluentes atmosféricos";
    textoDois[2]= "c) Efluentes domésticos";
    textoDois[3]= "d) Metais pesados";
    textoDois[4]= "e) Fertilizantes agrícolas";
    //aternativa correta
    textoDois[5]= "d";
    setTemaDois(textoDois);

    String textoTres[] = new String[6];
    textoTres[0]= "a) O desmatamento não tem um impacto limitado apenas nas comunidades indígenas, afetando outras áreas";
    textoTres[1]= "b) O desmatamento é uma prática que visa exclusivamente o desenvolvimento econômico das comunidades locais";
    textoTres[2]= "c) A remoção da cobertura vegetal causada pelo desmatamento é responsável pela diminuição da qualidade da água local";
    textoTres[3]= "d) A prática do desmatamento influencia na biodiversidade e nos padrões climáticos";
    textoTres[4]= "e) O desmatamento contribui para o aumento das emissões de gases de efeito estufa";
    //aternativa correta
    textoTres[5]= "b";
    setTemaTres(textoTres);

    String textoQuatro[] = new String[6];
    textoQuatro[0]= "a)	Deterioração da qualidade do ar.";
    textoQuatro[1]= "b)	Condições precárias na qualidade do ar em áreas rurais, afetando diretamente o solo e a produção agrária.";
    textoQuatro[2]= "c)	Partículas de fuligem, como por exemplo, a PM2,5 que se inalada por seres humanos, causa graves deficiências\nna saúde, podendo ocasionar a morte.";
    textoQuatro[3]= "d)	Pode ser considerada, atualmente, o maior risco ambiental que afeta a saúde humana.";
    textoQuatro[4]= "e)	Aumento das chances de ter um ataque cardíaco";
    //aternativa correta
    textoQuatro[5]= "b";
    setTemaQuatro(textoQuatro);

    String textoCinco[] = new String[6];
    textoCinco[0]= "a) Apenas I, II e IV.";
    textoCinco[1]= "b) Apenas II e IV.";
    textoCinco[2]= "c) II, III e V.";
    textoCinco[3]= "d) Todas menos a III.";
    textoCinco[4]= "e) Todas estão corretas.";
    //aternativa correta
    textoCinco[5]= "e";
    setTemaCinco(textoCinco);

    String textoSeis[] = new String[6];
    textoSeis[0]= "a) Renováveis: não se esgota a curto prazo, mas sim a longo prazo;\n"+
    "Não renováveis: possuem apenas uma quantidade limitada, se esgotando com facilidade,\ne sem chance de algum dia voltarem.";
    textoSeis[1]= "b) Renováveis: não se esgota, mas sim se renova, porém de forma lenta;\n"+
    "Não renováveis: possuem apenas uma quantidade limitada a curto prazo, e podem demorar\n500 anos para se recompor.";
    textoSeis[2]= "c) Renováveis: não se esgota, mas sim se renova, porém de forma rápida; \n"+
    "Não renováveis: possuem apenas uma quantidade limitada a curto prazo, e podem demorar\naté meio milênio para se recompor.";
    textoSeis[3]= "d) Renováveis: demora mais tempo que os recursos não renováveis, mas se\n"+
    "esgota ao decorrer das ações humanas;\nNão renováveis: possuem apenas uma quantidade"+
    "limitada, porém demora para se esgotar, e sem chance de algum dia voltarem.";
    textoSeis[4]= "e) Renováveis: não se esgota, e só a intervenção humana pode auxiliar o processo de renovação deles;\n"+
    "Não renováveis: possuem apenas uma quantidade limitada a curto prazo, e podem demorar\naté meio milênio para se recompor.";
    //aternativa correta
    textoSeis[5]= "c";
    setTemaSeis(textoSeis);
   }


   public String[] getQualPergunta(String perguntaNum){
    //Armazena na posição 0, a pergunta. Nas posições de 1 a 5 as alternativas. Na posição 6, a resposta
    //{"Pergunta UM", "A", "B", "C", "D", "E", "Alternativa correta"}
    if(perguntaNum.equals("1")){
        String[] lista = getTemaUm();

        String[] saida =  {getPerguntaUm(), lista[0], lista[1], lista[2], lista[3], lista[4], lista[5]};
        return saida;
        
    }else{
        if(perguntaNum.equals("2")){
            String[] lista = getTemaDois();

            String[] saida = {getPerguntaDois(), lista[0], lista[1], lista[2], lista[3], lista[4], lista[5]};
            return saida;
        }else{
            if(perguntaNum.equals("3")){
                String[] lista = getTemaTres();
                
                String[] saida = {getPerguntaTres(), lista[0], lista[1], lista[2], lista[3], lista[4], lista[5]};       
                return saida;
           }else{
                if(perguntaNum.equals("4")){
                    String[] lista = getTemaQuatro();
                    
                    String[] saida = {getPerguntaQuatro(), lista[0], lista[1], lista[2], lista[3], lista[4], lista[5]};
                    return saida;    
                }else{
                    if(perguntaNum.equals("5")){
                        String[] lista = getTemaCinco();
                        
                        String[] saida = {getPerguntaCinco(), lista[0], lista[1], lista[2], lista[3], lista[4], lista[5]};  
                        return saida;  
                    }else{
                            String[] lista = getTemaSeis();
                            
                            String[] saida = {getPerguntaSeis(), lista[0], lista[1], lista[2], lista[3], lista[4], lista[5]};
                            return saida;
                        
                    }
                }
           }
        }

    }
 
   }


   //Set´s Perguntas

   public void setPerguntaUm(String entrada){
    this.PerguntaUm = entrada;
   }

   public void setPerguntaDois(String entrada){
    this.PerguntaDois = entrada;
   }

   public void setPerguntaTres(String entrada){
    this.PerguntaTres = entrada;
   }

   public void setPerguntaQuatro(String entrada){
    this.PerguntaQuatro = entrada;
   }

   public void setPerguntaCinco(String entrada){
    this.PerguntaCinco = entrada;
   }

   public void setPerguntaSeis(String entrada){
    this.PerguntaSeis = entrada;
   }

    //Set´s Respostas

   public void setTemaUm(String entrada[]){
    this.temaUm = entrada;
   }

   public void setTemaDois(String entrada[]){
    this.temaDois = entrada;
   }

   public void setTemaTres(String entrada[]){
    this.temaTres = entrada;
   }

   public void setTemaQuatro(String entrada[]){
    this.temaQuatro = entrada;
   }

   public void setTemaCinco(String entrada[]){
    this.temaCinco = entrada;
   }

   public void setTemaSeis(String entrada[]){
    this.temaSeis = entrada;
   }

   //Get's Perguntas

   public String getPerguntaUm(){
    return this.PerguntaUm;
   }

   public String getPerguntaDois(){
    return this.PerguntaDois;
   }

   public String getPerguntaTres(){
    return this.PerguntaTres;
   }

   public String getPerguntaQuatro(){
    return this.PerguntaQuatro;
   }

   public String getPerguntaCinco(){
    return this.PerguntaCinco;
   }

   public String getPerguntaSeis(){
    return this.PerguntaSeis;
   }

   //Get's Respostas

   public String[] getTemaUm(){
    return this.temaUm;
   }

   public String[] getTemaDois(){
    return this.temaDois;
   }

   public String[] getTemaTres(){
    return this.temaTres;
   }

   public String[] getTemaQuatro(){
    return this.temaQuatro;
   }

   public String[] getTemaCinco(){
    return this.temaCinco;
   }

   public String[] getTemaSeis(){
    return this.temaSeis;
   }
}