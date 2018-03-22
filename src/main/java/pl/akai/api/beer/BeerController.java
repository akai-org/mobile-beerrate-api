package pl.akai.api.beer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/")
class BeerController {

    private BeerRepository beerRepository;


    BeerController(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @GetMapping("beer")
    public List<Beer> getAllBeers() {
        return beerRepository.findAll();
    }

    @GetMapping("beer/{id}")
    public Beer getBeerById(@PathVariable long id) {
        return beerRepository.findOne(id);
    }

    @PostMapping("beer")
    public void createBeer(@RequestBody Beer beer) {
        beerRepository.save(beer);
    }

}
