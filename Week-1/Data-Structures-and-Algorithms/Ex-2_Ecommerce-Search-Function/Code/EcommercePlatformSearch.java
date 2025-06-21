import java.util.Arrays;
import java.util.Random;

class Product{
    int productId;
    String productName;
    String category;

    Product(int pId, String pName, String category){
        this.productId = pId;
        this.productName = pName;
        this.category = category;
    }

    public void display(){
        System.out.println("Product ID : " + productId + "  Product Name : " + productName + "  Category : "+category);
    }
}

class SearchAlgorithms{
    static boolean LinearSearch(Product[] products, int size, int key){
        for(int i=0; i<size; ++i){
            if(products[i].productId == key){
                return true;
            }
        }
        return false;
    }

    static boolean BinarySearch(Product[] products, int size, int key){
        int low = 0, high = size -1, mid;

        while(low <= high){
            mid = low + (high - low)/2;

            if(products[mid].productId < key) low = mid + 1;
            else if(products[mid].productId > key) high = mid - 1;
            else return true;
        }
        return false;
    }
}

public class EcommercePlatformSearch {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int productListSize = 10;
        Product[] productsList = new Product[productListSize];
        String[] categories = {"Electronics","Basics","Clothes","Essentials","Medical"};

        for(int i=0;i<10;++i){
            int pId = 1000 + randomGenerator.nextInt(100);
            String pName = "P-"+pId;
            int cIdx = randomGenerator.nextInt(5);
            productsList[i] = new Product(pId,pName, categories[cIdx]);
        }

        System.out.println("Product List : ");
        for(Product p : productsList){
            p.display();
        }
        System.out.println("\n");

        int randomIndex = randomGenerator.nextInt(productListSize);
        int key = productsList[randomIndex].productId;
        boolean linearSearchResult = SearchAlgorithms.LinearSearch(productsList, productListSize, key);
        System.out.println("Linear Search : ");
        System.out.println("The key " + key + " is " + (linearSearchResult ? " " : "not ") + "present in the list of products\n");
        key = 10000;
        linearSearchResult = SearchAlgorithms.BinarySearch(productsList, productListSize, key);
        System.out.println("The key " + key + " is " + (linearSearchResult ? " " : "not ") + "present in the list of products\n\n");


        randomIndex = randomGenerator.nextInt(productListSize);
        key = productsList[randomIndex].productId;
        Product[] sortedProductList = Arrays.copyOf(productsList, productListSize);
        Arrays.sort(sortedProductList, (p1, p2) -> Integer.compare(p1.productId, p2.productId));
        System.out.println("Sorted Product List : ");
        for(Product p : sortedProductList){
            p.display();
        }
        System.out.println("\n");
        System.out.println("Binary Search : ");
        boolean binarySearchResult = SearchAlgorithms.BinarySearch(sortedProductList, productListSize, key);
        System.out.println("The key " + key + " is " + (binarySearchResult ? " " : "not ") + "present in the list of products\n");
        key = 10000;
        binarySearchResult = SearchAlgorithms.BinarySearch(sortedProductList, productListSize, key);
        System.out.println("The key " + key + " is " + (binarySearchResult ? " " : "not ") + "present in the list of products\n\n");

    }
}
