package anonymousclass;

public class AnonymousClass 
{

    public static void main(String[] args) 
    {
       ActionAfterClick x = () -> {
           System.out.println("I'm action from anonymous class");
       };
       
       ActionAfterClick2 x2 = (a, b) -> a + b;
       
       Button p = new Button();
       Button p2 = new Button();
       
       p2.addAction(new ActionAfterClick() {

           @Override
           public void action() {
               System.out.println("I'm action from anonymous class for button p2");
           }
       });
       p.addAction(x);
       
       int result =  p.addAction2(10, 15, x2);
       
        System.out.println(result);
    }
    
}

interface ActionAfterClick //REPRESENTS BEHAVIOUR
{
    void action();
}

interface ActionAfterClick2
{
    int action2(int a, int b);
}
class Button 
{
    void addAction(ActionAfterClick a)
    {
        
        a.action();//
    }
    
    int addAction2(int x, int y, ActionAfterClick2 a)
    {
       return a.action2(x, y);
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