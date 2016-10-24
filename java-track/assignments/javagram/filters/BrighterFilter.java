package javagram.filters;

import java.awt.Color;

import javagram.Picture;

public class BrighterFilter extends Filter {
	public BrighterFilter(){
		this.name="Brighter Filter";
	}

	public int makeBrighter(int i){
		if(i<225){
			return i+30;
		}
		else {
			return 255;
		}
	}
	
	public Picture process(Picture original) {

		Picture processed = new Picture(original.width(), original.height());

		//get each pixel one by one

		for (int i = 0; i < original.width(); i++) {
			for (int j = 0; j < original.height(); j++) {

				Color c = original.get(i, j);

				//get color components from each pixel
				int r = c.getRed();
				int g = c.getGreen();
				int b = c.getBlue();
				
				//brighten colors by 30
				int newRed = makeBrighter(r);
				int newGreen = makeBrighter(g);
				int newBlue = makeBrighter(b);

				processed.set(i, j, new Color(newRed, newGreen, newBlue));

			}
		}

		return processed;
	}
}
