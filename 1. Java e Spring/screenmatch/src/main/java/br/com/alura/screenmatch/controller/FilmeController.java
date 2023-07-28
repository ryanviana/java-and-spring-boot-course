package br.com.alura.screenmatch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.screenmatch.model.DadosCadastroFilme;
import br.com.alura.screenmatch.model.Filme;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    private List<Filme> filmes = new ArrayList<>();

    @GetMapping
    public String carregaPaginaFormulario(){

        return "filmes/formulario";

    }

    @PostMapping
    public String cadastraFilme(DadosCadastroFilme dados)
    {
        var filme = new Filme(dados);
        filmes.add(filme);
        System.out.println(filmes);
        return "filmes/formulario";
    }

}
