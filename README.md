# Wzorce projektowe I
Implementacja wzorca Builder, Factory i Singleton

## Wprowadzone modyfikacje

- w celu implementacji wzorca Singleton dla BombedMazeFactory i EnchantedMazeFactory zadeklarowaliśmy MazeFactory jako
  klase abstrakcyjną, ponieważ nie można zadeklarować konstruktora w klasie nadrzędnej jako prywatnego.
- obsługę poruszania się po labiryncie zaimplementowano w klasie MazeGame zamiast w klasie Player, ponieważ uznaliśmy, że
  to gra powinna odpowiadać za przemieszczanie się a nie obiekt reprezentujący gracza