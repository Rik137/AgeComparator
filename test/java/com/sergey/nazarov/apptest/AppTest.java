package com.sergey.nazarov.apptest;

import com.sergey.nazarov.app.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testPrintAgesDoesNotThrow() {
        assertDoesNotThrow(() -> App.printAges(10, 65, 34));
    }
}