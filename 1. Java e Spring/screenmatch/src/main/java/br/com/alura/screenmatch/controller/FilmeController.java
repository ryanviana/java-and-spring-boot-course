package br.com.alura.screenmatch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.screenmatch.model.DadosCadastroFilme;
import br.com.alura.screenmatch.model.Filme;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    @GetMapping
    public String carregaPaginaFormulario(){

        return "filmes/formulario";

    }

    @PostMapping
    public String cadastraFilme(DadosCadastroFilme dados)
    {
        var Filme = new Filme(dados);
        return "filmes/formulario";
    }

}
