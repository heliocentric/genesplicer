/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.genesplicer;

/**
 *
 * @author helio
 */
public class Genome {
    public Chromosome[] Mother;
    public Chromosome[] Father;
    public Chromosome[] Mitochondrial;
    public Genome() {
        this.Mother = new Chromosome[12];
        this.Father = new Chromosome[12];
        this.Mitochondrial = new Chromosome[6];
    }
}
