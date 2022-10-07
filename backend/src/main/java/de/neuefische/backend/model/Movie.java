package de.neuefische.backend.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("movies")
public class Movie {

    @Id
    private String id;
    private String title;
    private String releaseYear;
    private String poster;
 }
