package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        //to do implementation
        return new ResponseEntity<BeerDto>(BeerDto.builder().build(),HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<BeerDto> handlePost(@Validated @RequestBody BeerDto beerDto) {

       //to do Impl
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location","/api/v1/beer/"+UUID.randomUUID());
        return new ResponseEntity<BeerDto>(headers,HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> handlePut(@PathVariable("beerId") UUID beerId,@Validated @RequestBody BeerDto beerDto) {


        //to do impl
        return new ResponseEntity<BeerDto>(HttpStatus.NO_CONTENT);
    }
}
