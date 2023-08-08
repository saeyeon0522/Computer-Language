class StaticMethod {
    // static members belong to class
    int n;
    static int m;
    void f1(int x) {n = x;}
    void f2(int x) {f1(3);}
    void f3(int x) {this.n = x;}
    void f4(int x) {this.m = x;}

    //this keyword can't be used in static contexts
    static void s1(int x) {m = x;}
    static void s2(int x) {s1(10);}


}
