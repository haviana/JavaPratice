package findduplicates;

import com.exercise.javapratice.findduplicates.FindDuplicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FindDuplicatesTest {


    @Test
    void if_has_duplicates_return_the_duplicates(){

        FindDuplicate  fd = new FindDuplicate();
        int[] aux = {1,2,3,5,5,5,4,4};
        int[] result = fd.getDuplicates(aux);

        Assertions.assertArrayEquals(result, new int[]{5,4});

    }

    @Test
    void if_has_no_duplicates_return_no_duplicates(){

        FindDuplicate  fd = new FindDuplicate();
        int[] aux = {1,2,3,5,4};
        int[] result = fd.getDuplicates(aux);

        Assertions.assertArrayEquals(result, new int[]{});

    }

    @Test
    void if_has_null_duplicates_return_an_empty_array(){

        FindDuplicate  fd = new FindDuplicate();
        int[] aux = {1,2,3,5,4};
        int[] result = fd.getDuplicates(null);

        Assertions.assertArrayEquals(result, new int[]{});

    }

}
