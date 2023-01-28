package com.plantuml.wasm;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Run1 {

	public static void main(String[] args) throws IOException {
		System.err.println("Starting Run1");
		final BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
		final String filename = args[0];
		final File file = new File(filename);
		System.err.println(file.getAbsolutePath());
		final FileOutputStream fos = new FileOutputStream(file);
		ImageIO.write(img, "png", fos);
		fos.close();
	}

}
