package javagram.filters;

import java.awt.Color;

import javagram.Picture;

public class FlipHorizFilter extends Filter{
	public FlipHorizFilter(){
		this.name="Filp Horizontal Filter";
	}

	public Picture process(Picture original) {

		Picture processed = new Picture(original.width(), original.height());

		for (int x = 0; x < original.width(); x++) {
			for (int y = 0; y < original.height(); y++) {
				int otherX = original.width() - 1 - x;  // otherX is the mirror of x
				Color c = original.get(otherX, y);      // get the Color at the mirror point of the source
				processed.set(x, y, c);                  // and set it at x,y in the target
			}
		}
		return processed;
	}
}
