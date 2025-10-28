package lab22;

class A {
    int a;
    int b;
    int c;
    int z;

    //базовый конструктор
    public A() {
        z = 1;
    }

    //вызывает конструктор без параметров
    public A(int a) {
        this();        //вызов A()
        this.a = a;
    }

    //вызывает конструктор с одним параметром
    public A(int a, int b) {
        this(a);        //вызов A(int a)
        this.b = b;
    }

    //вызывает конструктор с двумя параметрами
    public A(int a, int b, int c) {
        this(a, b);     //вызов A(int a, int b)
        this.c = c;
    }
}
