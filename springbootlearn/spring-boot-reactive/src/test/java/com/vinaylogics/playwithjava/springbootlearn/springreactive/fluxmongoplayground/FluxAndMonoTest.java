package com.vinaylogics.playwithjava.springbootlearn.springreactive.fluxmongoplayground;


import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class FluxAndMonoTest {

    @Test
    public void fluxTest(){
      Flux<String> stringFlux  = Flux.just("Spring", "Spring Boot", "Reactive Stream")
              /*.concatWith(Flux.error(new RuntimeException("Exception Occurred")))*/
              .concatWith(Flux.just("After error"))
              .log();
      stringFlux.subscribe(System.out::println,
              (e) -> System.err.println(e),
              () -> System.out.println("Completed"));
    }

    @Test
    public void fluxTestElements_WithoutError(){
        Flux<String> stringFlux  = Flux.just("Spring", "Spring Boot", "Reactive Stream").log();

        StepVerifier
                .create(stringFlux)
                .expectNext("Spring")
                .expectNext("Spring Boot")
                .expectNext("Reactive Stream")
                .verifyComplete();
    }

    @Test
    public void fluxTestElements_WithError(){
        Flux<String> stringFlux  = Flux.just("Spring", "Spring Boot", "Reactive Stream")
                .concatWith(Flux.error(new RuntimeException("Exception Occurred")))
                .log();

        StepVerifier
                .create(stringFlux)
                .expectNext("Spring")
                .expectNext("Spring Boot")
                .expectNext("Reactive Stream")
                .verifyError();
        StepVerifier
                .create(stringFlux)
                .expectNext("Spring")
                .expectNext("Spring Boot")
                .expectNext("Reactive Stream")
                .expectError(RuntimeException.class)
                .verify();
        StepVerifier
                .create(stringFlux)
                .expectNext("Spring")
                .expectNext("Spring Boot")
                .expectNext("Reactive Stream")
                .expectErrorMessage("Exception Occurred")
                .verify();
    }

    @Test
    public void fluxTestElements_WithError2() {
        Flux<String> stringFlux  = Flux.just("Spring", "Spring Boot", "Reactive Stream")
                .concatWith(Flux.error(new RuntimeException("Exception Occurred")))
                .log();
        StepVerifier
                .create(stringFlux)
                .expectNext("Spring", "Spring Boot", "Reactive Stream")
                .expectErrorMessage("Exception Occurred")
                .verify();
    }

    @Test
    public void monoTest(){
       Mono<String>  stringMono = Mono.just("Spring");
       StepVerifier.create(stringMono.log())
               .expectNext("Spring")
               .verifyComplete();
    }

    @Test
    public void monoTest_Error(){
        StepVerifier.create(Mono.error(new RuntimeException("Exception Occurred")).log())
                .expectError(RuntimeException.class)
                .verify();
    }
}
