package Design_Patterns_and_Principles.Exercise_2_Factory_Method_Pattern;
public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening PDF Document");
    }
}