# Stream API

### [Module java.base]()

### [Package java.util.stream]()

### [Interface Stream<T>]()

```java
public interface Stream<T> extends BaseStream<T, Stream<T>>
```

```java
int sum = widgets.stream()
        .filter(w -> w.getColor() == RED)
        .mapToInt(w -> w.getWeight())
        .sum();
```
