package dk.si.groupproject1.webservice.rest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TownAndCity {
    private String town;
    private String country;
}
