package anonymousclass;

public class AnonymousClass 
{

    public static void main(String[] args) 
    {
       ActionAfterClick a = new ActionAfterClick() {

           @Override
           public void action() {
               System.out.println("I'm action from anonymous class");
           }
       };
       
       Button p = new Button();
       Button p2 = new Button();
       
       p2.addAction(new ActionAfterClick() {

           @Override
           public void action() {
               System.out.println("I'm action from anonymous class for button p2");
           }
       });
       p.addAction(a);
    }
    
}

interface ActionAfterClick
{
    void action();
}
class Button 
{
    void addAction(ActionAfterClick a)
    {
        
        a.action();//
    }

}


/*
    JButton
    button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            // do something.
        }
    });

*/