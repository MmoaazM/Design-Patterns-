package EmailFromats;
import QuestionAsker.*;

public class FormatFactory {
 public FormattingEmail create(User questionAsker){
    if(questionAsker instanceof ProUser){
        System.out.println("pro user Email Formatting -> (HTML message)");
        return new ProFormat();
    }
    else if(questionAsker instanceof FreeUser){
        System.out.println("free user Email Formatting -> (text message)");
        return new StandardFormat();
    }
    else {
        System.out.println("invalid answer format");
        return null;
    }
}
}
