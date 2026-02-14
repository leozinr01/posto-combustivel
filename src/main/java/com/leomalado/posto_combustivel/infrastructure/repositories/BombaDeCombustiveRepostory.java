package com.leomalado.posto_combustivel.infrastructure.repositories;

import com.leomalado.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.leomalado.posto_combustivel.infrastructure.entities.TiposDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BombaDeCombustiveRepostory extends JpaRepository<BombasDeCombustivel, Integer> {
}