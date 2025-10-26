package lab11;

public class pr1 {
    public static void main(String[] args) {
        Base b = new Base();
        SamePackage sp = new SamePackage();
        Sub sub = new Sub();

        System.out.println("Доступ из main (тот же пакет)");
        //System.out.println(b.priv);  //ошибка: private недоступен
        //b.mPriv();                   //ошибка: private недоступен

        System.out.println("pack  = " + b.pack);   //OK (package-private)
        System.out.println("prot  = " + b.prot);   //OK (protected в том же пакете)
        System.out.println("publ  = " + b.publ);   //OK (public)

        b.mPack();                                  //OK
        b.mProt();                                  //OK
        b.mPubl();                                  //OK

        System.out.println("\nДоступ ВНУТРИ Base (все видны)");
        b.demoInside(); //здесь видно даже private

        System.out.println("\nНесвязанный класс того же пакета");
        sp.demo(); //private недоступен

        System.out.println("\nПодкласс в том же пакете");
        sub.demo(); //private недоступен; pack/prot/public — доступны

        System.out.println("\n(Примечание: для protected в ДРУГОМ пакете доступен только через наследование,");
        System.out.println("а через произвольный экземпляр Base — будет ошибка. Это отмечено в комментариях.)");
    }
}

class Base {
    private   int priv = 1;     //видно только внутри Base
              int pack = 2;     //(package-private) видно в пределах пакета lab11
    protected int prot = 3;     //видно в пакете lab11 + в наследниках из других пакетов
    public    int publ = 4;     //видно везде

    private   void mPriv() { System.out.println("mPriv()"); }
              void mPack() { System.out.println("mPack()"); }
    protected void mProt() { System.out.println("mProt()"); }
    public    void mPubl() { System.out.println("mPubl()"); }

    public void demoInside() {
        //внутри класса доступны все члены
        System.out.println("priv + pack + prot + publ = "
                + priv + " + " + pack + " + " + prot + " + " + publ);
        mPriv(); mPack(); mProt(); mPubl();
    }
}

class SamePackage {
    void demo() {
        Base b = new Base();
        //System.out.println(b.priv); //ошибка: private недоступен
        System.out.println("pack  = " + b.pack); // OK
        System.out.println("prot  = " + b.prot); // OK
        System.out.println("publ  = " + b.publ); // OK

        //b.mPriv();  //ошибка
        b.mPack();     //OK
        b.mProt();     //OK
        b.mPubl();     //OK
    }
}

class Sub extends Base {
    void demo() {
        //System.out.println(this.priv); // ошибка: private недоступен
        System.out.println("pack  = " + this.pack); //OK (тот же пакет)
        System.out.println("prot  = " + this.prot); //OK (наследник)
        System.out.println("publ  = " + this.publ); //OK

        //mPriv();   //ошибка
        mPack();      //OK
        mProt();      //OK
        mPubl();      //OK

        //Если бы этот класс был в другом пакете:
        //Base b = new Base();
        //b.prot;    //ошибка (protected нельзя через произвольный экземпляр в другом пакете)
        //b.mProt(); //ошибка
    }
}