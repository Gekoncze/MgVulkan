package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import java.util.Arrays;
import java.util.List;
import cz.mg.vulkan.jna.types.*;
import cz.mg.vulkan.jna.structures.*;
import cz.mg.vulkan.jna.flags.*;
import cz.mg.vulkan.jna.enums.*;


/**
 *  typedef struct VkDebugUtilsLabelEXT {
 *      VkStructureType    sType;
 *      const void*        pNext;
 *      const char*        pLabelName;
 *      float              color[4];
 *  } VkDebugUtilsLabelEXT;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsLabelEXT.html">khronos documentation</a>
 **/
public class VkDebugUtilsLabelEXT extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public byte[] pLabelName;
    public float[] color = new float[4];

    public VkDebugUtilsLabelEXT() {
    }

    public VkDebugUtilsLabelEXT(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "pLabelName",
                "color[4]"
        });
    }

    public ByReference byReference(boolean write, boolean read){
        if(write) write();
        ByReference reference = new ByReference(getPointer());
        if(read) reference.read();
        return reference;
    }

    public ByValue byValue(boolean write, boolean read){
        if(write) write();
        ByValue value = new ByValue(getPointer());
        if(read) value.read();
        return value;
    }

    public static class ByReference extends VkDebugUtilsLabelEXT implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkDebugUtilsLabelEXT implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
