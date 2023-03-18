package com.target.exercicios.Exercicio3;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Exercicio3 {
    public static void main(String[] args) throws IOException {

    double maior = 0, menor = Double.MAX_VALUE, soma = 0, count = 0, media = 0;
    int diasAcimaMedia = 0;
    
        Faturamento faturamentoMes = new Faturamento();

        JSONParser jsonParser = new JSONParser();

        try(FileReader reader = new FileReader("./src/com/target/exercicios/Exercicio3/dados.json")){
            Object obj = jsonParser.parse(reader);

            JSONArray programadoresLista = (JSONArray) obj;  
            
            for (Object object : programadoresLista) { 
                faturamentoMes.setDia(parserProgramador((JSONObject)object));
                faturamentoMes.setValor(parserProgramador2((JSONObject)object));

                soma += faturamentoMes.getValor();

                if(faturamentoMes.getValor() != 0){
                    count++;
                }
               
                if(faturamentoMes.getValor() > maior){
                    maior = faturamentoMes.getValor();
                }
                
                if(faturamentoMes.getValor() < menor){
                    menor = faturamentoMes.getValor();
                }

                System.out.println(faturamentoMes);
            }

            media = soma / count;

            for (Object object : programadoresLista) {
                if(parserProgramador2((JSONObject)object) > media) diasAcimaMedia++;
            }

            System.out.println("O menor Faturamento é: " + menor);
            System.out.println("O maior Faturamento é: " + maior);    
            System.out.println("A média mensal é: " + media);        
            System.out.println("Total de dias que passaram da média mensal -> " + diasAcimaMedia);

        }catch (Exception e) {
            System.out.println(e);
        }  
    }

    private static int parserProgramador(JSONObject pProgramador){
        
        return Integer.parseInt(pProgramador.get("dia").toString());

    }

    private static double parserProgramador2(JSONObject pProgramador){

        return Double.parseDouble(pProgramador.get("valor").toString());

    }

}
