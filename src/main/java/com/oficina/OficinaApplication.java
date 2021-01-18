package com.oficina;

import com.oficina.Model.Agendamento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OficinaApplication {

	public static void main(String[] args) {
		Agendamento agendamento = new Agendamento();
		System.out.println(agendamento.getPaciente());
		SpringApplication.run(OficinaApplication.class, args);
	}

}
