package br.com.reflection;

import br.com.reflection.rfl.Transformator;

import java.lang.reflect.InvocationTargetException;

public class PessoaService {

    public PessoaDTO list() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Pessoa pessoa = new PessoaRepository().list();
        PessoaDTO pessoaDTO = new Transformator().transform(pessoa);
        //PessoaDTO pessoaDTO = new PessoaDTO(pessoa.getNome(), pessoa.getCpf());
        return pessoaDTO;
    }
}