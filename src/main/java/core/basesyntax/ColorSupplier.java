package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
      public Color getRandomColor() {
          Color[] values = Color.values();
          return values[random.nextInt(values.length)];
    }
}
