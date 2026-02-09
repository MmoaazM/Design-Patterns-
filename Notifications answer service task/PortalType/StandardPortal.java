package PortalType;

public class StandardPortal implements PortalType {
    @Override
    public boolean validateAnswerText(String answer) {
        if(answer.contains("bad_word")){
            System.out.println("Bad Word detected in standard mode");
            return false;
        }
        return true;
    }
}
