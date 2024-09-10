package br.edu.famper.cadastroprojeto.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name="tbl_projeto")
@Data

public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "projeto_id")
    private Long codigo;
    @Column(nullable = false,name = "Nome", length = 75)
    private String nome;
    @Column(name = "Descrição", length = 200)
    private String descricao;
    @Column(nullable = false,name = "DataInício")
    private LocalDate dataInicio;
    @Column(name = "DataFim")
    private LocalDate dataFim;
}

