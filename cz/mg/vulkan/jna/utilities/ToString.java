package cz.mg.vulkan.jna.utilities;

import com.sun.jna.Native;
import cz.mg.vulkan.jna.types.VkBool32;
import cz.mg.vulkan.jna.types.uint32_t;
import cz.mg.vulkan.jna.types.uint8_t;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import static cz.mg.vulkan.jna.Vk.*;


public class ToString {
    public static String constantToString(int value, Class c){
        if(c.getName().endsWith("$ByValue") || c.getName().endsWith("$ByReference")) c = c.getSuperclass();
        for(Field field : c.getDeclaredFields()){
            if(Modifier.isStatic(field.getModifiers())){
                if(field.getType() == int.class){
                    try {
                        if(field.getInt(null) == value) return field.getName();
                    } catch (ReflectiveOperationException e) {
                        throw new RuntimeException(e.getClass().getSimpleName() + ": " + e.getMessage());
                    }
                }
            }
        }
        return "" + value;
    }

    public static String flagsToString(int value, Class c){
        if(value == 0) return "(" + value + ")";
        String s = flagsToStringSimple(value, c);
        if(s.length() == 0) s = "?";
        return s + " (0x" + Integer.toHexString(value) + ")";
    }

    public static String flagsToStringNoLabels(int value, Class c){
        if(value == 0) return "(" + value + ")";
        String s = flagsToStringSimple(value, c);
        if(s.length() == 0) s = "?";
        ToString.replaceLast(ToString.replaceLast(ToString.replaceFirst(s, "VK_", ""), "_EXT", ""), "_KHR", "");
        return s + " (0x" + Integer.toHexString(value) + ")";
    }

    public static String flagsToStringSimple(int value, Class c){
        if(value == 0) return "";
        if(c.getName().endsWith("$ByValue") || c.getName().endsWith("$ByReference")) c = c.getSuperclass();
        String s = "";
        for(Field field : c.getDeclaredFields()){
            if(Modifier.isStatic(field.getModifiers())){
                if(field.getType() == int.class){
                    try {
                        if((field.getInt(null) & value) != 0){
                            s = s + field.getName() + ", ";
                        }
                    } catch (ReflectiveOperationException e) {
                        throw new RuntimeException(e.getClass().getSimpleName() + ": " + e.getMessage());
                    }
                }
            }
        }
        if(s.endsWith(", ")) s = replaceLast(s, ", ", "");
        return s;
    }

    public static String vendorToString(uint32_t value){
        switch(value.intValue()){
            case 0x1002: return "AMD";
            case 0x10DE: return "NVIDIA";
            case 0x13B5: return "ARM";
            case 0x5143: return "QUALCOMM";
            case 0x8086: return "INTEL";
            default: return "" + value;
        }
    }

    public static String versionToString(uint32_t value){
        return VK_VERSION_MAJOR(value) + "." + VK_VERSION_MINOR(value) + "." + VK_VERSION_PATCH(value);
    }

    public static String textToString(byte[] bytes){
        return Native.toString(bytes);
    }

    public static String byteToHexString(int value){
        return String.format("%02x", Byte.toUnsignedInt((byte)value));
    }

    public static String bytesToHexString(uint8_t[] values){
        String s = "";
        for(int i = 0; i < values.length; i++){
            s = s + byteToHexString(values[i].byteValue());
            if(i != values.length - 1) s = s + " ";
        }
        return s;
    }

    public static String bytesToHexString(byte[] values){
        String s = "";
        for(int i = 0; i < values.length; i++){
            s = s + byteToHexString(values[i]);
            if(i != values.length - 1) s = s + " ";
        }
        return s;
    }

    public static String booleanToString(VkBool32 value){
        switch(value.intValue()){
            case VK_TRUE: return "true";
            case VK_FALSE: return "false";
            default: return "" + value;
        }
    }

    public static String replaceFirst(String s, String what, String with){
        return s.replaceFirst(what, with);
    }

    public static String replaceLast(String s, String what, String with){
        s = reverse(s);
        what = reverse(what);
        with = reverse(with);
        s = s.replaceFirst(what, with);
        return reverse(s);
    }

    private static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
