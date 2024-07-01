import java.awt.Color;

/**
 * An grayscale filter.
 * 
 * @author Lucas Yukio Fukuda Matsumoto
 * @version 1.0
 */
public class GrayscaleFilter extends Filter
{
    /**
     * Constructor for objects of class ThresholdFilter.
     * @param name The name of the filter.
     */
    public GrayscaleFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                Color color = image.getPixel(x, y);
                float gray = (color.getRed()+color.getGreen()+color.getBlue())/3.f;
                Color grayscale = new Color(gray, gray, gray);
                image.setPixel(x, y, grayscale);
            }
        }
    }
}
