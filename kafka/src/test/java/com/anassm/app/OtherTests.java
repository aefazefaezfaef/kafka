//package com.anassm.app;
//
//import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.Spy;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.eq;
//import static org.mockito.BDDMockito.*;
//import static org.mockito.Mockito.*;
//
////@ExtendWith(SpringExtension.class)
//public class OtherTests {
//
//    @Mock
//    private List<String> myList;
//    @Mock
//    private List<String> list2;
//    @Spy
//    private List<String> realList = new ArrayList<>();
//
//    @BeforeAll
//    static void setUpBeforeClass() throws Exception {
//        System.out.println("Before Class");
//    }
//
//    @BeforeEach
//    void setUp() throws Exception {
//        System.out.println("before each");
//    }
//
//    @Test
//    @Order(1)
//    @DisplayName("my test")
//    void test_all_them_assertions() {
//        String m = "wrong";
//        Assertions.assertTrue(true, m);
//    }
//
//    @Test
//    @Order(3)
//    @DisplayName("my test2")
//    void test_it_bddmockito() {
//        int i = 23421;
////        given(service.m(i)).willReturn("number : " + i);
////        willThrow(new RuntimeException())
////                .given(restController)
////                .patch(eq(i));
////
////        try {
////            restController.patch(i);
////            fail("Should throw exception");
////        } catch (RuntimeException ignored) {
////        }
////
////        then(service)
////                .should(never())
////                .m(i);
//    }
//
//    @Order(2)
//    @Test
//    void test2() {
//        assertEquals(0, myList.size());
//        when(myList.size()).thenReturn(10);
//        assertEquals(10, myList.size());
//        assertNotEquals(0, myList.size());
//        myList.add("p");
//        myList.add("o");
//    }
//
//    @Test
//    void test3() {
//        list2.add("aaa");
//        when(list2.size()).thenReturn(1);
//        verify(list2).add("aaa");
//        System.out.println(list2.size() + "----");
//    }
//
//    @Test
//    void test4() {
//        realList.add("@");
//        verify(realList).add("@");
//        assertEquals(1, realList.size());
//        assertEquals("@", realList.getFirst());
//        realList.add(1, "ç");
//        verify(realList).add(1, "ç");
//        assertEquals("ç", realList.get(1));
//        doReturn("ççç").when(realList).get(1);
//        assertEquals("ççç", realList.get(1));
//
//        doAnswer(invocation -> 1).when(myList).get(0);
//    }
//
//    @AfterEach
//    void tearDown() throws Exception {
//
//    }
//
//    @AfterAll
//    static void tearDownAfterClass() throws Exception {
//    }
//}