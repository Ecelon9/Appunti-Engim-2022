package com.example.esempioesametrasporti;

import com.example.esempioesametrasporti.model.repository.FermataRepository;
import com.example.esempioesametrasporti.model.repository.LineaRepository;
import com.example.esempioesametrasporti.model.repository.PreventivoRepository;

public class Debug {
    public static void main(String[] args) {
        System.out.println(FermataRepository.getFermate());
        System.out.println(LineaRepository.getLinee());
        System.out.println(PreventivoRepository.getPreventivi());
    }
}
