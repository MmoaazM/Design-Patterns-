package PortalType;

public class KidsPortal implements PortalType {
    @Override
    public boolean validateAnswerText(String answer) {
        if(answer.contains("slang")){
            System.out.println("slang detected in kids mode");
            return false;
        }
        return true;
    }
}
