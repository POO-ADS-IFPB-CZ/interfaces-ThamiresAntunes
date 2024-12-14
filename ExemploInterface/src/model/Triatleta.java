package model;

public class Triatleta extends Pessoa implements Nadador, Corredor, Ciclista {
    public Triatleta(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    public void aquecer(){
        System.out.println(this.getNome() + " esta aquecendo...");
    }

    @Override
    public void nadar(){
        System.out.println(this.getNome() + " esta nadando!");
    }

    @Override
    public void correr(){
        System.out.println(this.getNome() + " esta correndo!");
    }

    @Override
    public void pedalar(){
        System.out.println(this.getNome() + " esta pedalando!");
    }
}
