package guru.springframework.msscbeerservice.web.bootstrap;

import guru.springframework.msscbeerservice.web.domain.Beer;
import guru.springframework.msscbeerservice.web.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        loadBeerObjects();

    }

    private void loadBeerObjects() {

        if (beerRepository.count()==0){
            beerRepository.save(Beer.builder()
                    .id(UUID.randomUUID())
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(BEER_1_UPC)
                    .price(new BigDecimal("12.9544"))
                    .build());

            beerRepository.save(Beer.builder()
                    .id(UUID.randomUUID())
                    .beerName("Kingfisher")
                    .beerStyle("PALE_ELE")
                    .quantityToBrew(200)
                    .minOnHand(10)
                    .upc(BEER_2_UPC)
                    .price(new BigDecimal("10.98"))
                    .build());
        }

        System.out.println("Count is ::" + beerRepository.count());
    }
}
