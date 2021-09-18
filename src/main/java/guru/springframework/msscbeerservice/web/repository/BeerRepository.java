package guru.springframework.msscbeerservice.web.repository;

import guru.springframework.msscbeerservice.web.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository <Beer, UUID> {
}
