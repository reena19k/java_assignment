package com.aurionpro.model;
import com.aurionpro.test.*;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Reflection {
    public static void main(String[] args) {
        String name;
        name = args[0];
        try {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0)
                System.out.print(modifiers + " ");
            System.out.print("class " + name);
            if (supercl != null && supercl != Object.class)
                System.out.print(" extends " + supercl.getName());
            System.out.print("\n{\n");
            ReflectionTest obj = new ReflectionTest();
            System.out.println("Methods");
            obj.printMethods(cl);
            System.out.println();
            System.out.println("Fields");
            obj.printFields(cl);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

}
