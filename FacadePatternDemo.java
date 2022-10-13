
public class FacadePatternDemo
{
    public static void main(String[] args)
    {
        LayoutFacade layoutfacade = new LayoutFacade();

        int x = 40,y=65;
        layoutfacade.layoutForApp(x,y);
    }
}