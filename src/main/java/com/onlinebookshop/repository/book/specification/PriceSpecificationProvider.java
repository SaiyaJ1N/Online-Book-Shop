package com.onlinebookshop.repository.book.specification;

import com.onlinebookshop.model.Book;
import com.onlinebookshop.repository.SpecificationProvider;
import java.util.Arrays;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class PriceSpecificationProvider implements SpecificationProvider<Book> {
    @Override
    public String getKey() {
        return "price";
    }

    public Specification<Book> getSpecification(String[] params) {
        return (root, query, criteriaBuilder) ->
                root.get("price").in(Arrays.stream(params).toArray());
    }
}
