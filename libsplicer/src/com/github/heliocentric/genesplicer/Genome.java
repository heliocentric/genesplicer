/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.genesplicer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import nu.xom.*;

/**
 *
 * @author helio
 */
public class Genome {

	public Chromosome[] Mother;
	public Chromosome[] Father;
	public Chromosome[] Mitochondrial;
	public Document Root;
	public File File;

	public Genome() {
	}

	public void New() {
	}

	public int Open(File file) {
		return 0;
	}
	public int Save() {
		return this.SaveAs(this.File);
	}

	public int SaveAs(File File) {
		this.File = File;
		
		try {
			Serializer serializer = new Serializer(new FileOutputStream(this.File), "UTF-8");
			serializer.setIndent(4);
			serializer.setMaxLength(64);
			serializer.write(this.Root);
		} catch (IOException ex) {
			System.err.println(ex);
		}
		return 0;
	}
}
