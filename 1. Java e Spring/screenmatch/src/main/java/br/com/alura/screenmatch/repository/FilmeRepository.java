package br.com.alura.screenmatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.screenmatch.model.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long>{

}
