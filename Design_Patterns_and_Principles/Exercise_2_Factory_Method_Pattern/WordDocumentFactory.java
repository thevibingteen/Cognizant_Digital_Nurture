package Design_Patterns_and_Principles.Exercise_2_Factory_Method_Pattern;
public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}