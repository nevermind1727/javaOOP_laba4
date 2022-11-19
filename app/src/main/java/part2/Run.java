package part2;

public interface Run {
  abstract String getName();
  abstract int getMaxSpeed();
  abstract int getWeight();
  abstract void move(int id);
}