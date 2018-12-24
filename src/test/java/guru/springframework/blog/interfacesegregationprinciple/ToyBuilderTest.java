package guru.springframework.blog.interfacesegregationprinciple;

import org.junit.Test;

/**
 * Created by dmitri on 2018-12-24
 */
public class ToyBuilderTest {
    @Test
    public void testBuildToyHouse() throws Exception {
        ToyHouse toyHouse=ToyBuilder.buildToyHouse();
        System.out.println(toyHouse);
    }
    @Test
    public void testBuildToyCar() throws Exception {
        ToyCar toyCar=ToyBuilder.buildToyCar();;
        System.out.println(toyCar);
    }
    @Test
    public void testBuildToyPlane() throws Exception {
        ToyPlane toyPlane=ToyBuilder.buildToyPlane();
        System.out.println(toyPlane);
    }
}
