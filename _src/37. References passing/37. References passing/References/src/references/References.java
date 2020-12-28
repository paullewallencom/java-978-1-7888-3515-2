
package references;

public class References {

    public static void main(String[] args) {
        int a = 10;
        
        Test test = new Test();
        
        test.changeValue(a);
        
        System.out.println(a);
        
        Foo foo = new Foo();
        
        test.changeFoo(foo);
        
        System.out.println(foo.x);
    }
    
}

class Test
{
    void changeValue(int var) //int var = 10;
    {
        var = var + 5;
    }
    
    void changeFoo(Foo var)
    {
        var.x = var.x + 15;
    }
}

class Foo
{
    int x = 10;
}