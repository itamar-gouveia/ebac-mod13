package com.company;

public class Main {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();

        pf.setNome("Itamar Gouveia");
        pf.setEmail("itbgouveia@gmail.com");
        pf.setTelefone("99163260");
        pf.setLinkedin("http://linkedin.com/itamar");
        pf.setCpf("04716653444");

        pj.setNome("Empresa");
        pj.setEmail("empresa@gmail.com");
        pj.setTelefone("33212525");
        pj.setLinkedin("http://linkedin.com/empresa");
        pj.setCnpj("16998445000142");


        System.out.println("Dados da Pessoa Física");
        System.out.println(pf.getNome());
        System.out.println(pf.getEmail());
        System.out.println(pf.getTelefone());
        System.out.println(pf.getLinkedin());
        System.out.println(pf.getCpf());


        System.out.println("Dados da Pessoa Juridica");
        System.out.println(pj.getNome());
        System.out.println(pj.getEmail());
        System.out.println(pj.getTelefone());
        System.out.println(pj.getLinkedin());
        System.out.println(pj.getCnpj());


    }
}
