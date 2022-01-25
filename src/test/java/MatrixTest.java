package test.java;

import main.java.Matrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @ParameterizedTest
    @CsvSource({"5,5", "10,20", "9384,12384"})
    void getWidth_OK(int width, int height) {
        Matrix m = new Matrix(width, height);
        Assertions.assertEquals(width, m.getWidth());
    }


    @ParameterizedTest
    @CsvSource({"5,5", "10,20", "9384,12384"})
    void getHeight(int width,int height) {
        Matrix m= new Matrix(width,height);
        Assertions.assertEquals(10, m.getHeight());
    }

    @Test
    void fill() {
    }

    @Test
    void count() {
    }

    @Test
    void found() {
    }

 /*   @Test
    void toString() {
    }*/
}