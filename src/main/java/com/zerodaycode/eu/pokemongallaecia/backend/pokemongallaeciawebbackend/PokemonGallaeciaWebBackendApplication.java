package com.zerodaycode.eu.pokemongallaecia.backend.pokemongallaeciawebbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zerodaycode.eu.pokemongallaecia.backend.pokemongallaeciawebbackend.data.GameCity;
import com.zerodaycode.eu.pokemongallaecia.backend.pokemongallaeciawebbackend.utils.Networking;
import com.zerodaycode.eu.pokemongallaecia.backend.pokemongallaeciawebbackend.utils.OpenWeatherInformation;

@SpringBootApplication
public class PokemonGallaeciaWebBackendApplication {

	// Flag to control when Spring should call the external Rest API's
	private final static Boolean RETRIEVED_EXTERNAL_DATA = true;  

	public static void main(String[] args) throws Exception {
		SpringApplication.run(PokemonGallaeciaWebBackendApplication.class, args);

		if (!RETRIEVED_EXTERNAL_DATA) {
			// External Rest API' data logic here
			OpenWeatherInformation wInformation = new OpenWeatherInformation();
			wInformation.getCityWeather(GameCity.SANTIAGO_DE_COMPOSTELA);
		}
	}

}
 