//programa com interfaces de atleta, corredor, nadador e ciclitas. além de classes de pessoa e de triatleta que extende e implementa as outras.

package view;

import model.Triatleta;

public class Main {
    public static void main(String[] args) {

        Triatleta triatleta = new Triatleta("José", 20, "11.11.1");
        triatleta.aquecer();
        triatleta.correr();
        triatleta.pedalar();
        triatleta.nadar();
        System.out.println(triatleta.toString());

    }
}