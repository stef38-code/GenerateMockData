package org.generate.mock.uuid;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @see https://medium.com/javarevisited/how-to-generate-mock-data-in-java-ff3b5f66f167
 */
public class UuidGenerator {

    private static Supplier<UUID> supplier= UUID::randomUUID;

    private UuidGenerator() {
        throw new UnsupportedOperationException("UuidGenerator is a utility class and cannot be instantiated");
    }
    /**
     * Orginal article
     */
    private static void streamGenerate(){
        Stream<UUID> generate = Stream.generate(supplier);
        generate.forEach(System.out::println);
    }
    public static List<UUID> getList(int limit){
        Stream<UUID> generate = Stream.generate(supplier);
        return generate.limit(limit).collect(Collectors.toList());
    }
    public static List<String> getStringList(int limit){
        Stream<UUID> generate = Stream.generate(supplier);
        return generate.limit(limit).map(UUID::toString ).collect(Collectors.toList());
    }
    public static List<String> getStringList(int limit,String replaceDashLess){
        Stream<UUID> generate = Stream.generate(supplier);
        return generate.limit(limit).map(uuid -> uuid.toString().replace("-", replaceDashLess) ).collect(Collectors.toList());
    }
}
