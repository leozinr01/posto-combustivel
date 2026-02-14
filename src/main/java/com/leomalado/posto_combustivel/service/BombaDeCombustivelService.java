package com.leomalado.posto_combustivel.service;

import com.leomalado.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.leomalado.posto_combustivel.infrastructure.repositories.BombaDeCombustiveRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BombaDeCombustivelService {

    private final BombaDeCombustiveRepostory bombaDeCombustiveRepostory;

    public BombasDeCombustivel criar(BombasDeCombustivel bombasDeCombustivel){
        return bombaDeCombustiveRepostory.save(bombasDeCombustivel);
    }

    public BombasDeCombustivel buscarBombaCombustivelPorId(Integer id){
        return (BombasDeCombustivel) bombaDeCombustiveRepostory.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Bomba de combustível não encontrada pelo id " + id));
    }

    public List<BombasDeCombustivel> buscarBombasDeCombustivel(){
        return bombaDeCombustiveRepostory.findAll();
    }
}