package pl.akai.api.beer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface BeerRepository extends CrudRepository<Beer, Long> {

    List<Beer> findAll();

}
