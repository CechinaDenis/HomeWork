package ecollege;

/**
 * @author Denis Cechina
 */
public class VowelCount {
    public String vowelCount(String message){
        char[] cMessage = message.toCharArray();
        int a=0, e=0, i=0, o=0, u=0, total=0;
        
        for (int index=0;index<cMessage.length;index++){
            switch (cMessage[index]){
                case 'a':
                    a++;
                    total++;
                    break;
                case 'e':
                    e++;
                    total++;
                    break;
                case 'i':
                    i++;
                    total++;
                    break;
                case 'o':
                    o++;
                    total++;
                    break;
                case 'u':
                    u++;
                    total++;
                    break;
                case 'A':
                    a++;
                    total++;
                    break;
                case 'E':
                    e++;
                    total++;
                    break;
                case 'I':
                    i++;
                    total++;
                    break;
                case 'O':
                    o++;
                    total++;
                    break;
                case 'U':
                    u++;
                    total++;
                    break;
                    
                default: break;
            }
        }
        return "No. of vowels: "+total+"\na count: "+a+"\ne count: "+e
                +"\ni count: "+i+"\no count: "+o+"\nu count: "+u;
    }
}
