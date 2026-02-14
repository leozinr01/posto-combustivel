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

    public void criar(BombasDeCombustivel bombasDeCombustivel){
        BombaDeCombustiveRepostory.save(bombasDeCombustivel);
    }
    public BombasDeCombustivel buscarBombaCombustivelPorId(Integer id){
        return (BombasDeCombustivel) bombaDeCombustiveRepostory.findById(id).orElseThrow(() ->
                new NullPointerException("Bomba de combustível não encontrada pelo id" + id));
    }

    private List<BombaDeCombustiveRepostory> buscarBombasDeCombustivel(){
        return bombaDeCombustiveRepostory.findAll();
    }

    private void deletarBombaCombustivel(Integer id){
        bombaDeCombustiveRepostory.deleteById(id);
    }

    private void alterarBombaCombustivel(BombasDeCombustivel bombasDeCombustivel){
        BombaDeCombustiveRepostory.save(bombasDeCombustivel);
    }

}
