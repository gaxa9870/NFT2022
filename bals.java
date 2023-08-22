 /*
     * @(#)Blah.java        1.82 99/03/18
     *
     * Copyright (c) 1994-1999 Sun Microsystems, Inc.
     * 901 San Antonio Road, Palo Alto, California, 94303, U.S.A.
     * All rights reserved.
     *
     * This software is the confidential and proprietary information of Sun
     * Microsystems, Inc. ("Confidential Information").  You shall not
     * disclose such Confidential Information and shall use it only in
     * accordance with the terms of the license agreement you entered into
     * with Sun.
     */


    package java.blah;

    import java.blah.blahdy.BlahBlah;

    /**
     * Class description goes here.
     *
     * @version 1.82 18 Mar 1999
     * @author Firstname Lastname
     */
    public class Blah extends SomeClass {
        /* A class implementation comment can go here. */

        /** classVar1 documentation comment */
        public static int classVar1;

        /**
         * classVar2 documentation comment that happens to be
         * more than one line long
         */
        private static Object classVar2;

        /** instanceVar1 documentation comment */
        public Object instanceVar1;

        /** instanceVar2 documentation comment */
        protected int instanceVar2;

        /** instanceVar3 documentation comment */
        private Object[] instanceVar3;

        /** 
         * ...constructor Blah documentation comment...
         */
        public Blah() {
            // ...implementation goes here...
        }

        /**
         * ...method doSomething documentation comment...
         */
        public void doSomething() {
            // ...implementation goes here...
        }

        /**
         * ...method doSomethingElse documentation comment...
         * @param someParam description
         */
        public void doSomethingElse(Object someParam) {
            // ...implementation goes here...
        }
