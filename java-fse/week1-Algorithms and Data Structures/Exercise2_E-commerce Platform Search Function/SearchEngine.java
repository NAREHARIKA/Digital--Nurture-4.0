import java.util.*;

public class SearchEngine {
    private Map<String, Set<Integer>> index = new HashMap<>();
    private Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getId(), product);
        indexProduct(product);
    }

    private void indexProduct(Product product) {
        String[] tokens = product.getSearchableText().split("\\W+");
        for (String token : tokens) {
            index.computeIfAbsent(token, k -> new HashSet<>()).add(product.getId());
        }
    }

    public List<Product> search(String keyword) {
        keyword = keyword.toLowerCase();
        Set<Integer> productIds = index.getOrDefault(keyword, Collections.emptySet());
        List<Product> result = new ArrayList<>();
        for (int id : productIds) {
            result.add(products.get(id));
        }
        return result;
    }
}