import javax.print.Doc;

interface Document{
    void display();
}

class PdfDocument implements Document{
    String data;
    PdfDocument(String info){
        data = info;
    }
    @Override
    public void display() {
        System.out.println("Data Stored in this PDF Document is :\n" + this.data + "\n");
    }

}

class WordDocument implements Document{
    String data;
    WordDocument(String info){
        data = info;
    }
    @Override
    public void display() {
        System.out.println("Data Stored in this Word Document is :\n" + this.data + "\n");
    }

}

class ExcelDocument implements Document{
    String data;
    ExcelDocument(String info){
        data = info;
    }
    @Override
    public void display() {
        System.out.println("Data Stored in this Excel Document is :\n" + this.data + "\n");
    }

}


abstract class DocumentFactory{
    public abstract Document createDocument(String info);
}

class WordDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(String info) {
        return new WordDocument(info);
    }
}

class PdfDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(String info) {
        return new PdfDocument(info);
    }
}

class ExcelDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(String info) {
        return new ExcelDocument(info);
    }
}


public class FactoryMethodExample{
    public static void main(String[] args) {
        DocumentFactory factory = new WordDocumentFactory();
        Document wordDoc = factory.createDocument("This is a word document");
        wordDoc.display();

        factory = new PdfDocumentFactory();
        Document pdfDoc = factory.createDocument("This is a pdf document");
        pdfDoc.display();

        factory = new ExcelDocumentFactory();
        Document excelDoc = factory.createDocument("This is an excel document");
        excelDoc.display();
    }
}