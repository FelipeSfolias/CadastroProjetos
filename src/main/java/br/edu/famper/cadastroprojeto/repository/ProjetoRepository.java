package br.edu.famper.cadastroprojeto.repository;

import br.edu.famper.cadastroprojeto.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
