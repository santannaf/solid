package solid.interface_segregation.problem;

// Interface com muitos métodos
public interface MultiFuncMachine {
    void print(String doc);
    void scan(String doc);
    void fax(String doc);
}
