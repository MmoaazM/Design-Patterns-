package PortalType;

public class PortalFactory {

    public PortalType createPortalType(String portalType){
        if(portalType.equalsIgnoreCase("Standard")){
            System.out.println("Standard portal created : curses detecting");
            return new StandardPortal();
        }
        else if(portalType.equalsIgnoreCase("Kids")){
            System.out.println("Kids portal created : slang are detecting");
            return new KidsPortal();
        }
        else{
            System.out.println("invalid portal type");
            return null;
        }
    }
}
