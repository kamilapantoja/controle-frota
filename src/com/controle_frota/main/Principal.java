package com.controle_frota.main;

import com.controle_frota.core.*;

public class Principal {

  public static void main(String[] args) {
    Carro c1 = new Carro("RTF 1234", 2018);
    Caminhao c2 = new Caminhao("TRR 3214", 2015);
    
    c1.abastecer("Posto 1", "Atanes", 180);
    c1.abastecer("Posto 2", "Adriana", 230);
    c1.abastecer("Posto 1", "Marcelo", 200);
    
    c2.abastecer(null, "Atanes", 210);
    c2.abastecer(null, "Adriana", 220);
    c2.abastecer(null, "Marcelo", 310);
    
    c1.listaAbastecimento();
    c2.listaAbastecimento();
  }

}
