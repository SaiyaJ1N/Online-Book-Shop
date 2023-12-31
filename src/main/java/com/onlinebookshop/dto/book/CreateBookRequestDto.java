package com.onlinebookshop.dto.book;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Set;
import lombok.Data;
import org.hibernate.validator.constraints.ISBN;

@Data
public class CreateBookRequestDto {
    @NotNull
    @Size(min = 1, max = 100)
    private String title;
    @NotNull
    @Size(min = 1, max = 100)
    private String author;
    @NotNull
    @ISBN
    private String isbn;
    @NotNull
    @Min(0)
    private BigDecimal price;
    private Set<Long> categoriesId;
    private String description;
    private String coverImage;
}
