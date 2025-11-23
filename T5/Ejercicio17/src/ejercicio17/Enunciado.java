package ejercicio17;

/**
 * Test
 * @author Gabriel Acaro Sánchez
 */
public class Enunciado {
    // Atributos
    
    private String question;
    private String answer;
    
    //Constructores
    public Enunciado(){
        question = "";
        answer = "";
    }
    
    public Enunciado(String p, String r){
        question = p;
        answer = r;
    }
    
    //Getters/Setters

    public String getQuestion() {
        return question;
    }
    
    public void setQuestion(String pregunta) {
        this.question = pregunta;
    }
    
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String respuesta) {
        this.answer = respuesta;
    }
}
    
    
    

    

    