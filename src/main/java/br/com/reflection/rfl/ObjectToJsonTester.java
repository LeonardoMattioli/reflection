package br.com.reflection.rfl;

import br.com.reflection.Pessoa;

public class ObjectToJsonTester {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(1, "João", "1234");
        ObjectToJson objectToJson = new ObjectToJson();
        System.out.println(objectToJson.transform(pessoa));
    }
}
