package reflect;

import java.lang.reflect.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;

public class Homework1 {

    /**
     * Prints the declared methods of java.lang.String sorted by name.
     */
    public void streamPipeline1() {
        Arrays.stream(java.lang.String.class.getMethods()).sorted(Comparator.comparing(m -> m.getName())).forEach(System.out::println);

    }

    /**
     *  Prints all distinct names of the declared methods of java.lang.String sorted alphabetically.
     */
    public void streamPipeline2() {
        Arrays.stream(java.lang.String.class.getMethods()).sorted(Comparator.comparing(m -> m.getName())).map(m -> m.getName()).distinct().forEach(System.out::println);
    }

    /**
     * Prints the declared methods of java.lang.String with two or more parameters whose parameters are all of the same type, sorted by name.
     */
    public void streamPipeline3() {
        // TODO
    }

    /**
     * Prints all distinct return types of the declared methods of java.lang.String sorted alphabetically.
     */
    public void streamPipeline4() {
        Arrays.stream(java.lang.String.class.getMethods()).map(t -> t.getReturnType()).distinct().sorted(Comparator.comparing(t -> t.getName())).forEach(System.out::println);
    }

    /**
     * Prints the declared methods of java.lang.String with at least one boolean parameter, sorted by name.
     */
    public void streamPipeline5() {
        Arrays.stream(java.lang.String.class.getMethods()).filter(c -> Arrays.stream(c.getParameterTypes()).anyMatch(p -> p == boolean.class)).sorted(Comparator.comparing(c -> 			    		c.getName())).forEach(System.out::println);
    }

    /**
     * Prints the declared methods of java.lang.String whose parameters are all of type int, sorted by name.
     */
    public void streamPipeline6() {
        Arrays.stream(java.lang.String.class.getMethods()).filter(c -> Arrays.stream(c.getParameterTypes()).allMatch(p -> p == int.class) && c.getParameterCount() != 0).sorted(Comparator.comparing(c -> 		c.getName())).forEach(System.out::println);
    }

    /**
     * Returns the longest name of the declared methods of java.lang.String.
     */
    public String streamPipeline7() {
        
        return Arrays.stream(java.lang.String.class.getMethods()).map(s -> s.getName()).max(Comparator.comparingInt(n -> n.length())).get();
    }

    /**
     *  Returns the longest one from the names of the public declared methods of java.lang.String.
     */
    public String streamPipeline8() {
        return Arrays.stream(java.lang.String.class.getMethods()).filter(s -> s.getModifiers() == java.lang.reflect.Modifier.PUBLIC).map(s -> s.getName()).max(Comparator.comparingInt(s -> 		 		s.length())).get();
    }

    /**
     * Returns summary statistics about the number of parameters for the declared methods of java.lang.String.
     */
    public IntSummaryStatistics streamPipeline9() {
        
        return Arrays.stream(java.lang.String.class.getMethods()).mapToInt(s -> s.getParameterCount()).summaryStatistics();
    }

    /**
     * Returns the maximum number of parameters accepted by the declared methods of java.lang.String.
     */
    public int streamPipeline10() {
        return Arrays.stream(java.lang.String.class.getMethods()).mapToInt(s -> s.getParameterCount()).max().getAsInt();
    }

    /**
     * Returns the declared method of java.lang.String with the most number of parameters.
     */
    public Method streamPipeline11() {
        return Arrays.stream(java.lang.String.class.getMethods()).max(Comparator.comparingInt(s -> s.getParameterCount())).get();
    }

    /**
     * Prints all distinct parameter types of the declared methods of java.lang.String sorted alphabetically.
     */
    public void streamPipeline12() {
        // TODO
    }

}
